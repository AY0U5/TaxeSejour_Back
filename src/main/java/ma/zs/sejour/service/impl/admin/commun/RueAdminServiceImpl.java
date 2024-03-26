package ma.zs.sejour.service.impl.admin.commun;

import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.dao.criteria.core.commun.RueCriteria;
import ma.zs.sejour.dao.facade.core.commun.RueDao;
import ma.zs.sejour.dao.specification.core.commun.RueSpecification;
import ma.zs.sejour.service.facade.admin.commun.RueAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import ma.zs.sejour.zynerator.service.IService;
import org.springframework.stereotype.Service;

@Service
public class RueAdminServiceImpl extends AbstractServiceImpl<Rue, RueCriteria, RueDao> implements RueAdminService {


    public RueAdminServiceImpl(RueDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Rue.class, RueSpecification.class);
    }
}
