package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.haverd.projrcttaxesejour.bean.commun.Locale;
@Repository
public interface LocaleDao extends JpaRepository<Locale,Long> {

    Locale findByCode(String code);

    int deleteByCode(String code);
}
