package ma.zs.sejour.service.impl.admin.commun;

import ma.zs.sejour.bean.core.commun.TypeRedevable;
import ma.zs.sejour.dao.criteria.core.commun.TypeRedevableCriteria;
import ma.zs.sejour.dao.facade.core.commun.TypeRedevableDao;
import ma.zs.sejour.dao.specification.core.commun.TypeRedevableSpecification;
import ma.zs.sejour.service.facade.admin.commun.TypeRedevableAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import ma.zs.sejour.zynerator.service.IService;
import org.springframework.stereotype.Service;

@Service
public class TypeRedevableAdminServiceImpl extends AbstractServiceImpl<TypeRedevable, TypeRedevableCriteria, TypeRedevableDao> implements TypeRedevableAdminService {


    public TypeRedevableAdminServiceImpl(TypeRedevableDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(TypeRedevable.class, TypeRedevableSpecification.class);
    }
}
