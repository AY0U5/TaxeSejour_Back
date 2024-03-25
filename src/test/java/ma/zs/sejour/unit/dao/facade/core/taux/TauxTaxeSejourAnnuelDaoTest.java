package ma.zs.sejour.unit.dao.facade.core.taux;

import ma.zs.sejour.bean.core.taux.TauxTaxeSejourAnnuel;
import ma.zs.sejour.dao.facade.core.taux.TauxTaxeSejourAnnuelDao;

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
public class TauxTaxeSejourAnnuelDaoTest {

@Autowired
    private TauxTaxeSejourAnnuelDao underTest;


    @Test
    void shouldFindById(){
        Long id = 1L;
        TauxTaxeSejourAnnuel entity = new TauxTaxeSejourAnnuel();
        entity.setId(id);
        underTest.save(entity);
        TauxTaxeSejourAnnuel loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        TauxTaxeSejourAnnuel entity = new TauxTaxeSejourAnnuel();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        TauxTaxeSejourAnnuel loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<TauxTaxeSejourAnnuel> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<TauxTaxeSejourAnnuel> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        TauxTaxeSejourAnnuel given = constructSample(1);
        TauxTaxeSejourAnnuel saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private TauxTaxeSejourAnnuel constructSample(int i) {
		TauxTaxeSejourAnnuel given = new TauxTaxeSejourAnnuel();
        given.setCategorieSejourCode("categorieSejourCode-"+i);
        given.setMontantNuit(BigDecimal.TEN);
        given.setPourcentagePremierMoisRetard(BigDecimal.TEN);
        given.setPourcentageAutreMoisRetard(BigDecimal.TEN);
        given.setEmploye("employe-"+i);
        return given;
    }

}
