package ma.zs.sejour.dao.facade.core.commun;

import ma.zs.sejour.bean.core.commun.Quartier;
import ma.zs.sejour.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuartierDao extends AbstractRepository< Quartier,Long> {
    List<Quartier>findBySecteurCode(String code);

    /*Quartier findBycode(String code);

    int deleteBycode(String code);*/
}