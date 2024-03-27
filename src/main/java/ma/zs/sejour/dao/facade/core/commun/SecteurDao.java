package ma.zs.sejour.dao.facade.core.commun;


import ma.zs.sejour.bean.core.commun.Secteur;
import ma.zs.sejour.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SecteurDao extends AbstractRepository<Secteur,Long> {

    /*Secteur findByCode(String code);
    int deleteByCode(String code);*/
}
