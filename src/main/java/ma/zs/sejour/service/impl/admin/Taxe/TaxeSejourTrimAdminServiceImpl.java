package ma.zs.sejour.service.impl.admin.Taxe;


import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.dao.criteria.core.Taxe.TaxeSejourTrimCriteria;
import ma.zs.sejour.dao.facade.core.Taxe.TaxeSejourTrimDao;
import ma.zs.sejour.dao.specification.core.Taxe.TaxeSejourTrimSpecification;
import ma.zs.sejour.service.facade.admin.Taxe.TaxeSejourTrimAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import org.joda.time.YearMonthDay;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.MonthDay;
import java.time.YearMonth;
import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.sejour.service.facade.admin.taux.TauxTaxeSejourTrimAdminService ;
import ma.zs.sejour.bean.core.taux.TauxTaxeSejourTrim ;

import java.util.List;
@Service
public class TaxeSejourTrimAdminServiceImpl extends AbstractServiceImpl<TaxeSejourTrim, TaxeSejourTrimCriteria, TaxeSejourTrimDao> implements TaxeSejourTrimAdminService {






    public void findOrSaveAssociatedObject(TaxeSejourTrim t){
        if( t != null) {
            t.setTauxTaxeSejourTrim(tauxTaxeSejourTrimService.findOrSave(t.getTauxTaxeSejourTrim()));
        }
    }

    public List<TaxeSejourTrim> findByTauxTaxeSejourTrimId(Long id){
        return dao.findByTauxTaxeSejourTrimId(id);
    }
    public int deleteByTauxTaxeSejourTrimId(Long id){
        return dao.deleteByTauxTaxeSejourTrimId(id);
    }
    public long countByTauxTaxeSejourTrimId(Long id){
        return dao.countByTauxTaxeSejourTrimId(id);
    }






    public void configure() {
        super.configure(TaxeSejourTrim.class, TaxeSejourTrimSpecification.class);
    }


    @Autowired
    private TauxTaxeSejourTrimAdminService tauxTaxeSejourTrimService ;

    public TaxeSejourTrimAdminServiceImpl(TaxeSejourTrimDao dao) {
        super(dao);
    }

}
