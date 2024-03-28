package ma.zs.sejour.service.facade.admin.commun;

import jakarta.transaction.Transactional;
import ma.zs.sejour.bean.core.commun.CategorieSejour;
import ma.zs.sejour.bean.core.taux.TauxTaxeSejourAnnuel;
import ma.zs.sejour.dao.criteria.core.commun.CategorieSejourCriteria;
import ma.zs.sejour.dao.criteria.core.taux.TauxTaxeSejourAnnuelCriteria;
import ma.zs.sejour.zynerator.service.IService;

import java.util.List;


public interface CategorieSejourAdminService extends  IService<CategorieSejour, CategorieSejourCriteria>  {


    CategorieSejour findByCode(String code);

    @Transactional
    int deleteByCode(String code);

    int save(CategorieSejour categorieSejour);

    List<CategorieSejour> findAll();
}
