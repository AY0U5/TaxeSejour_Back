package ma.zs.sejour.dao.specification.core.commun;

import ma.zs.sejour.bean.core.commun.CategorieSejour;
import ma.zs.sejour.dao.criteria.core.commun.CategorieSejourCriteria;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;

public class CategorieSejourSpecification extends  AbstractSpecification<CategorieSejourCriteria, CategorieSejour>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public CategorieSejourSpecification(CategorieSejourCriteria criteria) {
        super(criteria);
    }

    public CategorieSejourSpecification(CategorieSejourCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
