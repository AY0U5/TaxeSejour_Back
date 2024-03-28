package ma.zs.sejour.dao.facade.core.commun;

import ma.zs.sejour.bean.core.commun.Redevable;
import ma.zs.sejour.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RedevableDao extends AbstractRepository<Redevable,Long> {

    Redevable findByCode(String code);
    int deleteByCode(String code);
    int deleteByTypeRedevableCode(String code);

}
