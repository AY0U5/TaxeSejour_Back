package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.haverd.projrcttaxesejour.bean.commun.CategorieSejour;
import usa.haverd.projrcttaxesejour.bean.sejourtrim.TauxTaxeSejourTrim;
import usa.haverd.projrcttaxesejour.bean.sejourtrim.TaxeSejourTrim;

@Repository
public interface TauxTaxeSejourTrimDao extends JpaRepository<TauxTaxeSejourTrim,Long> {




        TauxTaxeSejourTrim findByCategorieSejourCode(String code);

        int deleteByCategorieSejourCode(String code);
}
