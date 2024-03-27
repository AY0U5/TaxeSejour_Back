package ma.zs.sejour.dao.facade.core.commun;

import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RueDao extends AbstractRepository<Rue,Long> {
    /*Rue findByCode(String code);
    int deleteByCode(String code);*/

}
