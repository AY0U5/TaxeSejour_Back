package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.haverd.projrcttaxesejour.bean.commun.Ville;

@Repository
public interface VilleDao  extends JpaRepository<Ville,Long> {
    Ville findByCode(String code);

    int deleteByCode(String code);

}
