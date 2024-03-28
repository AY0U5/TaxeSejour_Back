package ma.zs.sejour.service.impl.admin.commun;

import jakarta.transaction.Transactional;
import ma.zs.sejour.bean.core.commun.Ville;
import ma.zs.sejour.dao.criteria.core.commun.VilleCriteria;
import ma.zs.sejour.dao.facade.core.commun.VilleDao;
import ma.zs.sejour.dao.specification.core.commun.VilleSpecification;
import ma.zs.sejour.service.facade.admin.commun.VilleAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VilleAdminServiceImpl extends AbstractServiceImpl<Ville, VilleCriteria, VilleDao> implements VilleAdminService {

    private  @Autowired VilleDao dao ;


    @Override
    public Ville findBycode(String code) {
        return dao.findByCode(code);
    }
    @Override
    @Transactional
    public int deleteBycode(String code) {
        return dao.deleteByCode(code);
    }
    @Override
    public int save(Ville ville) {
        if (findBycode(ville.getCode()) != null) {
            return -1;
        } else {
            dao.save(ville);
            return 1;
        }
    }

    public VilleAdminServiceImpl(VilleDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Ville.class, VilleSpecification.class);
    }
}
