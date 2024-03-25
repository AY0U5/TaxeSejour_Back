package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.haverd.projrcttaxesejour.bean.sejourtrim.TauxTaxeSejourTrim;
import usa.haverd.projrcttaxesejour.bean.sejourtrim.TaxeSejourTrim;
@Repository
public interface TaxeSejourTrimDao extends JpaRepository<TaxeSejourTrim,Long> {


    TaxeSejourTrim findByLocaleCode(String code);


    TaxeSejourTrim findByCode(String code);

    int deleteByCode(String code);
}
