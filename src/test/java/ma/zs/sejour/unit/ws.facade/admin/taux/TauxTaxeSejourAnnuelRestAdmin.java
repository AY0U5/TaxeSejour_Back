package ma.zs.sejour.unit.ws.facade.admin.taux;

import ma.zs.sejour.bean.core.taux.TauxTaxeSejourAnnuel;
import ma.zs.sejour.service.impl.admin.taux.TauxTaxeSejourAnnuelAdminServiceImpl;
import ma.zs.sejour.ws.converter.taux.TauxTaxeSejourAnnuelConverter;
import ma.zs.sejour.ws.dto.taux.TauxTaxeSejourAnnuelDto;
import ma.zs.sejour.ws.facade.admin.taux.TauxTaxeSejourAnnuelRestAdmin;
import org.aspectj.lang.annotation.Before;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TauxTaxeSejourAnnuelRestAdmin {

    private MockMvc mockMvc;

    @Mock
    private TauxTaxeSejourAnnuelAdminServiceImpl service;
    @Mock
    private TauxTaxeSejourAnnuelConverter converter;

    @InjectMocks
    private TauxTaxeSejourAnnuelRestAdmin controller;

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }


    @Test
    public void itShouldFindAllTauxTaxeSejourAnnuelTest() throws Exception {
        // Mock the service to return an empty list
        when(service.findAll()).thenReturn(Collections.emptyList());
        when(converter.toDto(Collections.emptyList())).thenReturn(Collections.emptyList());

        // Call the controller method
        ResponseEntity<List<TauxTaxeSejourAnnuelDto>> result = controller.findAll();

        // Verify the result
        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());

        // Response body should be empty list
        List<TauxTaxeSejourAnnuelDto> responseBody = result.getBody();
        assertNotNull(responseBody);
        assertEquals(0, responseBody.size());
    }

    @Test
    public void itShouldSaveTauxTaxeSejourAnnuelTest() throws Exception {
        // Mock data
        TauxTaxeSejourAnnuelDto requestDto = new TauxTaxeSejourAnnuelDto();
        TauxTaxeSejourAnnuel entity = new TauxTaxeSejourAnnuel();
        TauxTaxeSejourAnnuel saved = new TauxTaxeSejourAnnuel();
        TauxTaxeSejourAnnuelDto savedDto = new TauxTaxeSejourAnnuelDto();

        // Mock the converter to return the tauxTaxeSejourAnnuel object when converting from DTO
        when(converter.toItem(requestDto)).thenReturn(entity);

        // Mock the service to return the saved client
        when(service.create(entity)).thenReturn(saved);

        // Mock the converter to return the saved tauxTaxeSejourAnnuel DTO
        when(converter.toDto(saved)).thenReturn(savedDto);

        // Call the controller method
        ResponseEntity<TauxTaxeSejourAnnuelDto> result = controller.save(requestDto);

        // Verify the result
        assertEquals(HttpStatus.CREATED, result.getStatusCode());

        // Verify the response body
        TauxTaxeSejourAnnuelDto responseBody = result.getBody();
        assertNotNull(responseBody);

        // Add assertions to compare the response body with the saved tauxTaxeSejourAnnuel DTO
        assertEquals(savedDto.getCategorieSejourCode(), responseBody.getCategorieSejourCode());
        assertEquals(savedDto.getMontantNuit(), responseBody.getMontantNuit());
        assertEquals(savedDto.getPourcentagePremierMoisRetard(), responseBody.getPourcentagePremierMoisRetard());
        assertEquals(savedDto.getPourcentageAutreMoisRetard(), responseBody.getPourcentageAutreMoisRetard());
        assertEquals(savedDto.getEmploye(), responseBody.getEmploye());
    }

}
