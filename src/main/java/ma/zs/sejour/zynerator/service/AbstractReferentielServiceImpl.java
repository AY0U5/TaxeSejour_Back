package ma.zs.sejour.zynerator.service;

import ma.zs.sejour.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.zs.sejour.zynerator.criteria.BaseCriteria;
import ma.zs.sejour.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, CRITERIA extends BaseCriteria, REPO extends AbstractRepository<T, Long>> extends AbstractServiceImpl<T, CRITERIA, REPO> {

    public AbstractReferentielServiceImpl(REPO dao) {
        super(dao);
    }

}
