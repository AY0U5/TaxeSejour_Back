package ma.zs.sejour.service.facade.admin.Taxe;

import java.util.List;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.dao.criteria.core.Taxe.TaxeSejourTrimCriteria;
import ma.zs.sejour.zynerator.service.IService;



public interface TaxeSejourTrimAdminService extends  IService<TaxeSejourTrim,TaxeSejourTrimCriteria>  {

    List<TaxeSejourTrim> findByTauxTaxeSejourTrimId(Long id);
    int deleteByTauxTaxeSejourTrimId(Long id);
    long countByTauxTaxeSejourTrimId(Long id);




}
