package  ma.zs.sejour.dao.criteria.core.Taxe;


import ma.zs.sejour.dao.criteria.core.taux.TauxTaxeSejourTrimCriteria;

import ma.zs.sejour.zynerator.criteria.BaseCriteria;
import java.util.List;

public class TaxeSejourTrimCriteria extends  BaseCriteria  {

    private String locale;
    private String localeLike;
    private String redevable;
    private String redevableLike;
    private String nbrNuit;
    private String nbrNuitMin;
    private String nbrNuitMax;
    private String code;
    private String codeLike;
    private String trim;
    private String trimMin;
    private String trimMax;
    private String annee;
    private String anneeMin;
    private String anneeMax;
    private String montantBase;
    private String montantBaseMin;
    private String montantBaseMax;
    private String nbrMoisRetard;
    private String nbrMoisRetardMin;
    private String nbrMoisRetardMax;
    private String montantRetard;
    private String montantRetardMin;
    private String montantRetardMax;
    private String montantPremierMoisRetard;
    private String montantPremierMoisRetardMin;
    private String montantPremierMoisRetardMax;
    private String montantAutreMoisRetard;
    private String montantAutreMoisRetardMin;
    private String montantAutreMoisRetardMax;
    private String montantTotal;
    private String montantTotalMin;
    private String montantTotalMax;
    private String employe;
    private String employeLike;

    private TauxTaxeSejourTrimCriteria tauxTaxeSejourTrim ;
    private List<TauxTaxeSejourTrimCriteria> tauxTaxeSejourTrims ;


    public TaxeSejourTrimCriteria(){}

    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
    }
    public String getLocaleLike(){
        return this.localeLike;
    }
    public void setLocaleLike(String localeLike){
        this.localeLike = localeLike;
    }

    public String getRedevable(){
        return this.redevable;
    }
    public void setRedevable(String redevable){
        this.redevable = redevable;
    }
    public String getRedevableLike(){
        return this.redevableLike;
    }
    public void setRedevableLike(String redevableLike){
        this.redevableLike = redevableLike;
    }

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
      
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
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
      
    public String getMontantBase(){
        return this.montantBase;
    }
    public void setMontantBase(String montantBase){
        this.montantBase = montantBase;
    }   
    public String getMontantBaseMin(){
        return this.montantBaseMin;
    }
    public void setMontantBaseMin(String montantBaseMin){
        this.montantBaseMin = montantBaseMin;
    }
    public String getMontantBaseMax(){
        return this.montantBaseMax;
    }
    public void setMontantBaseMax(String montantBaseMax){
        this.montantBaseMax = montantBaseMax;
    }
      
    public String getNbrMoisRetard(){
        return this.nbrMoisRetard;
    }
    public void setNbrMoisRetard(String nbrMoisRetard){
        this.nbrMoisRetard = nbrMoisRetard;
    }   
    public String getNbrMoisRetardMin(){
        return this.nbrMoisRetardMin;
    }
    public void setNbrMoisRetardMin(String nbrMoisRetardMin){
        this.nbrMoisRetardMin = nbrMoisRetardMin;
    }
    public String getNbrMoisRetardMax(){
        return this.nbrMoisRetardMax;
    }
    public void setNbrMoisRetardMax(String nbrMoisRetardMax){
        this.nbrMoisRetardMax = nbrMoisRetardMax;
    }
      
    public String getMontantRetard(){
        return this.montantRetard;
    }
    public void setMontantRetard(String montantRetard){
        this.montantRetard = montantRetard;
    }   
    public String getMontantRetardMin(){
        return this.montantRetardMin;
    }
    public void setMontantRetardMin(String montantRetardMin){
        this.montantRetardMin = montantRetardMin;
    }
    public String getMontantRetardMax(){
        return this.montantRetardMax;
    }
    public void setMontantRetardMax(String montantRetardMax){
        this.montantRetardMax = montantRetardMax;
    }
      
    public String getMontantPremierMoisRetard(){
        return this.montantPremierMoisRetard;
    }
    public void setMontantPremierMoisRetard(String montantPremierMoisRetard){
        this.montantPremierMoisRetard = montantPremierMoisRetard;
    }   
    public String getMontantPremierMoisRetardMin(){
        return this.montantPremierMoisRetardMin;
    }
    public void setMontantPremierMoisRetardMin(String montantPremierMoisRetardMin){
        this.montantPremierMoisRetardMin = montantPremierMoisRetardMin;
    }
    public String getMontantPremierMoisRetardMax(){
        return this.montantPremierMoisRetardMax;
    }
    public void setMontantPremierMoisRetardMax(String montantPremierMoisRetardMax){
        this.montantPremierMoisRetardMax = montantPremierMoisRetardMax;
    }
      
    public String getMontantAutreMoisRetard(){
        return this.montantAutreMoisRetard;
    }
    public void setMontantAutreMoisRetard(String montantAutreMoisRetard){
        this.montantAutreMoisRetard = montantAutreMoisRetard;
    }   
    public String getMontantAutreMoisRetardMin(){
        return this.montantAutreMoisRetardMin;
    }
    public void setMontantAutreMoisRetardMin(String montantAutreMoisRetardMin){
        this.montantAutreMoisRetardMin = montantAutreMoisRetardMin;
    }
    public String getMontantAutreMoisRetardMax(){
        return this.montantAutreMoisRetardMax;
    }
    public void setMontantAutreMoisRetardMax(String montantAutreMoisRetardMax){
        this.montantAutreMoisRetardMax = montantAutreMoisRetardMax;
    }
      
    public String getMontantTotal(){
        return this.montantTotal;
    }
    public void setMontantTotal(String montantTotal){
        this.montantTotal = montantTotal;
    }   
    public String getMontantTotalMin(){
        return this.montantTotalMin;
    }
    public void setMontantTotalMin(String montantTotalMin){
        this.montantTotalMin = montantTotalMin;
    }
    public String getMontantTotalMax(){
        return this.montantTotalMax;
    }
    public void setMontantTotalMax(String montantTotalMax){
        this.montantTotalMax = montantTotalMax;
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


    public TauxTaxeSejourTrimCriteria getTauxTaxeSejourTrim(){
        return this.tauxTaxeSejourTrim;
    }

    public void setTauxTaxeSejourTrim(TauxTaxeSejourTrimCriteria tauxTaxeSejourTrim){
        this.tauxTaxeSejourTrim = tauxTaxeSejourTrim;
    }
    public List<TauxTaxeSejourTrimCriteria> getTauxTaxeSejourTrims(){
        return this.tauxTaxeSejourTrims;
    }

    public void setTauxTaxeSejourTrims(List<TauxTaxeSejourTrimCriteria> tauxTaxeSejourTrims){
        this.tauxTaxeSejourTrims = tauxTaxeSejourTrims;
    }
}
