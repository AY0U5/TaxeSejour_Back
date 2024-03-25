package ma.zs.sejour.service.impl.admin.Taxe;


import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuelDetail;
import ma.zs.sejour.dao.criteria.core.Taxe.TaxeSejourAnnuelDetailCriteria;
import ma.zs.sejour.dao.facade.core.Taxe.TaxeSejourAnnuelDetailDao;
import ma.zs.sejour.dao.specification.core.Taxe.TaxeSejourAnnuelDetailSpecification;
import ma.zs.sejour.service.facade.admin.Taxe.TaxeSejourAnnuelDetailAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import ma.zs.sejour.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.sejour.service.facade.admin.Taxe.TaxeSejourAnnuelAdminService ;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuel ;

import java.util.List;
@Service
public class TaxeSejourAnnuelDetailAdminServiceImpl extends AbstractServiceImpl<TaxeSejourAnnuelDetail, TaxeSejourAnnuelDetailCriteria, TaxeSejourAnnuelDetailDao> implements TaxeSejourAnnuelDetailAdminService {






    public void findOrSaveAssociatedObject(TaxeSejourAnnuelDetail t){
        if( t != null) {
            t.setTaxeSejourAnnuel(taxeSejourAnnuelService.findOrSave(t.getTaxeSejourAnnuel()));
        }
    }

    public List<TaxeSejourAnnuelDetail> findByTaxeSejourAnnuelId(Long id){
        return dao.findByTaxeSejourAnnuelId(id);
    }
    public int deleteByTaxeSejourAnnuelId(Long id){
        return dao.deleteByTaxeSejourAnnuelId(id);
    }
    public long countByTaxeSejourAnnuelId(Long id){
        return dao.countByTaxeSejourAnnuelId(id);
    }






    public void configure() {
        super.configure(TaxeSejourAnnuelDetail.class, TaxeSejourAnnuelDetailSpecification.class);
    }


    @Autowired
    private TaxeSejourAnnuelAdminService taxeSejourAnnuelService ;

    public TaxeSejourAnnuelDetailAdminServiceImpl(TaxeSejourAnnuelDetailDao dao) {
        super(dao);
    }

}
