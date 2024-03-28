package ma.zs.sejour.dao.facade.core.commun;

import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeDao extends AbstractRepository<Employe,Long> {
    Employe findByCode(String code);
    int deleteByCode(String code);

}
