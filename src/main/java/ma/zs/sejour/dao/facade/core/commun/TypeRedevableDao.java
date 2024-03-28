package ma.zs.sejour.dao.facade.core.commun;

import ma.zs.sejour.bean.core.commun.TypeRedevable;
import ma.zs.sejour.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TypeRedevableDao extends AbstractRepository<TypeRedevable,Long> {
    TypeRedevable findByCode(String code);
    int deleteByCode(String code);
}
