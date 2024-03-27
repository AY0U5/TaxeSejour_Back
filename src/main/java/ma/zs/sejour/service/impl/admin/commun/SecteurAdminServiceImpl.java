package ma.zs.sejour.service.impl.admin.commun;

import ma.zs.sejour.bean.core.commun.Secteur;
import ma.zs.sejour.dao.criteria.core.commun.SecteurCriteria;
import ma.zs.sejour.dao.facade.core.commun.SecteurDao;
import ma.zs.sejour.dao.specification.core.commun.SecteurSpecification;
import ma.zs.sejour.service.facade.admin.commun.SecteurAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import ma.zs.sejour.zynerator.service.IService;
import org.springframework.stereotype.Service;

@Service
public class SecteurAdminServiceImpl extends AbstractServiceImpl<Secteur, SecteurCriteria, SecteurDao> implements SecteurAdminService {

    public SecteurAdminServiceImpl(SecteurDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Secteur.class, SecteurSpecification.class);
    }
}
