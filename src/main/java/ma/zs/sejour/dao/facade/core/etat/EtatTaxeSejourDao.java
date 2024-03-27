package ma.zs.sejour.dao.facade.core.etat;

import ma.zs.sejour.bean.core.Etat.EtatTaxeSejour;
import ma.zs.sejour.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatTaxeSejourDao extends AbstractRepository<EtatTaxeSejour,Long> {

    /*EtatTaxeSejour findBycode(String code);

    int deleteBycode(String code);*/


}
