package ma.zs.sejour.unit.dao.facade.core.Taxe;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuelDetail;
import ma.zs.sejour.dao.facade.core.Taxe.TaxeSejourAnnuelDetailDao;

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
public class TaxeSejourAnnuelDetailDaoTest {

@Autowired
    private TaxeSejourAnnuelDetailDao underTest;


    @Test
    void shouldFindById(){
        Long id = 1L;
        TaxeSejourAnnuelDetail entity = new TaxeSejourAnnuelDetail();
        entity.setId(id);
        underTest.save(entity);
        TaxeSejourAnnuelDetail loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        TaxeSejourAnnuelDetail entity = new TaxeSejourAnnuelDetail();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        TaxeSejourAnnuelDetail loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<TaxeSejourAnnuelDetail> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<TaxeSejourAnnuelDetail> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        TaxeSejourAnnuelDetail given = constructSample(1);
        TaxeSejourAnnuelDetail saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private TaxeSejourAnnuelDetail constructSample(int i) {
		TaxeSejourAnnuelDetail given = new TaxeSejourAnnuelDetail();
        given.setNbrNuit(BigDecimal.TEN);
        given.setTrim(BigDecimal.TEN);
        given.setAnnee(BigDecimal.TEN);
        given.setTaxeSejourAnnuel(new TaxeSejourAnnuel(1L));
        return given;
    }

}
