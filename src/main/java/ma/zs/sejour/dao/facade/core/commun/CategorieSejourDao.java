package ma.zs.sejour.dao.facade.core.commun;

import ma.zs.sejour.bean.core.commun.CategorieSejour;
import ma.zs.sejour.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategorieSejourDao extends AbstractRepository<CategorieSejour,Long> {
    /*CategorieSejour findByCode(String code);
    int deleteByCode(String code);*/

}