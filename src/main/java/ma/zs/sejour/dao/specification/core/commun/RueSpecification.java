package ma.zs.sejour.dao.specification.core.commun;

import ma.zs.sejour.bean.core.commun.Redevable;
import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.dao.criteria.core.commun.RedevableCriteria;
import ma.zs.sejour.dao.criteria.core.commun.RueCriteria;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;


public class RueSpecification extends  AbstractSpecification<RueCriteria, Rue>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("quartierCode", criteria.getQuartierCode(),criteria.getQuartierCodeLike());
    }

    public RueSpecification(RueCriteria criteria) {
        super(criteria);
    }

    public RueSpecification(RueCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
