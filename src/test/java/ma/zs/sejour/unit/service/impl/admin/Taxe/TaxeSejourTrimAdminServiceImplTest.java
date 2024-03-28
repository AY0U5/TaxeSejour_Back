package ma.zs.sejour.unit.service.impl.admin.Taxe;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.dao.facade.core.Taxe.TaxeSejourTrimDao;
import ma.zs.sejour.service.impl.admin.Taxe.TaxeSejourTrimAdminServiceImpl;

import ma.zs.sejour.bean.core.taux.TauxTaxeSejourTrim ;
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
class TaxeSejourTrimAdminServiceImplTest {

    @Mock
    private TaxeSejourTrimDao repository;
    private AutoCloseable autoCloseable;
    private TaxeSejourTrimAdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new TaxeSejourTrimAdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllTaxeSejourTrim() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSaveTaxeSejourTrim() {
        // Given
        TaxeSejourTrim toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeleteTaxeSejourTrim() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetTaxeSejourTrimById() {
        // Given
        Long idToRetrieve = 1L; // Example TaxeSejourTrim ID to retrieve
        TaxeSejourTrim expected = new TaxeSejourTrim(); // You need to replace TaxeSejourTrim with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        TaxeSejourTrim result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private TaxeSejourTrim constructSample(int i) {
		TaxeSejourTrim given = new TaxeSejourTrim();
        given.setId(id);
        given.setTauxTaxeSejourTrim(new TauxTaxeSejourTrim(1L));
        given.setTauxTaxeSejourTrim(tauxTaxeSejourTrim);
        given.setNbrNuit(BigDecimal.TEN);
        given.setNbrNuit(nbrNuit);
        given.setCode("code-"+i);
        given.setCode(code);
        given.setTrim(BigDecimal.TEN);
        given.setTrim(trim);
        given.setAnnee(BigDecimal.TEN);
        given.setAnnee(annee);
        given.setMontantBase(BigDecimal.TEN);
        given.setMontantBase(montantBase);
        given.setNbrMoisRetard(i);
        given.setNbrMoisRetard(nbrMoisRetard);
        given.setMontantRetard(BigDecimal.TEN);
        given.setMontantRetard(montantRetard);
        given.setMontantPremierMoisRetard(BigDecimal.TEN);
        given.setMontantPremierMoisRetard(montantPremierMoisRetard);
        given.setMontantAutreMoisRetard(BigDecimal.TEN);
        given.setMontantAutreMoisRetard(montantAutreMoisRetard);
        given.setMontantTotal(BigDecimal.TEN);
        given.setMontantTotal(montantTotal);
        given.setEmploye("employe-"+i);
        given.setEmploye(employe);
        return given;
    }

}
