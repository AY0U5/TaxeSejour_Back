package ma.zs.sejour.unit.dao.facade.core.Taxe;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuel;
import ma.zs.sejour.dao.facade.core.Taxe.TaxeSejourAnnuelDao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.time.LocalDateTime;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class TaxeSejourAnnuelDaoTest {

@Autowired
    private TaxeSejourAnnuelDao underTest;


    @Test
    void shouldFindById(){
        Long id = 1L;
        TaxeSejourAnnuel entity = new TaxeSejourAnnuel();
        entity.setId(id);
        underTest.save(entity);
        TaxeSejourAnnuel loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        TaxeSejourAnnuel entity = new TaxeSejourAnnuel();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        TaxeSejourAnnuel loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<TaxeSejourAnnuel> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<TaxeSejourAnnuel> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        TaxeSejourAnnuel given = constructSample(1);
        TaxeSejourAnnuel saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private TaxeSejourAnnuel constructSample(int i) {
		TaxeSejourAnnuel given = new TaxeSejourAnnuel();
        given.setTauxTaxeSejourAnnuel(new TauxTaxeSejourAnnuel(1L));
        given.setCode("code-"+i);
        given.setMontantBase(BigDecimal.TEN);
        given.setAnnee(i);
        given.setEtatTaxeSejour("etatTaxeSejour-"+i);
        given.setMontantTotal(BigDecimal.TEN);
        given.setMontantRetard(BigDecimal.TEN);
        given.setNbrMoisRetard(BigDecimal.TEN);
        given.setEmploye("employe-"+i);
        return given;
    }

}
