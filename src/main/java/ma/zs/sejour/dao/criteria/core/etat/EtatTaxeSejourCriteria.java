package ma.zs.sejour.dao.criteria.core.etat;

import ma.zs.sejour.zynerator.criteria.BaseCriteria;

public class EtatTaxeSejourCriteria extends BaseCriteria {
    private String libelle;
    private String libelleLike;
    private String code;
    private String codeLike;
    private String secteurCode;
    private String secteurCodeLike;

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

    public String getSecteurCode() {
        return secteurCode;
    }

    public void setSecteurCode(String secteurCode) {
        this.secteurCode = secteurCode;
    }

    public String getSecteurCodeLike() {
        return secteurCodeLike;
    }

    public void setSecteurCodeLike(String secteurCodeLike) {
        this.secteurCodeLike = secteurCodeLike;
    }
}
