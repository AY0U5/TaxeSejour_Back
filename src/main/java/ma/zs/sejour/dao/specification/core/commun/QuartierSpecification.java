package ma.zs.sejour.dao.specification.core.commun;

import ma.zs.sejour.bean.core.commun.Quartier;
import ma.zs.sejour.dao.criteria.core.commun.QuartierCriteria;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;


public class QuartierSpecification extends  AbstractSpecification<QuartierCriteria, Quartier>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("sectaurCode", criteria.getSecteurCode(),criteria.getSecteurCodeLike());
    }

    public QuartierSpecification(QuartierCriteria criteria) {
        super(criteria);
    }

    public QuartierSpecification(QuartierCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
