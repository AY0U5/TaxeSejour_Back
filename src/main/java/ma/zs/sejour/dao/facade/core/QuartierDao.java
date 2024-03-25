package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.haverd.projrcttaxesejour.bean.commun.Quartier;
import usa.haverd.projrcttaxesejour.bean.commun.Secteur;

import java.util.List;

@Repository
public interface QuartierDao extends JpaRepository<Quartier,Long> {
    List<Quartier>findBySecteurCode(String code);

    Quartier findBycode(String code);

    int deleteBycode(String code);
}