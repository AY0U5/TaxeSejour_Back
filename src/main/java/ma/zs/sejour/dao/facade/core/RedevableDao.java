package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.haverd.projrcttaxesejour.bean.commun.Redevable;

@Repository
public interface RedevableDao extends JpaRepository <Redevable,Long> {
    Redevable findByCode(String code);
    int deleteByCode(String code);
    int deleteByTypeRedevableCode(String code);
}
