package ma.zs.sejour.service.impl.admin.commun;

import ma.zs.sejour.bean.core.commun.Redevable;
import ma.zs.sejour.bean.core.commun.TypeRedevable;
import ma.zs.sejour.dao.criteria.core.commun.RedevableCriteria;
import ma.zs.sejour.dao.facade.core.commun.RedevableDao;
import ma.zs.sejour.dao.specification.core.commun.RedevableSpecification;
import ma.zs.sejour.service.facade.admin.commun.RedevableAdminService;
import ma.zs.sejour.service.facade.admin.commun.TypeRedevableAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedevableAdminServiceImpl extends AbstractServiceImpl<Redevable, RedevableCriteria, RedevableDao> implements RedevableAdminService {

    @Autowired
    private RedevableDao dao;
    @Autowired
    private TypeRedevableAdminService typeRedevebleService;

    @Override
    public Redevable findByCode(String code) {
        return dao.findByCode(code);
    }

    @Override
    public int deleteByCode(String code) {
        return dao.deleteByCode(code);
    }

    @Override
    public int deleteByTypeRedevableCode(String code) {
        return dao.deleteByTypeRedevableCode(code);
    }

    @Override
    public int save(Redevable redevable){
        TypeRedevable typeRedevable = typeRedevebleService.findByCode(redevable.getTypeRedevable().getCode());
        redevable.setTypeRedevable(typeRedevable);
        if (typeRedevable == null) {
            return -1;
        }else{
            dao.save(redevable);
            return 1;
        }
    }

    public RedevableAdminServiceImpl(RedevableDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Redevable.class, RedevableSpecification.class);
    }
}
