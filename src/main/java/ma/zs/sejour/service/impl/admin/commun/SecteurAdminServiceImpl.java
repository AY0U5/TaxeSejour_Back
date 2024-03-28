package ma.zs.sejour.service.impl.admin.commun;

import jakarta.transaction.Transactional;
import ma.zs.sejour.bean.core.commun.Secteur;
import ma.zs.sejour.bean.core.commun.Ville;
import ma.zs.sejour.dao.criteria.core.commun.SecteurCriteria;
import ma.zs.sejour.dao.facade.core.commun.SecteurDao;
import ma.zs.sejour.dao.specification.core.commun.SecteurSpecification;
import ma.zs.sejour.service.facade.admin.commun.SecteurAdminService;
import ma.zs.sejour.service.facade.admin.commun.VilleAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecteurAdminServiceImpl extends AbstractServiceImpl<Secteur, SecteurCriteria, SecteurDao> implements SecteurAdminService {


    private @Autowired SecteurDao secteurDao;

    private @Autowired VilleAdminService service;

    @Override
    public Secteur findByCode(String code) {
        return secteurDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return secteurDao.deleteByCode(code);
    }


    @Override
    public int save(Secteur secteur) {

        Ville ville = service.findBycode(secteur.getVille().getCode());
        secteur.setVille(ville);
        if (findByCode(secteur.getCode()) != null) {
            return -1;
        }
        secteurDao.save(secteur);
        return 1;
    }

    public SecteurAdminServiceImpl(SecteurDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Secteur.class, SecteurSpecification.class);
    }
}
