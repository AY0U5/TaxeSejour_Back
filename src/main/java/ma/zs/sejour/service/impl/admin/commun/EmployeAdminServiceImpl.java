package ma.zs.sejour.service.impl.admin.commun;

import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.sejour.dao.facade.core.commun.EmployeDao;
import ma.zs.sejour.dao.specification.core.commun.EmployeSpecification;
import ma.zs.sejour.service.facade.admin.commun.EmployeAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EmployeAdminServiceImpl extends AbstractServiceImpl<Employe, EmployeCriteria, EmployeDao> implements EmployeAdminService {


    public EmployeAdminServiceImpl(EmployeDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Employe.class, EmployeSpecification.class);
    }
}
