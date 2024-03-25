package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.haverd.projrcttaxesejour.bean.sejourannuel.EtatTaxeSejour;

@Repository
public interface EtatTaxeSejourDao extends JpaRepository<EtatTaxeSejour,Long> {

    EtatTaxeSejour findBycode(String code);

    int deleteBycode(String code);





}
