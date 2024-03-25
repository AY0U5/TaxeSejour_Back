package  ma.zs.sejour.dao.specification.core.Taxe;

import ma.zs.sejour.dao.criteria.core.Taxe.TaxeSejourTrimCriteria;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;


public class TaxeSejourTrimSpecification extends  AbstractSpecification<TaxeSejourTrimCriteria, TaxeSejourTrim>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("locale", criteria.getLocale(),criteria.getLocaleLike());
        addPredicate("redevable", criteria.getRedevable(),criteria.getRedevableLike());
        addPredicateBigDecimal("nbrNuit", criteria.getNbrNuit(), criteria.getNbrNuitMin(), criteria.getNbrNuitMax());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateBigDecimal("trim", criteria.getTrim(), criteria.getTrimMin(), criteria.getTrimMax());
        addPredicateBigDecimal("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicateBigDecimal("montantBase", criteria.getMontantBase(), criteria.getMontantBaseMin(), criteria.getMontantBaseMax());
        addPredicateInt("nbrMoisRetard", criteria.getNbrMoisRetard(), criteria.getNbrMoisRetardMin(), criteria.getNbrMoisRetardMax());
        addPredicateBigDecimal("montantRetard", criteria.getMontantRetard(), criteria.getMontantRetardMin(), criteria.getMontantRetardMax());
        addPredicateBigDecimal("montantPremierMoisRetard", criteria.getMontantPremierMoisRetard(), criteria.getMontantPremierMoisRetardMin(), criteria.getMontantPremierMoisRetardMax());
        addPredicateBigDecimal("montantAutreMoisRetard", criteria.getMontantAutreMoisRetard(), criteria.getMontantAutreMoisRetardMin(), criteria.getMontantAutreMoisRetardMax());
        addPredicateBigDecimal("montantTotal", criteria.getMontantTotal(), criteria.getMontantTotalMin(), criteria.getMontantTotalMax());
        addPredicate("employe", criteria.getEmploye(),criteria.getEmployeLike());
        addPredicateFk("tauxTaxeSejourTrim","id", criteria.getTauxTaxeSejourTrim()==null?null:criteria.getTauxTaxeSejourTrim().getId());
        addPredicateFk("tauxTaxeSejourTrim","id", criteria.getTauxTaxeSejourTrims());
    }

    public TaxeSejourTrimSpecification(TaxeSejourTrimCriteria criteria) {
        super(criteria);
    }

    public TaxeSejourTrimSpecification(TaxeSejourTrimCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
