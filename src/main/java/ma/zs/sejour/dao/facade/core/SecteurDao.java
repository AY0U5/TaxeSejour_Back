package usa.haverd.projrcttaxesejour.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.haverd.projrcttaxesejour.bean.commun.Secteur;

@Repository
public interface SecteurDao extends JpaRepository<Secteur,Long> {

    Secteur findByCode(String code);
    int deleteByCode(String code);
}
