package ma.zs.sejour.dao.facade.core.Taxe;

import ma.zs.sejour.zynerator.repository.AbstractRepository;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TaxeSejourTrimDao extends AbstractRepository<TaxeSejourTrim,Long>  {

    List<TaxeSejourTrim> findByTauxTaxeSejourTrimId(Long id);
    int deleteByTauxTaxeSejourTrimId(Long id);
    long countByTauxTaxeSejourTrimId(Long id);

    /*
    TaxeSejourTrim findByLocaleCode(String code);


    TaxeSejourTrim findByCode(String code);

    int deleteByCode(String code);
    */


}
