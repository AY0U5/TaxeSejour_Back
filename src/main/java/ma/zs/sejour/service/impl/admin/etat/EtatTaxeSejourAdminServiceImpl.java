package ma.zs.sejour.service.impl.admin.etat;

import ma.zs.sejour.bean.core.Etat.EtatTaxeSejour;
import ma.zs.sejour.dao.criteria.core.etat.EtatTaxeSejourCriteria;
import ma.zs.sejour.dao.facade.core.etat.EtatTaxeSejourDao;
import ma.zs.sejour.dao.specification.core.etat.EtatTaxeSejourSpecification;
import ma.zs.sejour.service.facade.admin.etat.EtatTaxeSejourAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import ma.zs.sejour.zynerator.service.IService;
import org.springframework.stereotype.Service;

@Service
public class EtatTaxeSejourAdminServiceImpl extends AbstractServiceImpl<EtatTaxeSejour, EtatTaxeSejourCriteria, EtatTaxeSejourDao> implements EtatTaxeSejourAdminService {

    public EtatTaxeSejourAdminServiceImpl(EtatTaxeSejourDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(EtatTaxeSejour.class, EtatTaxeSejourSpecification.class);
    }
}
