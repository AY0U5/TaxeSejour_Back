package ma.zs.sejour.dao.criteria.core.commun;



import ma.zs.sejour.zynerator.criteria.BaseCriteria;


public class RueCriteria extends BaseCriteria {

    private String libelle;
    private String libelleLike;
    private String code;
    private String codeLike;
    private String quartierCode;
    private String quartierCodeLike;

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

    public String getQuartierCode() {
        return quartierCode;
    }

    public void setQuartierCode(String quartierCode) {
        this.quartierCode = quartierCode;
    }

    public String getQuartierCodeLike() {
        return quartierCodeLike;
    }

    public void setQuartierCodeLike(String quartierCodeLike) {
        this.quartierCodeLike = quartierCodeLike;
    }
}
