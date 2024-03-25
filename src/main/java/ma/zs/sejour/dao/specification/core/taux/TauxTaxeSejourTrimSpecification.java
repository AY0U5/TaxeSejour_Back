package  ma.zs.sejour.dao.specification.core.taux;

import ma.zs.sejour.dao.criteria.core.taux.TauxTaxeSejourTrimCriteria;
import ma.zs.sejour.bean.core.taux.TauxTaxeSejourTrim;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;


public class TauxTaxeSejourTrimSpecification extends  AbstractSpecification<TauxTaxeSejourTrimCriteria, TauxTaxeSejourTrim>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("categorieSejourCode", criteria.getCategorieSejourCode(),criteria.getCategorieSejourCodeLike());
        addPredicateBigDecimal("montantNuit", criteria.getMontantNuit(), criteria.getMontantNuitMin(), criteria.getMontantNuitMax());
        addPredicateBigDecimal("pourcentagePremierMoisRetard", criteria.getPourcentagePremierMoisRetard(), criteria.getPourcentagePremierMoisRetardMin(), criteria.getPourcentagePremierMoisRetardMax());
        addPredicateBigDecimal("pourcentageAutreMoisRetard", criteria.getPourcentageAutreMoisRetard(), criteria.getPourcentageAutreMoisRetardMin(), criteria.getPourcentageAutreMoisRetardMax());
        addPredicate("employe", criteria.getEmploye(),criteria.getEmployeLike());
    }

    public TauxTaxeSejourTrimSpecification(TauxTaxeSejourTrimCriteria criteria) {
        super(criteria);
    }

    public TauxTaxeSejourTrimSpecification(TauxTaxeSejourTrimCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
