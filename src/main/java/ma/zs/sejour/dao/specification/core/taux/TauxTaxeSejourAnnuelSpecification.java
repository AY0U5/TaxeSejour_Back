package  ma.zs.sejour.dao.specification.core.taux;

import ma.zs.sejour.dao.criteria.core.taux.TauxTaxeSejourAnnuelCriteria;
import ma.zs.sejour.bean.core.taux.TauxTaxeSejourAnnuel;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;


public class TauxTaxeSejourAnnuelSpecification extends  AbstractSpecification<TauxTaxeSejourAnnuelCriteria, TauxTaxeSejourAnnuel>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("categorieSejourCode", criteria.getCategorieSejourCode(),criteria.getCategorieSejourCodeLike());
        addPredicateBigDecimal("montantNuit", criteria.getMontantNuit(), criteria.getMontantNuitMin(), criteria.getMontantNuitMax());
        addPredicateBigDecimal("pourcentagePremierMoisRetard", criteria.getPourcentagePremierMoisRetard(), criteria.getPourcentagePremierMoisRetardMin(), criteria.getPourcentagePremierMoisRetardMax());
        addPredicateBigDecimal("pourcentageAutreMoisRetard", criteria.getPourcentageAutreMoisRetard(), criteria.getPourcentageAutreMoisRetardMin(), criteria.getPourcentageAutreMoisRetardMax());
        addPredicate("employe", criteria.getEmploye(),criteria.getEmployeLike());
    }

    public TauxTaxeSejourAnnuelSpecification(TauxTaxeSejourAnnuelCriteria criteria) {
        super(criteria);
    }

    public TauxTaxeSejourAnnuelSpecification(TauxTaxeSejourAnnuelCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
