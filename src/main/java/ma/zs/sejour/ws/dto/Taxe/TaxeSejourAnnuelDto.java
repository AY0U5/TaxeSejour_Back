package  ma.zs.sejour.ws.dto.Taxe;

import ma.zs.sejour.zynerator.audit.Log;
import ma.zs.sejour.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


import ma.zs.sejour.ws.dto.taux.TauxTaxeSejourAnnuelDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaxeSejourAnnuelDto  extends AuditBaseDto {

    private String code  ;
    private BigDecimal montantBase  ;
    private Integer annee  = 0 ;
    private String etatTaxeSejour  ;
    private BigDecimal montantTotal  ;
    private BigDecimal montantRetard  ;
    private BigDecimal nbrMoisRetard  ;
    private String employe  ;

    private TauxTaxeSejourAnnuelDto tauxTaxeSejourAnnuel ;



    public TaxeSejourAnnuelDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public BigDecimal getMontantBase(){
        return this.montantBase;
    }
    public void setMontantBase(BigDecimal montantBase){
        this.montantBase = montantBase;
    }

    @Log
    public Integer getAnnee(){
        return this.annee;
    }
    public void setAnnee(Integer annee){
        this.annee = annee;
    }

    @Log
    public String getEtatTaxeSejour(){
        return this.etatTaxeSejour;
    }
    public void setEtatTaxeSejour(String etatTaxeSejour){
        this.etatTaxeSejour = etatTaxeSejour;
    }

    @Log
    public BigDecimal getMontantTotal(){
        return this.montantTotal;
    }
    public void setMontantTotal(BigDecimal montantTotal){
        this.montantTotal = montantTotal;
    }

    @Log
    public BigDecimal getMontantRetard(){
        return this.montantRetard;
    }
    public void setMontantRetard(BigDecimal montantRetard){
        this.montantRetard = montantRetard;
    }

    @Log
    public BigDecimal getNbrMoisRetard(){
        return this.nbrMoisRetard;
    }
    public void setNbrMoisRetard(BigDecimal nbrMoisRetard){
        this.nbrMoisRetard = nbrMoisRetard;
    }

    @Log
    public String getEmploye(){
        return this.employe;
    }
    public void setEmploye(String employe){
        this.employe = employe;
    }


    public TauxTaxeSejourAnnuelDto getTauxTaxeSejourAnnuel(){
        return this.tauxTaxeSejourAnnuel;
    }

    public void setTauxTaxeSejourAnnuel(TauxTaxeSejourAnnuelDto tauxTaxeSejourAnnuel){
        this.tauxTaxeSejourAnnuel = tauxTaxeSejourAnnuel;
    }






}
