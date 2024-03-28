package ma.zs.sejour.service.impl.admin.commun;

import ma.zs.sejour.bean.core.commun.Quartier;
import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.dao.criteria.core.commun.RueCriteria;
import ma.zs.sejour.dao.facade.core.commun.RueDao;
import ma.zs.sejour.dao.specification.core.commun.RueSpecification;
import ma.zs.sejour.service.facade.admin.commun.QuartierAdminService;
import ma.zs.sejour.service.facade.admin.commun.RueAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RueAdminServiceImpl extends AbstractServiceImpl<Rue, RueCriteria, RueDao> implements RueAdminService {

    private @Autowired RueDao dao;

    private @Autowired QuartierAdminService quartierService;

    @Override
    public Rue findByCode(String code) {
        return dao.findByCode(code);
    }

    @Override
    public int deleteByCode(String code) {
        return dao.deleteByCode(code);
    }

    @Override
    public int save(Rue rue) {
        Quartier quartier = quartierService.findBycode(rue.getQuartier().getCode());
        rue.setQuartier(quartier);
        if (findByCode(rue.getCode()) != null) {
            return -1;
        } else {
            dao.save(rue);
            return 1;
        }
    }


    public RueAdminServiceImpl(RueDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Rue.class, RueSpecification.class);
    }
}
