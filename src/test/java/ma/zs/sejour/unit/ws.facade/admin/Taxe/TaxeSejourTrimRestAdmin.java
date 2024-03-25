package ma.zs.sejour.unit.ws.facade.admin.Taxe;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.service.impl.admin.Taxe.TaxeSejourTrimAdminServiceImpl;
import ma.zs.sejour.ws.converter.Taxe.TaxeSejourTrimConverter;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourTrimDto;
import ma.zs.sejour.ws.facade.admin.Taxe.TaxeSejourTrimRestAdmin;
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
public class TaxeSejourTrimRestAdmin {

    private MockMvc mockMvc;

    @Mock
    private TaxeSejourTrimAdminServiceImpl service;
    @Mock
    private TaxeSejourTrimConverter converter;

    @InjectMocks
    private TaxeSejourTrimRestAdmin controller;

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }


    @Test
    public void itShouldFindAllTaxeSejourTrimTest() throws Exception {
        // Mock the service to return an empty list
        when(service.findAll()).thenReturn(Collections.emptyList());
        when(converter.toDto(Collections.emptyList())).thenReturn(Collections.emptyList());

        // Call the controller method
        ResponseEntity<List<TaxeSejourTrimDto>> result = controller.findAll();

        // Verify the result
        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());

        // Response body should be empty list
        List<TaxeSejourTrimDto> responseBody = result.getBody();
        assertNotNull(responseBody);
        assertEquals(0, responseBody.size());
    }

    @Test
    public void itShouldSaveTaxeSejourTrimTest() throws Exception {
        // Mock data
        TaxeSejourTrimDto requestDto = new TaxeSejourTrimDto();
        TaxeSejourTrim entity = new TaxeSejourTrim();
        TaxeSejourTrim saved = new TaxeSejourTrim();
        TaxeSejourTrimDto savedDto = new TaxeSejourTrimDto();

        // Mock the converter to return the taxeSejourTrim object when converting from DTO
        when(converter.toItem(requestDto)).thenReturn(entity);

        // Mock the service to return the saved client
        when(service.create(entity)).thenReturn(saved);

        // Mock the converter to return the saved taxeSejourTrim DTO
        when(converter.toDto(saved)).thenReturn(savedDto);

        // Call the controller method
        ResponseEntity<TaxeSejourTrimDto> result = controller.save(requestDto);

        // Verify the result
        assertEquals(HttpStatus.CREATED, result.getStatusCode());

        // Verify the response body
        TaxeSejourTrimDto responseBody = result.getBody();
        assertNotNull(responseBody);

        // Add assertions to compare the response body with the saved taxeSejourTrim DTO
        assertEquals(savedDto.getLocale(), responseBody.getLocale());
        assertEquals(savedDto.getRedevable(), responseBody.getRedevable());
        assertEquals(savedDto.getNbrNuit(), responseBody.getNbrNuit());
        assertEquals(savedDto.getCode(), responseBody.getCode());
        assertEquals(savedDto.getTrim(), responseBody.getTrim());
        assertEquals(savedDto.getAnnee(), responseBody.getAnnee());
        assertEquals(savedDto.getMontantBase(), responseBody.getMontantBase());
        assertEquals(savedDto.getNbrMoisRetard(), responseBody.getNbrMoisRetard());
        assertEquals(savedDto.getMontantRetard(), responseBody.getMontantRetard());
        assertEquals(savedDto.getMontantPremierMoisRetard(), responseBody.getMontantPremierMoisRetard());
        assertEquals(savedDto.getMontantAutreMoisRetard(), responseBody.getMontantAutreMoisRetard());
        assertEquals(savedDto.getMontantTotal(), responseBody.getMontantTotal());
        assertEquals(savedDto.getEmploye(), responseBody.getEmploye());
    }

}
