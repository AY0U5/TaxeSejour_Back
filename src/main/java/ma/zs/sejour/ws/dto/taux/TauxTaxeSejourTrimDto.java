package  ma.zs.sejour.ws.dto.taux;

import ma.zs.sejour.zynerator.audit.Log;
import ma.zs.sejour.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;




@JsonInclude(JsonInclude.Include.NON_NULL)
public class TauxTaxeSejourTrimDto  extends AuditBaseDto {

    private String categorieSejourCode  ;
    private BigDecimal montantNuit  ;
    private BigDecimal pourcentagePremierMoisRetard  ;
    private BigDecimal pourcentageAutreMoisRetard  ;
    private String employe  ;




    public TauxTaxeSejourTrimDto(){
        super();
    }



    @Log
    public String getCategorieSejourCode(){
        return this.categorieSejourCode;
    }
    public void setCategorieSejourCode(String categorieSejourCode){
        this.categorieSejourCode = categorieSejourCode;
    }

    @Log
    public BigDecimal getMontantNuit(){
        return this.montantNuit;
    }
    public void setMontantNuit(BigDecimal montantNuit){
        this.montantNuit = montantNuit;
    }

    @Log
    public BigDecimal getPourcentagePremierMoisRetard(){
        return this.pourcentagePremierMoisRetard;
    }
    public void setPourcentagePremierMoisRetard(BigDecimal pourcentagePremierMoisRetard){
        this.pourcentagePremierMoisRetard = pourcentagePremierMoisRetard;
    }

    @Log
    public BigDecimal getPourcentageAutreMoisRetard(){
        return this.pourcentageAutreMoisRetard;
    }
    public void setPourcentageAutreMoisRetard(BigDecimal pourcentageAutreMoisRetard){
        this.pourcentageAutreMoisRetard = pourcentageAutreMoisRetard;
    }

    @Log
    public String getEmploye(){
        return this.employe;
    }
    public void setEmploye(String employe){
        this.employe = employe;
    }








}
