package ma.zs.sejour.service.facade.admin.commun;

import jakarta.transaction.Transactional;
import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.bean.core.commun.Quartier;
import ma.zs.sejour.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.sejour.dao.criteria.core.commun.QuartierCriteria;
import ma.zs.sejour.zynerator.service.IService;

import java.util.List;


public interface QuartierAdminService extends  IService<Quartier, QuartierCriteria>  {


    List<Quartier> findBySecteurCode(String code);

    Quartier findBycode(String code);

    @Transactional
    int deleteBycode(String code);

    int save(Quartier quartier);
}
