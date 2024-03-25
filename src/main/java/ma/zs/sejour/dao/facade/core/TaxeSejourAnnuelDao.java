package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeSejourAnnuelDao extends JpaRepository<TaxeSejourAnnuel,Long> {
    TaxeSejourAnnuel getTaxeSejourAnnuelByCode(String code);
    int deleteTaxeSejourAnnuelByCode(String code);

}
