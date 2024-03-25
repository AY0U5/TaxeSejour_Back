package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxTaxeSejourAnnuelDao extends JpaRepository <TauxTaxeSejourAnnuel,Long> {
    TauxTaxeSejourAnnuel findByCategorieSejourCode(String code);

}
