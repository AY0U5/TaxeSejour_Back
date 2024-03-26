package ma.zs.sejour.dao.specification.core.commun;

import ma.zs.sejour.bean.core.commun.Locale;
import ma.zs.sejour.dao.criteria.core.commun.LocaleCriteria;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;


public class LocaleSpecification extends  AbstractSpecification<LocaleCriteria, Locale>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("rueCode", criteria.getRueCode(),criteria.getRueCodeLike());
        addPredicate("categorieSejourCode", criteria.getCategorieSejourCode(),criteria.getCategorieSejourCodeLike());
        addPredicate("redevableCode", criteria.getRedevableCode(),criteria.getRedevableCodeLike());
    }

    public LocaleSpecification(LocaleCriteria criteria) {
        super(criteria);
    }

    public LocaleSpecification(LocaleCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
