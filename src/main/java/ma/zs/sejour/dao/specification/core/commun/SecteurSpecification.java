package ma.zs.sejour.dao.specification.core.commun;

import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.bean.core.commun.Secteur;
import ma.zs.sejour.dao.criteria.core.commun.RueCriteria;
import ma.zs.sejour.dao.criteria.core.commun.SecteurCriteria;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;


public class SecteurSpecification extends  AbstractSpecification<SecteurCriteria, Secteur>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("villeCode", criteria.getVilleCode(),criteria.getVilleCodeLike());
    }

    public SecteurSpecification(SecteurCriteria criteria) {
        super(criteria);
    }

    public SecteurSpecification(SecteurCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
