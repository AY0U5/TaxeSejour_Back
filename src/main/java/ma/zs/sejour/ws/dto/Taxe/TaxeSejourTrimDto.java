package  ma.zs.sejour.ws.dto.Taxe;

import ma.zs.sejour.zynerator.audit.Log;
import ma.zs.sejour.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


import ma.zs.sejour.ws.dto.taux.TauxTaxeSejourTrimDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaxeSejourTrimDto  extends AuditBaseDto {

    private String locale  ;
    private String redevable  ;
    private BigDecimal nbrNuit  ;
    private String code  ;
    private BigDecimal trim  ;
    private BigDecimal annee  ;
    private BigDecimal montantBase  ;
    private Integer nbrMoisRetard  = 0 ;
    private BigDecimal montantRetard  ;
    private BigDecimal montantPremierMoisRetard  ;
    private BigDecimal montantAutreMoisRetard  ;
    private BigDecimal montantTotal  ;
    private String employe  ;

    private TauxTaxeSejourTrimDto tauxTaxeSejourTrim ;



    public TaxeSejourTrimDto(){
        super();
    }



    @Log
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
    }

    @Log
    public String getRedevable(){
        return this.redevable;
    }
    public void setRedevable(String redevable){
        this.redevable = redevable;
    }

    @Log
    public BigDecimal getNbrNuit(){
        return this.nbrNuit;
    }
    public void setNbrNuit(BigDecimal nbrNuit){
        this.nbrNuit = nbrNuit;
    }

    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public BigDecimal getTrim(){
        return this.trim;
    }
    public void setTrim(BigDecimal trim){
        this.trim = trim;
    }

    @Log
    public BigDecimal getAnnee(){
        return this.annee;
    }
    public void setAnnee(BigDecimal annee){
        this.annee = annee;
    }

    @Log
    public BigDecimal getMontantBase(){
        return this.montantBase;
    }
    public void setMontantBase(BigDecimal montantBase){
        this.montantBase = montantBase;
    }

    @Log
    public Integer getNbrMoisRetard(){
        return this.nbrMoisRetard;
    }
    public void setNbrMoisRetard(Integer nbrMoisRetard){
        this.nbrMoisRetard = nbrMoisRetard;
    }

    @Log
    public BigDecimal getMontantRetard(){
        return this.montantRetard;
    }
    public void setMontantRetard(BigDecimal montantRetard){
        this.montantRetard = montantRetard;
    }

    @Log
    public BigDecimal getMontantPremierMoisRetard(){
        return this.montantPremierMoisRetard;
    }
    public void setMontantPremierMoisRetard(BigDecimal montantPremierMoisRetard){
        this.montantPremierMoisRetard = montantPremierMoisRetard;
    }

    @Log
    public BigDecimal getMontantAutreMoisRetard(){
        return this.montantAutreMoisRetard;
    }
    public void setMontantAutreMoisRetard(BigDecimal montantAutreMoisRetard){
        this.montantAutreMoisRetard = montantAutreMoisRetard;
    }

    @Log
    public BigDecimal getMontantTotal(){
        return this.montantTotal;
    }
    public void setMontantTotal(BigDecimal montantTotal){
        this.montantTotal = montantTotal;
    }

    @Log
    public String getEmploye(){
        return this.employe;
    }
    public void setEmploye(String employe){
        this.employe = employe;
    }


    public TauxTaxeSejourTrimDto getTauxTaxeSejourTrim(){
        return this.tauxTaxeSejourTrim;
    }

    public void setTauxTaxeSejourTrim(TauxTaxeSejourTrimDto tauxTaxeSejourTrim){
        this.tauxTaxeSejourTrim = tauxTaxeSejourTrim;
    }






}
