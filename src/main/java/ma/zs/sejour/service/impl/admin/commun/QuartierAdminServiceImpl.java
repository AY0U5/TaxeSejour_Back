package ma.zs.sejour.service.impl.admin.commun;

import ma.zs.sejour.bean.core.commun.Quartier;
import ma.zs.sejour.dao.criteria.core.commun.QuartierCriteria;
import ma.zs.sejour.dao.facade.core.commun.QuartierDao;
import ma.zs.sejour.dao.specification.core.commun.QuartierSpecification;
import ma.zs.sejour.service.facade.admin.commun.QuartierAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import ma.zs.sejour.zynerator.service.IService;
import org.springframework.stereotype.Service;

@Service
public class QuartierAdminServiceImpl extends AbstractServiceImpl<Quartier, QuartierCriteria, QuartierDao> implements QuartierAdminService {

    public QuartierAdminServiceImpl(QuartierDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Quartier.class, QuartierSpecification.class);
    }
}
