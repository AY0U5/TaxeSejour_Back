package ma.zs.sejour.service.impl.admin.commun;

import ma.zs.sejour.bean.core.commun.Redevable;
import ma.zs.sejour.dao.criteria.core.commun.RedevableCriteria;
import ma.zs.sejour.dao.facade.core.commun.RedevableDao;
import ma.zs.sejour.dao.specification.core.commun.RedevableSpecification;
import ma.zs.sejour.service.facade.admin.commun.RedevableAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import ma.zs.sejour.zynerator.service.IService;
import org.springframework.stereotype.Service;

@Service
public class RedevableAdminServiceImpl extends AbstractServiceImpl<Redevable, RedevableCriteria, RedevableDao> implements RedevableAdminService {

    public RedevableAdminServiceImpl(RedevableDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Redevable.class, RedevableSpecification.class);
    }
}
