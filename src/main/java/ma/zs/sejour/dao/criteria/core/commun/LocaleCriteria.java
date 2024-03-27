package ma.zs.sejour.dao.criteria.core.commun;


import ma.zs.sejour.zynerator.criteria.BaseCriteria;

public class LocaleCriteria extends BaseCriteria {

    private String code;
    private String codeLike;

    private String libelle;
    private String libelleLike;

    private String rueCode;
    private String rueCodeLike;

    private String categorieSejourCode ;
    private String categorieSejourCodeLike ;

    private String redevableCode;
    private String redevableCodeLike;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getRueCode() {
        return rueCode;
    }

    public void setRueCode(String rueCode) {
        this.rueCode = rueCode;
    }

    public String getCategorieSejourCode() {
        return categorieSejourCode;
    }

    public void setCategorieSejourCode(String categorieSejourCode) {
        this.categorieSejourCode = categorieSejourCode;
    }

    public String getRedevableCode() {
        return redevableCode;
    }

    public void setRedevableCode(String redevableCode) {
        this.redevableCode = redevableCode;
    }

    public String getCodeLike() {
        return codeLike;
    }

    public void setCodeLike(String codeLike) {
        this.codeLike = codeLike;
    }

    public String getLibelleLike() {
        return libelleLike;
    }

    public void setLibelleLike(String libelleLike) {
        this.libelleLike = libelleLike;
    }

    public String getRueCodeLike() {
        return rueCodeLike;
    }

    public void setRueCodeLike(String rueCodeLike) {
        this.rueCodeLike = rueCodeLike;
    }

    public String getCategorieSejourCodeLike() {
        return categorieSejourCodeLike;
    }

    public void setCategorieSejourCodeLike(String categorieSejourCodeLike) {
        this.categorieSejourCodeLike = categorieSejourCodeLike;
    }

    public String getRedevableCodeLike() {
        return redevableCodeLike;
    }

    public void setRedevableCodeLike(String redevableCodeLike) {
        this.redevableCodeLike = redevableCodeLike;
    }
}
