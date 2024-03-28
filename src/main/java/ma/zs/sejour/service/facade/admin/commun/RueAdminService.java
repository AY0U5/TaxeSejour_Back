package ma.zs.sejour.service.facade.admin.commun;

import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.sejour.dao.criteria.core.commun.RueCriteria;
import ma.zs.sejour.zynerator.service.IService;


public interface RueAdminService extends  IService<Rue, RueCriteria>  {


    Rue findByCode(String code);

    int deleteByCode(String code);

    int save(Rue rue);
}
