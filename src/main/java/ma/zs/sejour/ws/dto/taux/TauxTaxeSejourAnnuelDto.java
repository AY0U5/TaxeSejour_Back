package  ma.zs.sejour.ws.dto.taux;

import jakarta.persistence.ManyToOne;
import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.ws.dto.commun.EmployeDto;
import ma.zs.sejour.zynerator.audit.Log;
import ma.zs.sejour.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;




@JsonInclude(JsonInclude.Include.NON_NULL)
public class TauxTaxeSejourAnnuelDto  extends AuditBaseDto {

    private String categorieSejourCode  ;
    private BigDecimal montantNuit  ;
    private BigDecimal pourcentagePremierMoisRetard  ;
    private BigDecimal pourcentageAutreMoisRetard  ;
    private EmployeDto employe  ;




    public TauxTaxeSejourAnnuelDto(){
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

    @ManyToOne
    public EmployeDto getEmploye() {
        return employe;
    }

    public void setEmploye(EmployeDto employe) {
        this.employe = employe;
    }
}
