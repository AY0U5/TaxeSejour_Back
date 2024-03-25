package ma.zs.sejour.unit.service.impl.admin.taux;

import ma.zs.sejour.bean.core.taux.TauxTaxeSejourTrim;
import ma.zs.sejour.dao.facade.core.taux.TauxTaxeSejourTrimDao;
import ma.zs.sejour.service.impl.admin.taux.TauxTaxeSejourTrimAdminServiceImpl;

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
class TauxTaxeSejourTrimAdminServiceImplTest {

    @Mock
    private TauxTaxeSejourTrimDao repository;
    private AutoCloseable autoCloseable;
    private TauxTaxeSejourTrimAdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new TauxTaxeSejourTrimAdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllTauxTaxeSejourTrim() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSaveTauxTaxeSejourTrim() {
        // Given
        TauxTaxeSejourTrim toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeleteTauxTaxeSejourTrim() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetTauxTaxeSejourTrimById() {
        // Given
        Long idToRetrieve = 1L; // Example TauxTaxeSejourTrim ID to retrieve
        TauxTaxeSejourTrim expected = new TauxTaxeSejourTrim(); // You need to replace TauxTaxeSejourTrim with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        TauxTaxeSejourTrim result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private TauxTaxeSejourTrim constructSample(int i) {
		TauxTaxeSejourTrim given = new TauxTaxeSejourTrim();
        given.setId(id);
        given.setCategorieSejourCode("categorieSejourCode-"+i);
        given.setCategorieSejourCode(categorieSejourCode);
        given.setMontantNuit(BigDecimal.TEN);
        given.setMontantNuit(montantNuit);
        given.setPourcentagePremierMoisRetard(BigDecimal.TEN);
        given.setPourcentagePremierMoisRetard(pourcentagePremierMoisRetard);
        given.setPourcentageAutreMoisRetard(BigDecimal.TEN);
        given.setPourcentageAutreMoisRetard(pourcentageAutreMoisRetard);
        given.setEmploye("employe-"+i);
        given.setEmploye(employe);
        return given;
    }

}
