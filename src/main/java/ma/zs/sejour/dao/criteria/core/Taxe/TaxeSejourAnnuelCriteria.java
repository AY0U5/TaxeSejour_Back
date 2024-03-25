package  ma.zs.sejour.dao.criteria.core.Taxe;


import ma.zs.sejour.dao.criteria.core.taux.TauxTaxeSejourAnnuelCriteria;

import ma.zs.sejour.zynerator.criteria.BaseCriteria;
import java.util.List;

public class TaxeSejourAnnuelCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String montantBase;
    private String montantBaseMin;
    private String montantBaseMax;
    private String annee;
    private String anneeMin;
    private String anneeMax;
    private String etatTaxeSejour;
    private String etatTaxeSejourLike;
    private String montantTotal;
    private String montantTotalMin;
    private String montantTotalMax;
    private String montantRetard;
    private String montantRetardMin;
    private String montantRetardMax;
    private String nbrMoisRetard;
    private String nbrMoisRetardMin;
    private String nbrMoisRetardMax;
    private String employe;
    private String employeLike;

    private TauxTaxeSejourAnnuelCriteria tauxTaxeSejourAnnuel ;
    private List<TauxTaxeSejourAnnuelCriteria> tauxTaxeSejourAnnuels ;


    public TaxeSejourAnnuelCriteria(){}

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
      
    public String getEtatTaxeSejour(){
        return this.etatTaxeSejour;
    }
    public void setEtatTaxeSejour(String etatTaxeSejour){
        this.etatTaxeSejour = etatTaxeSejour;
    }
    public String getEtatTaxeSejourLike(){
        return this.etatTaxeSejourLike;
    }
    public void setEtatTaxeSejourLike(String etatTaxeSejourLike){
        this.etatTaxeSejourLike = etatTaxeSejourLike;
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


    public TauxTaxeSejourAnnuelCriteria getTauxTaxeSejourAnnuel(){
        return this.tauxTaxeSejourAnnuel;
    }

    public void setTauxTaxeSejourAnnuel(TauxTaxeSejourAnnuelCriteria tauxTaxeSejourAnnuel){
        this.tauxTaxeSejourAnnuel = tauxTaxeSejourAnnuel;
    }
    public List<TauxTaxeSejourAnnuelCriteria> getTauxTaxeSejourAnnuels(){
        return this.tauxTaxeSejourAnnuels;
    }

    public void setTauxTaxeSejourAnnuels(List<TauxTaxeSejourAnnuelCriteria> tauxTaxeSejourAnnuels){
        this.tauxTaxeSejourAnnuels = tauxTaxeSejourAnnuels;
    }
}
