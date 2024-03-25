package ma.zs.sejour.dao.facade.core.Taxe;

import ma.zs.sejour.zynerator.repository.AbstractRepository;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuelDetail;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TaxeSejourAnnuelDetailDao extends AbstractRepository<TaxeSejourAnnuelDetail,Long>  {

    List<TaxeSejourAnnuelDetail> findByTaxeSejourAnnuelId(Long id);
    int deleteByTaxeSejourAnnuelId(Long id);
    long countByTaxeSejourAnnuelId(Long id);


}
