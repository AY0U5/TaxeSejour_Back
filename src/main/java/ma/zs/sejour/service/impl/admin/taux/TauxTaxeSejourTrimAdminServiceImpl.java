package ma.zs.sejour.service.impl.admin.taux;


import ma.zs.sejour.bean.core.taux.TauxTaxeSejourTrim;
import ma.zs.sejour.dao.criteria.core.taux.TauxTaxeSejourTrimCriteria;
import ma.zs.sejour.dao.facade.core.taux.TauxTaxeSejourTrimDao;
import ma.zs.sejour.dao.specification.core.taux.TauxTaxeSejourTrimSpecification;
import ma.zs.sejour.service.facade.admin.taux.TauxTaxeSejourTrimAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import ma.zs.sejour.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class TauxTaxeSejourTrimAdminServiceImpl extends AbstractServiceImpl<TauxTaxeSejourTrim, TauxTaxeSejourTrimCriteria, TauxTaxeSejourTrimDao> implements TauxTaxeSejourTrimAdminService {













    public void configure() {
        super.configure(TauxTaxeSejourTrim.class, TauxTaxeSejourTrimSpecification.class);
    }



    public TauxTaxeSejourTrimAdminServiceImpl(TauxTaxeSejourTrimDao dao) {
        super(dao);
    }

}
