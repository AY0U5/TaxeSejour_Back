package ma.zs.sejour.service.facade.admin.Taxe;

import java.util.List;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuelDetail;
import ma.zs.sejour.dao.criteria.core.Taxe.TaxeSejourAnnuelDetailCriteria;
import ma.zs.sejour.zynerator.service.IService;



public interface TaxeSejourAnnuelDetailAdminService extends  IService<TaxeSejourAnnuelDetail,TaxeSejourAnnuelDetailCriteria>  {

    List<TaxeSejourAnnuelDetail> findByTaxeSejourAnnuelId(Long id);
    int deleteByTaxeSejourAnnuelId(Long id);
    long countByTaxeSejourAnnuelId(Long id);




}
