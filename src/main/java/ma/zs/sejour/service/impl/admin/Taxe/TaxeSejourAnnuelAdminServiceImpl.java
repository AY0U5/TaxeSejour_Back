package ma.zs.sejour.service.impl.admin.Taxe;


import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuel;
import ma.zs.sejour.dao.criteria.core.Taxe.TaxeSejourAnnuelCriteria;
import ma.zs.sejour.dao.facade.core.Taxe.TaxeSejourAnnuelDao;
import ma.zs.sejour.dao.specification.core.Taxe.TaxeSejourAnnuelSpecification;
import ma.zs.sejour.service.facade.admin.Taxe.TaxeSejourAnnuelAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import ma.zs.sejour.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.sejour.service.facade.admin.taux.TauxTaxeSejourAnnuelAdminService ;
import ma.zs.sejour.bean.core.taux.TauxTaxeSejourAnnuel ;

import java.util.List;
@Service
public class TaxeSejourAnnuelAdminServiceImpl extends AbstractServiceImpl<TaxeSejourAnnuel, TaxeSejourAnnuelCriteria, TaxeSejourAnnuelDao> implements TaxeSejourAnnuelAdminService {






    public void findOrSaveAssociatedObject(TaxeSejourAnnuel t){
        if( t != null) {
            t.setTauxTaxeSejourAnnuel(tauxTaxeSejourAnnuelService.findOrSave(t.getTauxTaxeSejourAnnuel()));
        }
    }

    public List<TaxeSejourAnnuel> findByTauxTaxeSejourAnnuelId(Long id){
        return dao.findByTauxTaxeSejourAnnuelId(id);
    }
    public int deleteByTauxTaxeSejourAnnuelId(Long id){
        return dao.deleteByTauxTaxeSejourAnnuelId(id);
    }
    public long countByTauxTaxeSejourAnnuelId(Long id){
        return dao.countByTauxTaxeSejourAnnuelId(id);
    }






    public void configure() {
        super.configure(TaxeSejourAnnuel.class, TaxeSejourAnnuelSpecification.class);
    }


    @Autowired
    private TauxTaxeSejourAnnuelAdminService tauxTaxeSejourAnnuelService ;

    public TaxeSejourAnnuelAdminServiceImpl(TaxeSejourAnnuelDao dao) {
        super(dao);
    }

}
