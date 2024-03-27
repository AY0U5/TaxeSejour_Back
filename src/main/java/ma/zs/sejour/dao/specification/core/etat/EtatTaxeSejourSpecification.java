package ma.zs.sejour.dao.specification.core.etat;

import ma.zs.sejour.bean.core.Etat.EtatTaxeSejour;
import ma.zs.sejour.dao.criteria.core.etat.EtatTaxeSejourCriteria;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;

public class EtatTaxeSejourSpecification extends  AbstractSpecification<EtatTaxeSejourCriteria, EtatTaxeSejour>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("secteurCode", criteria.getSecteurCode(),criteria.getSecteurCodeLike());
    }

    public EtatTaxeSejourSpecification(EtatTaxeSejourCriteria criteria) {
        super(criteria);
    }

    public EtatTaxeSejourSpecification(EtatTaxeSejourCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
