package ma.zs.sejour.service.impl.admin.commun;

import ma.zs.sejour.bean.core.commun.CategorieSejour;
import ma.zs.sejour.bean.core.commun.Locale;
import ma.zs.sejour.bean.core.commun.Redevable;
import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.dao.criteria.core.commun.LocaleCriteria;
import ma.zs.sejour.dao.facade.core.commun.LocaleDao;
import ma.zs.sejour.dao.specification.core.commun.LocaleSpecification;
import ma.zs.sejour.service.facade.admin.commun.CategorieSejourAdminService;
import ma.zs.sejour.service.facade.admin.commun.LocaleAdminService;
import ma.zs.sejour.service.facade.admin.commun.RedevableAdminService;
import ma.zs.sejour.service.facade.admin.commun.RueAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LocaleAdminServiceImpl extends AbstractServiceImpl<Locale, LocaleCriteria, LocaleDao> implements LocaleAdminService {


    private @Autowired LocaleDao dao;

    private  @Autowired RedevableAdminService redevebleService;

    private @Autowired RueAdminService rueService;

    private @Autowired CategorieSejourAdminService categorieSejourService;


    @Override
    public Locale findByCode(String code) {
        return dao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return dao.deleteByCode(code);
    }


        public int save(Locale locale) {
            Redevable redevable = redevebleService.findByCode(locale.getRedevable().getCode());
            locale.setRedevable(redevable);
            Rue rue = rueService.findByCode(locale.getRue().getCode());
            locale.setRue(rue);
            CategorieSejour categorieSejour = categorieSejourService.findByCode(locale.getCategorieSejour().getCode());
            locale.setCategorieSejour(categorieSejour);
            if (findByCode(locale.getCode())!=null){
                return -1;
            }
            dao.save(locale);
            return 1;
        }



    public LocaleAdminServiceImpl(LocaleDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Locale.class, LocaleSpecification.class);
    }
}
