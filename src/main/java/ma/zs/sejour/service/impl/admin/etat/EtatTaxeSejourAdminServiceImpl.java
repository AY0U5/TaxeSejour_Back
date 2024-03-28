package ma.zs.sejour.service.impl.admin.etat;

import ma.zs.sejour.bean.core.Etat.EtatTaxeSejour;
import ma.zs.sejour.dao.criteria.core.etat.EtatTaxeSejourCriteria;
import ma.zs.sejour.dao.facade.core.commun.CategorieSejourDao;
import ma.zs.sejour.dao.facade.core.etat.EtatTaxeSejourDao;
import ma.zs.sejour.dao.specification.core.etat.EtatTaxeSejourSpecification;
import ma.zs.sejour.service.facade.admin.etat.EtatTaxeSejourAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import ma.zs.sejour.zynerator.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtatTaxeSejourAdminServiceImpl extends AbstractServiceImpl<EtatTaxeSejour, EtatTaxeSejourCriteria, EtatTaxeSejourDao> implements EtatTaxeSejourAdminService {


    @Override
    public EtatTaxeSejour findBycode(String code) {
        return dao.findBycode(code);
    }

    @Override
    public int deleteBycode(String code) {
        return dao.deleteBycode(code);
    }

    @Override
    public int save(EtatTaxeSejour etatTaxeSejour) {
        return 0;
    }

    public EtatTaxeSejourAdminServiceImpl(EtatTaxeSejourDao dao) {
        super(dao);
    }




    private @Autowired EtatTaxeSejourDao dao;
    @Override
    public void configure() {
        super.configure(EtatTaxeSejour.class, EtatTaxeSejourSpecification.class);
    }
}
