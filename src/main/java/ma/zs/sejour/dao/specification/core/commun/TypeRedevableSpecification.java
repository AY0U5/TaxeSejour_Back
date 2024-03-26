package ma.zs.sejour.dao.specification.core.commun;

import ma.zs.sejour.bean.core.commun.Secteur;
import ma.zs.sejour.bean.core.commun.TypeRedevable;
import ma.zs.sejour.dao.criteria.core.commun.SecteurCriteria;
import ma.zs.sejour.dao.criteria.core.commun.TypeRedevableCriteria;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;


public class TypeRedevableSpecification extends  AbstractSpecification<TypeRedevableCriteria, TypeRedevable>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public TypeRedevableSpecification(TypeRedevableCriteria criteria) {
        super(criteria);
    }

    public TypeRedevableSpecification(TypeRedevableCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
