package ma.zs.sejour.service.facade.admin.Taxe;

import java.util.List;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuel;
import ma.zs.sejour.dao.criteria.core.Taxe.TaxeSejourAnnuelCriteria;
import ma.zs.sejour.zynerator.service.IService;



public interface TaxeSejourAnnuelAdminService extends  IService<TaxeSejourAnnuel,TaxeSejourAnnuelCriteria>  {

    List<TaxeSejourAnnuel> findByTauxTaxeSejourAnnuelId(Long id);
    int deleteByTauxTaxeSejourAnnuelId(Long id);
    long countByTauxTaxeSejourAnnuelId(Long id);




}
