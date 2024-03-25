package ma.zs.sejour.unit.dao.facade.core.Taxe;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.dao.facade.core.Taxe.TaxeSejourTrimDao;

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
public class TaxeSejourTrimDaoTest {

@Autowired
    private TaxeSejourTrimDao underTest;


    @Test
    void shouldFindById(){
        Long id = 1L;
        TaxeSejourTrim entity = new TaxeSejourTrim();
        entity.setId(id);
        underTest.save(entity);
        TaxeSejourTrim loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        TaxeSejourTrim entity = new TaxeSejourTrim();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        TaxeSejourTrim loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<TaxeSejourTrim> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<TaxeSejourTrim> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        TaxeSejourTrim given = constructSample(1);
        TaxeSejourTrim saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private TaxeSejourTrim constructSample(int i) {
		TaxeSejourTrim given = new TaxeSejourTrim();
        given.setLocale("locale-"+i);
        given.setRedevable("redevable-"+i);
        given.setTauxTaxeSejourTrim(new TauxTaxeSejourTrim(1L));
        given.setNbrNuit(BigDecimal.TEN);
        given.setCode("code-"+i);
        given.setTrim(BigDecimal.TEN);
        given.setAnnee(BigDecimal.TEN);
        given.setMontantBase(BigDecimal.TEN);
        given.setNbrMoisRetard(i);
        given.setMontantRetard(BigDecimal.TEN);
        given.setMontantPremierMoisRetard(BigDecimal.TEN);
        given.setMontantAutreMoisRetard(BigDecimal.TEN);
        given.setMontantTotal(BigDecimal.TEN);
        given.setEmploye("employe-"+i);
        return given;
    }

}
