package ma.zs.sejour.dao.specification.core.commun;

import ma.zs.sejour.bean.core.commun.CategorieSejour;
import ma.zs.sejour.bean.core.commun.Redevable;
import ma.zs.sejour.dao.criteria.core.commun.CategorieSejourCriteria;
import ma.zs.sejour.dao.criteria.core.commun.RedevableCriteria;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;


public class RedevableSpecification extends  AbstractSpecification<RedevableCriteria, Redevable>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("cin", criteria.getCin(),criteria.getCinLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("typeRedevableCode", criteria.getTypeRedevableCode(),criteria.getTypeRedevableCodeLike());
    }

    public RedevableSpecification(RedevableCriteria criteria) {
        super(criteria);
    }

    public RedevableSpecification(RedevableCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
