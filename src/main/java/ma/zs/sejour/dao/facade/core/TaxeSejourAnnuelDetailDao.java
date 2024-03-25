package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeSejourAnnuelDetailDao extends JpaRepository<TaxeSejourAnnuelDetail, Long> {

    TaxeSejourAnnuelDetail findByTaxeSejourAnnuelCode(String code);
}
