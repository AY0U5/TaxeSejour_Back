package ma.zs.sejour.dao.facade.core.Taxe;

import ma.zs.sejour.zynerator.repository.AbstractRepository;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuel;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TaxeSejourAnnuelDao extends AbstractRepository<TaxeSejourAnnuel,Long>  {

    List<TaxeSejourAnnuel> findByTauxTaxeSejourAnnuelId(Long id);
    int deleteByTauxTaxeSejourAnnuelId(Long id);
    long countByTauxTaxeSejourAnnuelId(Long id);


}
