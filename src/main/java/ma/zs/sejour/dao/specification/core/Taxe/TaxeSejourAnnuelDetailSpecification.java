package  ma.zs.sejour.dao.specification.core.Taxe;

import ma.zs.sejour.dao.criteria.core.Taxe.TaxeSejourAnnuelDetailCriteria;
import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuelDetail;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;


public class TaxeSejourAnnuelDetailSpecification extends  AbstractSpecification<TaxeSejourAnnuelDetailCriteria, TaxeSejourAnnuelDetail>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("nbrNuit", criteria.getNbrNuit(), criteria.getNbrNuitMin(), criteria.getNbrNuitMax());
        addPredicateBigDecimal("trim", criteria.getTrim(), criteria.getTrimMin(), criteria.getTrimMax());
        addPredicateBigDecimal("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicateFk("taxeSejourAnnuel","id", criteria.getTaxeSejourAnnuel()==null?null:criteria.getTaxeSejourAnnuel().getId());
        addPredicateFk("taxeSejourAnnuel","id", criteria.getTaxeSejourAnnuels());
    }

    public TaxeSejourAnnuelDetailSpecification(TaxeSejourAnnuelDetailCriteria criteria) {
        super(criteria);
    }

    public TaxeSejourAnnuelDetailSpecification(TaxeSejourAnnuelDetailCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
