package ma.zs.sejour.dao.facade.core.taux;

import ma.zs.sejour.zynerator.repository.AbstractRepository;
import ma.zs.sejour.bean.core.taux.TauxTaxeSejourTrim;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TauxTaxeSejourTrimDao extends AbstractRepository<TauxTaxeSejourTrim,Long>  {

    /*TauxTaxeSejourTrim findByCategorieSejourCode(String code);

    int deleteByCategorieSejourCode(String code);*/

}
