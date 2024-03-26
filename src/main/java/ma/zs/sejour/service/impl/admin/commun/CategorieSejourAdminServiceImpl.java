package ma.zs.sejour.service.impl.admin.commun;

import ma.zs.sejour.bean.core.commun.CategorieSejour;
import ma.zs.sejour.dao.criteria.core.commun.CategorieSejourCriteria;
import ma.zs.sejour.dao.facade.core.commun.CategorieSejourDao;
import ma.zs.sejour.dao.specification.core.commun.CategorieSejourSpecification;
import ma.zs.sejour.service.facade.admin.commun.CategorieSejourAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CategorieSejourAdminServiceImpl extends AbstractServiceImpl<CategorieSejour, CategorieSejourCriteria, CategorieSejourDao> implements CategorieSejourAdminService {


    public CategorieSejourAdminServiceImpl(CategorieSejourDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(CategorieSejour.class, CategorieSejourSpecification.class);
    }
}
