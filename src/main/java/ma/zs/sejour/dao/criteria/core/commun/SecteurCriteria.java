package ma.zs.sejour.dao.criteria.core.commun;



import ma.zs.sejour.zynerator.criteria.BaseCriteria;

public class SecteurCriteria extends BaseCriteria {

    private String libelle;
    private String libelleLike;
    private String code;
    private String codeLike;
    private String villeCode;
    private String villeCodeLike;

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

    public String getVilleCode() {
        return villeCode;
    }

    public void setVilleCode(String villeCode) {
        this.villeCode = villeCode;
    }

    public String getVilleCodeLike() {
        return villeCodeLike;
    }

    public void setVilleCodeLike(String villeCodeLike) {
        this.villeCodeLike = villeCodeLike;
    }
}
