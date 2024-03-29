package ma.zs.sejour.service.facade.admin.commun;

import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.bean.core.commun.Locale;
import ma.zs.sejour.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.sejour.dao.criteria.core.commun.LocaleCriteria;
import ma.zs.sejour.zynerator.service.IService;
import org.springframework.transaction.annotation.Transactional;


public interface LocaleAdminService extends  IService<Locale, LocaleCriteria>  {


    Locale findByCode(String code);

    @Transactional
    int deleteByCode(String code);

    int save(Locale locale);
}
