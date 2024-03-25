package ma.zs.sejour.unit.service.impl.admin.Taxe;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuelDetail;
import ma.zs.sejour.dao.facade.core.Taxe.TaxeSejourAnnuelDetailDao;
import ma.zs.sejour.service.impl.admin.Taxe.TaxeSejourAnnuelDetailAdminServiceImpl;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuel ;
import java.util.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.time.LocalDateTime;



import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@SpringBootTest
class TaxeSejourAnnuelDetailAdminServiceImplTest {

    @Mock
    private TaxeSejourAnnuelDetailDao repository;
    private AutoCloseable autoCloseable;
    private TaxeSejourAnnuelDetailAdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new TaxeSejourAnnuelDetailAdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllTaxeSejourAnnuelDetail() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSaveTaxeSejourAnnuelDetail() {
        // Given
        TaxeSejourAnnuelDetail toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeleteTaxeSejourAnnuelDetail() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetTaxeSejourAnnuelDetailById() {
        // Given
        Long idToRetrieve = 1L; // Example TaxeSejourAnnuelDetail ID to retrieve
        TaxeSejourAnnuelDetail expected = new TaxeSejourAnnuelDetail(); // You need to replace TaxeSejourAnnuelDetail with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        TaxeSejourAnnuelDetail result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private TaxeSejourAnnuelDetail constructSample(int i) {
		TaxeSejourAnnuelDetail given = new TaxeSejourAnnuelDetail();
        given.setId(id);
        given.setNbrNuit(BigDecimal.TEN);
        given.setNbrNuit(nbrNuit);
        given.setTrim(BigDecimal.TEN);
        given.setTrim(trim);
        given.setAnnee(BigDecimal.TEN);
        given.setAnnee(annee);
        given.setTaxeSejourAnnuel(new TaxeSejourAnnuel(1L));
        given.setTaxeSejourAnnuel(taxeSejourAnnuel);
        return given;
    }

}
