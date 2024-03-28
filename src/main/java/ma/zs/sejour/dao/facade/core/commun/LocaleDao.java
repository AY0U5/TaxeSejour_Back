package ma.zs.sejour.dao.facade.core.commun;

import ma.zs.sejour.bean.core.commun.Locale;
import ma.zs.sejour.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LocaleDao extends AbstractRepository<Locale,Long> {

   Locale findByCode(String code);
    int deleteByCode(String code);
}
