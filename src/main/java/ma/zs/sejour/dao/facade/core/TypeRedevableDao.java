package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.haverd.projrcttaxesejour.bean.commun.TypeRedevable;

@Repository
public interface TypeRedevableDao extends JpaRepository <TypeRedevable,Long> {
    TypeRedevable findByCode(String code);
    int deleteByCode(String code);
}
