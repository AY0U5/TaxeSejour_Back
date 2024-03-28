package ma.zs.sejour.service.impl.admin.commun;

import jakarta.transaction.Transactional;
import ma.zs.sejour.bean.core.commun.TypeRedevable;
import ma.zs.sejour.dao.criteria.core.commun.TypeRedevableCriteria;
import ma.zs.sejour.dao.facade.core.commun.TypeRedevableDao;
import ma.zs.sejour.dao.specification.core.commun.TypeRedevableSpecification;
import ma.zs.sejour.service.facade.admin.commun.TypeRedevableAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeRedevableAdminServiceImpl extends AbstractServiceImpl<TypeRedevable, TypeRedevableCriteria, TypeRedevableDao> implements TypeRedevableAdminService {

    private @Autowired TypeRedevableDao dao;


    @Override
    public TypeRedevable findByCode(String code) {
        return dao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return dao.deleteByCode(code);
    }

    @Override
    public int save(TypeRedevable typeRedevable) {
        if (findByCode(typeRedevable.getCode()) != null) {
            return -1;
        } else {
            dao.save(typeRedevable);
            return 1;
        }

    }

    public TypeRedevableAdminServiceImpl(TypeRedevableDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(TypeRedevable.class, TypeRedevableSpecification.class);
    }
}
