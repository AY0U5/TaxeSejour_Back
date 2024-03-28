package ma.zs.sejour.service.impl.admin.commun;

import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.sejour.dao.facade.core.commun.EmployeDao;
import ma.zs.sejour.dao.specification.core.commun.EmployeSpecification;
import ma.zs.sejour.service.facade.admin.commun.EmployeAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeAdminServiceImpl extends AbstractServiceImpl<Employe, EmployeCriteria, EmployeDao> implements EmployeAdminService {

    public EmployeAdminServiceImpl(EmployeDao dao) {
        super(dao);
    }



    @Override
    public Employe findByCode(String code) {
        return dao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return dao.deleteByCode(code);
    }

    @Override
    public int save(Employe employe) {
        if (findByCode(employe.getCode())!=null){
            return -1;
        }
        else {
            dao.save(employe);
            return 1;
        }
    }


    @Override
    public void configure() {
        super.configure(Employe.class, EmployeSpecification.class);
    }
    private @Autowired EmployeDao dao;
}
