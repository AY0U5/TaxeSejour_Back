package ma.zs.sejour.dao.specification.core.commun;


import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.dao.criteria.core.commun.EmployeCriteria;
import ma.zs.sejour.zynerator.specification.AbstractSpecification;
public class EmployeSpecification extends  AbstractSpecification<EmployeCriteria, Employe>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("paswrd", criteria.getPaswrd(),criteria.getPaswrdLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("username", criteria.getCode(),criteria.getCodeLike());
    }

    public EmployeSpecification(EmployeCriteria criteria) {
        super(criteria);
    }

    public EmployeSpecification(EmployeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
