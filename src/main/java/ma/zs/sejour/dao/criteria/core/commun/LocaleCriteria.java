package ma.zs.sejour.dao.criteria.core.commun;


import ma.zs.sejour.bean.core.commun.Rue;
import ma.zs.sejour.zynerator.criteria.BaseCriteria;

public class LocaleCriteria extends BaseCriteria {

    private String code;
    private String codeLike;

    private String libelle;
    private String libelleLike;

    private Rue rue;

    private CategorieSejourCriteria categorieSejourCriteria;
    private RedevableCriteria redevableCriteria;


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

    public Rue getRue() {
        return rue;
    }

    public void setRue(Rue rue) {
        this.rue = rue;
    }

    public CategorieSejourCriteria getCategorieSejourCriteria() {
        return categorieSejourCriteria;
    }

    public void setCategorieSejourCriteria(CategorieSejourCriteria categorieSejourCriteria) {
        this.categorieSejourCriteria = categorieSejourCriteria;
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


    public RedevableCriteria getRedevableCriteria() {
        return redevableCriteria;
    }

    public void setRedevableCriteria(RedevableCriteria redevableCriteria) {
        this.redevableCriteria = redevableCriteria;
    }
}

