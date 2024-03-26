package ma.zs.sejour.dao.criteria.core.commun;


import ma.zs.sejour.zynerator.criteria.BaseCriteria;

public class RedevableCriteria extends BaseCriteria {

    private String code;
    private String codeLike;
    private String cin;
    private String cinLike;
    private String nom;
    private String nomLike;
    private String typeRedevableCode;
    private String typeRedevableCodeLike;


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

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getCinLike() {
        return cinLike;
    }

    public void setCinLike(String cinLike) {
        this.cinLike = cinLike;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomLike() {
        return nomLike;
    }

    public void setNomLike(String nomLike) {
        this.nomLike = nomLike;
    }

    public String getTypeRedevableCode() {
        return typeRedevableCode;
    }

    public void setTypeRedevableCode(String typeRedevableCode) {
        this.typeRedevableCode = typeRedevableCode;
    }

    public String getTypeRedevableCodeLike() {
        return typeRedevableCodeLike;
    }

    public void setTypeRedevableCodeLike(String typeRedevableCodeLike) {
        this.typeRedevableCodeLike = typeRedevableCodeLike;
    }
}
