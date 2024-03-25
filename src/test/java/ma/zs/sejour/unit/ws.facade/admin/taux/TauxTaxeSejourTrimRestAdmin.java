package ma.zs.sejour.unit.ws.facade.admin.taux;

import ma.zs.sejour.bean.core.taux.TauxTaxeSejourTrim;
import ma.zs.sejour.service.impl.admin.taux.TauxTaxeSejourTrimAdminServiceImpl;
import ma.zs.sejour.ws.converter.taux.TauxTaxeSejourTrimConverter;
import ma.zs.sejour.ws.dto.taux.TauxTaxeSejourTrimDto;
import ma.zs.sejour.ws.facade.admin.taux.TauxTaxeSejourTrimRestAdmin;
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
public class TauxTaxeSejourTrimRestAdmin {

    private MockMvc mockMvc;

    @Mock
    private TauxTaxeSejourTrimAdminServiceImpl service;
    @Mock
    private TauxTaxeSejourTrimConverter converter;

    @InjectMocks
    private TauxTaxeSejourTrimRestAdmin controller;

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }


    @Test
    public void itShouldFindAllTauxTaxeSejourTrimTest() throws Exception {
        // Mock the service to return an empty list
        when(service.findAll()).thenReturn(Collections.emptyList());
        when(converter.toDto(Collections.emptyList())).thenReturn(Collections.emptyList());

        // Call the controller method
        ResponseEntity<List<TauxTaxeSejourTrimDto>> result = controller.findAll();

        // Verify the result
        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());

        // Response body should be empty list
        List<TauxTaxeSejourTrimDto> responseBody = result.getBody();
        assertNotNull(responseBody);
        assertEquals(0, responseBody.size());
    }

    @Test
    public void itShouldSaveTauxTaxeSejourTrimTest() throws Exception {
        // Mock data
        TauxTaxeSejourTrimDto requestDto = new TauxTaxeSejourTrimDto();
        TauxTaxeSejourTrim entity = new TauxTaxeSejourTrim();
        TauxTaxeSejourTrim saved = new TauxTaxeSejourTrim();
        TauxTaxeSejourTrimDto savedDto = new TauxTaxeSejourTrimDto();

        // Mock the converter to return the tauxTaxeSejourTrim object when converting from DTO
        when(converter.toItem(requestDto)).thenReturn(entity);

        // Mock the service to return the saved client
        when(service.create(entity)).thenReturn(saved);

        // Mock the converter to return the saved tauxTaxeSejourTrim DTO
        when(converter.toDto(saved)).thenReturn(savedDto);

        // Call the controller method
        ResponseEntity<TauxTaxeSejourTrimDto> result = controller.save(requestDto);

        // Verify the result
        assertEquals(HttpStatus.CREATED, result.getStatusCode());

        // Verify the response body
        TauxTaxeSejourTrimDto responseBody = result.getBody();
        assertNotNull(responseBody);

        // Add assertions to compare the response body with the saved tauxTaxeSejourTrim DTO
        assertEquals(savedDto.getCategorieSejourCode(), responseBody.getCategorieSejourCode());
        assertEquals(savedDto.getMontantNuit(), responseBody.getMontantNuit());
        assertEquals(savedDto.getPourcentagePremierMoisRetard(), responseBody.getPourcentagePremierMoisRetard());
        assertEquals(savedDto.getPourcentageAutreMoisRetard(), responseBody.getPourcentageAutreMoisRetard());
        assertEquals(savedDto.getEmploye(), responseBody.getEmploye());
    }

}
