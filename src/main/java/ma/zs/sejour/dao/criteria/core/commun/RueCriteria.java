package ma.zs.sejour.dao.criteria.core.commun;



import ma.zs.sejour.zynerator.criteria.BaseCriteria;

public class RueCriteria extends BaseCriteria {

    private String libelle;
    private String libelleLike;
    private String code;
    private String codeLike;
    private QuartierCriteria quartierCriteria;


    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelleLike() {
        return libelleLike;
    }

    public void setLibelleLike(String libelleLike) {
        this.libelleLike = libelleLike;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeLike() {
        return codeLike;
    }

    public void setCodeLike(String codeLike) {
        this.codeLike = codeLike;
    }

    public QuartierCriteria getQuartierCriteria() {
        return quartierCriteria;
    }

    public void setQuartierCriteria(QuartierCriteria quartierCriteria) {
        this.quartierCriteria = quartierCriteria;
    }
}
