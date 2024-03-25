package ma.zs.sejour.unit.service.impl.admin.Taxe;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuel;
import ma.zs.sejour.dao.facade.core.Taxe.TaxeSejourAnnuelDao;
import ma.zs.sejour.service.impl.admin.Taxe.TaxeSejourAnnuelAdminServiceImpl;

import ma.zs.sejour.bean.core.taux.TauxTaxeSejourAnnuel ;
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
class TaxeSejourAnnuelAdminServiceImplTest {

    @Mock
    private TaxeSejourAnnuelDao repository;
    private AutoCloseable autoCloseable;
    private TaxeSejourAnnuelAdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new TaxeSejourAnnuelAdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllTaxeSejourAnnuel() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSaveTaxeSejourAnnuel() {
        // Given
        TaxeSejourAnnuel toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeleteTaxeSejourAnnuel() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetTaxeSejourAnnuelById() {
        // Given
        Long idToRetrieve = 1L; // Example TaxeSejourAnnuel ID to retrieve
        TaxeSejourAnnuel expected = new TaxeSejourAnnuel(); // You need to replace TaxeSejourAnnuel with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        TaxeSejourAnnuel result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private TaxeSejourAnnuel constructSample(int i) {
		TaxeSejourAnnuel given = new TaxeSejourAnnuel();
        given.setId(id);
        given.setTauxTaxeSejourAnnuel(new TauxTaxeSejourAnnuel(1L));
        given.setTauxTaxeSejourAnnuel(tauxTaxeSejourAnnuel);
        given.setCode("code-"+i);
        given.setCode(code);
        given.setMontantBase(BigDecimal.TEN);
        given.setMontantBase(montantBase);
        given.setAnnee(i);
        given.setAnnee(annee);
        given.setEtatTaxeSejour("etatTaxeSejour-"+i);
        given.setEtatTaxeSejour(etatTaxeSejour);
        given.setMontantTotal(BigDecimal.TEN);
        given.setMontantTotal(montantTotal);
        given.setMontantRetard(BigDecimal.TEN);
        given.setMontantRetard(montantRetard);
        given.setNbrMoisRetard(BigDecimal.TEN);
        given.setNbrMoisRetard(nbrMoisRetard);
        given.setEmploye("employe-"+i);
        given.setEmploye(employe);
        return given;
    }

}
