package ma.zs.sejour.service.impl.admin.commun;

import ma.zs.sejour.bean.core.commun.Ville;
import ma.zs.sejour.dao.criteria.core.commun.VilleCriteria;
import ma.zs.sejour.dao.facade.core.commun.VilleDao;
import ma.zs.sejour.dao.specification.core.commun.VilleSpecification;
import ma.zs.sejour.service.facade.admin.commun.VilleAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import ma.zs.sejour.zynerator.service.IService;
import org.springframework.stereotype.Service;

@Service
public class VilleAdminServiceImpl extends AbstractServiceImpl<Ville, VilleCriteria, VilleDao> implements VilleAdminService {


    public VilleAdminServiceImpl(VilleDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Ville.class, VilleSpecification.class);
    }
}
