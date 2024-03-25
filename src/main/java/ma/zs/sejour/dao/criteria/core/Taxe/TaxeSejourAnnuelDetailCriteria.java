package  ma.zs.sejour.dao.criteria.core.Taxe;



import ma.zs.sejour.zynerator.criteria.BaseCriteria;
import java.util.List;

public class TaxeSejourAnnuelDetailCriteria extends  BaseCriteria  {

    private String nbrNuit;
    private String nbrNuitMin;
    private String nbrNuitMax;
    private String trim;
    private String trimMin;
    private String trimMax;
    private String annee;
    private String anneeMin;
    private String anneeMax;

    private TaxeSejourAnnuelCriteria taxeSejourAnnuel ;
    private List<TaxeSejourAnnuelCriteria> taxeSejourAnnuels ;


    public TaxeSejourAnnuelDetailCriteria(){}

    public String getNbrNuit(){
        return this.nbrNuit;
    }
    public void setNbrNuit(String nbrNuit){
        this.nbrNuit = nbrNuit;
    }   
    public String getNbrNuitMin(){
        return this.nbrNuitMin;
    }
    public void setNbrNuitMin(String nbrNuitMin){
        this.nbrNuitMin = nbrNuitMin;
    }
    public String getNbrNuitMax(){
        return this.nbrNuitMax;
    }
    public void setNbrNuitMax(String nbrNuitMax){
        this.nbrNuitMax = nbrNuitMax;
    }
      
    public String getTrim(){
        return this.trim;
    }
    public void setTrim(String trim){
        this.trim = trim;
    }   
    public String getTrimMin(){
        return this.trimMin;
    }
    public void setTrimMin(String trimMin){
        this.trimMin = trimMin;
    }
    public String getTrimMax(){
        return this.trimMax;
    }
    public void setTrimMax(String trimMax){
        this.trimMax = trimMax;
    }
      
    public String getAnnee(){
        return this.annee;
    }
    public void setAnnee(String annee){
        this.annee = annee;
    }   
    public String getAnneeMin(){
        return this.anneeMin;
    }
    public void setAnneeMin(String anneeMin){
        this.anneeMin = anneeMin;
    }
    public String getAnneeMax(){
        return this.anneeMax;
    }
    public void setAnneeMax(String anneeMax){
        this.anneeMax = anneeMax;
    }
      

    public TaxeSejourAnnuelCriteria getTaxeSejourAnnuel(){
        return this.taxeSejourAnnuel;
    }

    public void setTaxeSejourAnnuel(TaxeSejourAnnuelCriteria taxeSejourAnnuel){
        this.taxeSejourAnnuel = taxeSejourAnnuel;
    }
    public List<TaxeSejourAnnuelCriteria> getTaxeSejourAnnuels(){
        return this.taxeSejourAnnuels;
    }

    public void setTaxeSejourAnnuels(List<TaxeSejourAnnuelCriteria> taxeSejourAnnuels){
        this.taxeSejourAnnuels = taxeSejourAnnuels;
    }
}
