package ma.zs.sejour.unit.ws.facade.admin.Taxe;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuelDetail;
import ma.zs.sejour.service.impl.admin.Taxe.TaxeSejourAnnuelDetailAdminServiceImpl;
import ma.zs.sejour.ws.converter.Taxe.TaxeSejourAnnuelDetailConverter;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourAnnuelDetailDto;
import ma.zs.sejour.ws.facade.admin.Taxe.TaxeSejourAnnuelDetailRestAdmin;
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
public class TaxeSejourAnnuelDetailRestAdmin {

    private MockMvc mockMvc;

    @Mock
    private TaxeSejourAnnuelDetailAdminServiceImpl service;
    @Mock
    private TaxeSejourAnnuelDetailConverter converter;

    @InjectMocks
    private TaxeSejourAnnuelDetailRestAdmin controller;

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }


    @Test
    public void itShouldFindAllTaxeSejourAnnuelDetailTest() throws Exception {
        // Mock the service to return an empty list
        when(service.findAll()).thenReturn(Collections.emptyList());
        when(converter.toDto(Collections.emptyList())).thenReturn(Collections.emptyList());

        // Call the controller method
        ResponseEntity<List<TaxeSejourAnnuelDetailDto>> result = controller.findAll();

        // Verify the result
        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());

        // Response body should be empty list
        List<TaxeSejourAnnuelDetailDto> responseBody = result.getBody();
        assertNotNull(responseBody);
        assertEquals(0, responseBody.size());
    }

    @Test
    public void itShouldSaveTaxeSejourAnnuelDetailTest() throws Exception {
        // Mock data
        TaxeSejourAnnuelDetailDto requestDto = new TaxeSejourAnnuelDetailDto();
        TaxeSejourAnnuelDetail entity = new TaxeSejourAnnuelDetail();
        TaxeSejourAnnuelDetail saved = new TaxeSejourAnnuelDetail();
        TaxeSejourAnnuelDetailDto savedDto = new TaxeSejourAnnuelDetailDto();

        // Mock the converter to return the taxeSejourAnnuelDetail object when converting from DTO
        when(converter.toItem(requestDto)).thenReturn(entity);

        // Mock the service to return the saved client
        when(service.create(entity)).thenReturn(saved);

        // Mock the converter to return the saved taxeSejourAnnuelDetail DTO
        when(converter.toDto(saved)).thenReturn(savedDto);

        // Call the controller method
        ResponseEntity<TaxeSejourAnnuelDetailDto> result = controller.save(requestDto);

        // Verify the result
        assertEquals(HttpStatus.CREATED, result.getStatusCode());

        // Verify the response body
        TaxeSejourAnnuelDetailDto responseBody = result.getBody();
        assertNotNull(responseBody);

        // Add assertions to compare the response body with the saved taxeSejourAnnuelDetail DTO
        assertEquals(savedDto.getNbrNuit(), responseBody.getNbrNuit());
        assertEquals(savedDto.getTrim(), responseBody.getTrim());
        assertEquals(savedDto.getAnnee(), responseBody.getAnnee());
    }

}
