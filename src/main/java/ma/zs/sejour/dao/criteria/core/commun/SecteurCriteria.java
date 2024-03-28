package ma.zs.sejour.dao.criteria.core.commun;



import ma.zs.sejour.bean.core.commun.Ville;
import ma.zs.sejour.zynerator.criteria.BaseCriteria;

public class SecteurCriteria extends BaseCriteria {

    private String libelle;
    private String libelleLike;
    private String code;
    private String codeLike;
    private VilleCriteria villeCriteria;

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

    public VilleCriteria getVilleCriteria() {
        return villeCriteria;
    }

    public void setVilleCriteria(VilleCriteria villeCriteria) {
        this.villeCriteria = villeCriteria;
    }
}
