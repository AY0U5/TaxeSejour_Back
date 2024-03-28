package ma.zs.sejour.service.impl.admin.commun;

import jakarta.transaction.Transactional;
import ma.zs.sejour.bean.core.commun.Quartier;
import ma.zs.sejour.bean.core.commun.Secteur;
import ma.zs.sejour.dao.criteria.core.commun.QuartierCriteria;
import ma.zs.sejour.dao.facade.core.commun.QuartierDao;
import ma.zs.sejour.dao.specification.core.commun.QuartierSpecification;
import ma.zs.sejour.service.facade.admin.commun.QuartierAdminService;
import ma.zs.sejour.service.facade.admin.commun.SecteurAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuartierAdminServiceImpl extends AbstractServiceImpl<Quartier, QuartierCriteria, QuartierDao> implements QuartierAdminService {



    private @Autowired QuartierDao quartierDao;


    private @Autowired SecteurAdminService secteurService;


    @Override
    public List<Quartier> findBySecteurCode(String code) {
        return quartierDao.findBySecteurCode(code);
    }

    @Override
    public Quartier findBycode(String code) {
        return quartierDao.findBycode(code);
    }

    @Transactional
    @Override
    public int deleteBycode(String code) {
        return quartierDao.deleteBycode(code);
    }


    @Override
    public int save(Quartier quartier) {
        Secteur secteur = secteurService.findByCode(quartier.getSecteur().getCode());
        quartier.setSecteur(secteur);
        if (findBycode(quartier.getCode()) != null) {
            return -1;
        } else {
            quartierDao.save(quartier);
            return 1;
        }
    }

    public QuartierAdminServiceImpl(QuartierDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Quartier.class, QuartierSpecification.class);
    }
}
