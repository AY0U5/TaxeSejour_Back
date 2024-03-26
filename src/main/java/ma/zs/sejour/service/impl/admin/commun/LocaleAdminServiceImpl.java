package ma.zs.sejour.service.impl.admin.commun;

import ma.zs.sejour.bean.core.commun.Locale;
import ma.zs.sejour.dao.criteria.core.commun.LocaleCriteria;
import ma.zs.sejour.dao.facade.core.commun.LocaleDao;
import ma.zs.sejour.dao.specification.core.commun.LocaleSpecification;
import ma.zs.sejour.service.facade.admin.commun.LocaleAdminService;
import ma.zs.sejour.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class LocaleAdminServiceImpl extends AbstractServiceImpl<Locale, LocaleCriteria, LocaleDao> implements LocaleAdminService {


    public LocaleAdminServiceImpl(LocaleDao dao) {
        super(dao);
    }

    @Override
    public void configure() {
        super.configure(Locale.class, LocaleSpecification.class);
    }
}
