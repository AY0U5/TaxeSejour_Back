package ma.zs.sejour.service.facade.admin.commun;

import jakarta.transaction.Transactional;
import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.bean.core.commun.Secteur;
import ma.zs.sejour.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.sejour.dao.criteria.core.commun.SecteurCriteria;
import ma.zs.sejour.zynerator.service.IService;


public interface SecteurAdminService extends  IService<Secteur, SecteurCriteria>  {


    Secteur findByCode(String code);

    @Transactional
    int deleteByCode(String code);

    int save(Secteur secteur);
}
