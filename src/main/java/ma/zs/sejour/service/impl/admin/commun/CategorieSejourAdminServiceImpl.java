package ma.zs.sejour.service.impl.admin.commun;

import jakarta.transaction.Transactional;
import ma.zs.sejour.bean.core.commun.CategorieSejour;
import ma.zs.sejour.dao.criteria.core.commun.CategorieSejourCriteria;
import ma.zs.sejour.dao.facade.core.commun.CategorieSejourDao;
import ma.zs.sejour.dao.specification.core.commun.CategorieSejourSpecification;
import ma.zs.sejour.service.facade.admin.commun.CategorieSejourAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieSejourAdminServiceImpl extends AbstractServiceImpl<CategorieSejour, CategorieSejourCriteria, CategorieSejourDao> implements CategorieSejourAdminService {

    @Override
    public CategorieSejour findByCode(String code) {
        return dao.findByCode(code);
    }


    @Override
    @Transactional
    public int deleteByCode(String code) {
        return taxeSejourAnnuelService.deleteByCode(code);
    }


   @Override
    public int save(CategorieSejour categorieSejour) {
        if (findByCode(categorieSejour.getCode()) != null) {
            return -1;
        } else {

            dao.save(categorieSejour);
            return 1;
        }
    }

    @Override
    public List<CategorieSejour> findAll() {
        return dao.findAll();
    }

    public void configure() {
        super.configure(CategorieSejour.class, CategorieSejourSpecification.class);
    }

    public CategorieSejourAdminServiceImpl(CategorieSejourDao dao) {
        super(dao);
    }

    private @Autowired CategorieSejourDao taxeSejourAnnuelService;
}
