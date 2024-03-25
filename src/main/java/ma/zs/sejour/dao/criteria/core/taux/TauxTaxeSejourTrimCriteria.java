package  ma.zs.sejour.dao.criteria.core.taux;



import ma.zs.sejour.zynerator.criteria.BaseCriteria;
import java.util.List;

public class TauxTaxeSejourTrimCriteria extends  BaseCriteria  {

    private String categorieSejourCode;
    private String categorieSejourCodeLike;
    private String montantNuit;
    private String montantNuitMin;
    private String montantNuitMax;
    private String pourcentagePremierMoisRetard;
    private String pourcentagePremierMoisRetardMin;
    private String pourcentagePremierMoisRetardMax;
    private String pourcentageAutreMoisRetard;
    private String pourcentageAutreMoisRetardMin;
    private String pourcentageAutreMoisRetardMax;
    private String employe;
    private String employeLike;



    public TauxTaxeSejourTrimCriteria(){}

    public String getCategorieSejourCode(){
        return this.categorieSejourCode;
    }
    public void setCategorieSejourCode(String categorieSejourCode){
        this.categorieSejourCode = categorieSejourCode;
    }
    public String getCategorieSejourCodeLike(){
        return this.categorieSejourCodeLike;
    }
    public void setCategorieSejourCodeLike(String categorieSejourCodeLike){
        this.categorieSejourCodeLike = categorieSejourCodeLike;
    }

    public String getMontantNuit(){
        return this.montantNuit;
    }
    public void setMontantNuit(String montantNuit){
        this.montantNuit = montantNuit;
    }   
    public String getMontantNuitMin(){
        return this.montantNuitMin;
    }
    public void setMontantNuitMin(String montantNuitMin){
        this.montantNuitMin = montantNuitMin;
    }
    public String getMontantNuitMax(){
        return this.montantNuitMax;
    }
    public void setMontantNuitMax(String montantNuitMax){
        this.montantNuitMax = montantNuitMax;
    }
      
    public String getPourcentagePremierMoisRetard(){
        return this.pourcentagePremierMoisRetard;
    }
    public void setPourcentagePremierMoisRetard(String pourcentagePremierMoisRetard){
        this.pourcentagePremierMoisRetard = pourcentagePremierMoisRetard;
    }   
    public String getPourcentagePremierMoisRetardMin(){
        return this.pourcentagePremierMoisRetardMin;
    }
    public void setPourcentagePremierMoisRetardMin(String pourcentagePremierMoisRetardMin){
        this.pourcentagePremierMoisRetardMin = pourcentagePremierMoisRetardMin;
    }
    public String getPourcentagePremierMoisRetardMax(){
        return this.pourcentagePremierMoisRetardMax;
    }
    public void setPourcentagePremierMoisRetardMax(String pourcentagePremierMoisRetardMax){
        this.pourcentagePremierMoisRetardMax = pourcentagePremierMoisRetardMax;
    }
      
    public String getPourcentageAutreMoisRetard(){
        return this.pourcentageAutreMoisRetard;
    }
    public void setPourcentageAutreMoisRetard(String pourcentageAutreMoisRetard){
        this.pourcentageAutreMoisRetard = pourcentageAutreMoisRetard;
    }   
    public String getPourcentageAutreMoisRetardMin(){
        return this.pourcentageAutreMoisRetardMin;
    }
    public void setPourcentageAutreMoisRetardMin(String pourcentageAutreMoisRetardMin){
        this.pourcentageAutreMoisRetardMin = pourcentageAutreMoisRetardMin;
    }
    public String getPourcentageAutreMoisRetardMax(){
        return this.pourcentageAutreMoisRetardMax;
    }
    public void setPourcentageAutreMoisRetardMax(String pourcentageAutreMoisRetardMax){
        this.pourcentageAutreMoisRetardMax = pourcentageAutreMoisRetardMax;
    }
      
    public String getEmploye(){
        return this.employe;
    }
    public void setEmploye(String employe){
        this.employe = employe;
    }
    public String getEmployeLike(){
        return this.employeLike;
    }
    public void setEmployeLike(String employeLike){
        this.employeLike = employeLike;
    }


}
