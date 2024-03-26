package ma.zs.sejour.dao.specification.core.commun;

import ma.zs.sejour.bean.core.commun.TypeRedevable;
import ma.zs.sejour.bean.core.commun.Ville;
import ma.zs.sejour.dao.criteria.core.commun.TypeRedevableCriteria;
import ma.zs.sejour.dao.criteria.core.commun.VilleCriteria;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;


public class VilleSpecification extends  AbstractSpecification<VilleCriteria, Ville>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public VilleSpecification(VilleCriteria criteria) {
        super(criteria);
    }

    public VilleSpecification(VilleCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
