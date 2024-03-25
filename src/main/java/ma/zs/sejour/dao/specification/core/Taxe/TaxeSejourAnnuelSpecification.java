package  ma.zs.sejour.dao.specification.core.Taxe;

import ma.zs.sejour.dao.criteria.core.Taxe.TaxeSejourAnnuelCriteria;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuel;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;


public class TaxeSejourAnnuelSpecification extends  AbstractSpecification<TaxeSejourAnnuelCriteria, TaxeSejourAnnuel>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateBigDecimal("montantBase", criteria.getMontantBase(), criteria.getMontantBaseMin(), criteria.getMontantBaseMax());
        addPredicateInt("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicate("etatTaxeSejour", criteria.getEtatTaxeSejour(),criteria.getEtatTaxeSejourLike());
        addPredicateBigDecimal("montantTotal", criteria.getMontantTotal(), criteria.getMontantTotalMin(), criteria.getMontantTotalMax());
        addPredicateBigDecimal("montantRetard", criteria.getMontantRetard(), criteria.getMontantRetardMin(), criteria.getMontantRetardMax());
        addPredicateBigDecimal("nbrMoisRetard", criteria.getNbrMoisRetard(), criteria.getNbrMoisRetardMin(), criteria.getNbrMoisRetardMax());
        addPredicate("employe", criteria.getEmploye(),criteria.getEmployeLike());
        addPredicateFk("tauxTaxeSejourAnnuel","id", criteria.getTauxTaxeSejourAnnuel()==null?null:criteria.getTauxTaxeSejourAnnuel().getId());
        addPredicateFk("tauxTaxeSejourAnnuel","id", criteria.getTauxTaxeSejourAnnuels());
    }

    public TaxeSejourAnnuelSpecification(TaxeSejourAnnuelCriteria criteria) {
        super(criteria);
    }

    public TaxeSejourAnnuelSpecification(TaxeSejourAnnuelCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
