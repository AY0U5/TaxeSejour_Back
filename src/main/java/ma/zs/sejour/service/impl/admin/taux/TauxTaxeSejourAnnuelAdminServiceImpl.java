package ma.zs.sejour.service.impl.admin.taux;


import ma.zs.sejour.bean.core.taux.TauxTaxeSejourAnnuel;
import ma.zs.sejour.dao.criteria.core.taux.TauxTaxeSejourAnnuelCriteria;
import ma.zs.sejour.dao.facade.core.taux.TauxTaxeSejourAnnuelDao;
import ma.zs.sejour.dao.specification.core.taux.TauxTaxeSejourAnnuelSpecification;
import ma.zs.sejour.service.facade.admin.taux.TauxTaxeSejourAnnuelAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import ma.zs.sejour.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class TauxTaxeSejourAnnuelAdminServiceImpl extends AbstractServiceImpl<TauxTaxeSejourAnnuel, TauxTaxeSejourAnnuelCriteria, TauxTaxeSejourAnnuelDao> implements TauxTaxeSejourAnnuelAdminService {


    public void configure() {
        super.configure(TauxTaxeSejourAnnuel.class, TauxTaxeSejourAnnuelSpecification.class);
    }



    public TauxTaxeSejourAnnuelAdminServiceImpl(TauxTaxeSejourAnnuelDao dao) {
        super(dao);
    }

}
