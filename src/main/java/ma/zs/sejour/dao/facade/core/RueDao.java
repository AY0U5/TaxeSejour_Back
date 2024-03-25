package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.haverd.projrcttaxesejour.bean.commun.Rue;

@Repository
public interface RueDao extends JpaRepository<Rue,Long> {
    Rue findByCode(String code);
    int deleteByCode(String code);

}
