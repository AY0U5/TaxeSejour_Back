package ma.zs.sejour.dao.facade.core.commun;

import ma.zs.sejour.bean.core.commun.Ville;
import ma.zs.sejour.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleDao  extends AbstractRepository<Ville,Long> {
    /*Ville findByCode(String code);

    int deleteByCode(String code);*/

}
