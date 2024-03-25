package ma.zs.sejour.unit.dao.facade.core.taux;

import ma.zs.sejour.bean.core.taux.TauxTaxeSejourTrim;
import ma.zs.sejour.dao.facade.core.taux.TauxTaxeSejourTrimDao;

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
public class TauxTaxeSejourTrimDaoTest {

@Autowired
    private TauxTaxeSejourTrimDao underTest;


    @Test
    void shouldFindById(){
        Long id = 1L;
        TauxTaxeSejourTrim entity = new TauxTaxeSejourTrim();
        entity.setId(id);
        underTest.save(entity);
        TauxTaxeSejourTrim loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        TauxTaxeSejourTrim entity = new TauxTaxeSejourTrim();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        TauxTaxeSejourTrim loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<TauxTaxeSejourTrim> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<TauxTaxeSejourTrim> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        TauxTaxeSejourTrim given = constructSample(1);
        TauxTaxeSejourTrim saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private TauxTaxeSejourTrim constructSample(int i) {
		TauxTaxeSejourTrim given = new TauxTaxeSejourTrim();
        given.setCategorieSejourCode("categorieSejourCode-"+i);
        given.setMontantNuit(BigDecimal.TEN);
        given.setPourcentagePremierMoisRetard(BigDecimal.TEN);
        given.setPourcentageAutreMoisRetard(BigDecimal.TEN);
        given.setEmploye("employe-"+i);
        return given;
    }

}
