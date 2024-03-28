package  ma.zs.sejour.ws.dto.Taxe;

import ma.zs.sejour.zynerator.audit.Log;
import ma.zs.sejour.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;




@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaxeSejourAnnuelDetailDto  extends AuditBaseDto {

    private BigDecimal nbrNuit  ;
    private BigDecimal trim  ;
    private BigDecimal annee  ;

    private TaxeSejourAnnuelDto taxeSejourAnnuel ;



    public TaxeSejourAnnuelDetailDto(){
        super();
    }



    @Log
    public BigDecimal getNbrNuit(){
        return this.nbrNuit;
    }
    public void setNbrNuit(BigDecimal nbrNuit){
        this.nbrNuit = nbrNuit;
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


    public TaxeSejourAnnuelDto getTaxeSejourAnnuel(){
        return this.taxeSejourAnnuel;
    }

    public void setTaxeSejourAnnuel(TaxeSejourAnnuelDto taxeSejourAnnuel){
        this.taxeSejourAnnuel = taxeSejourAnnuel;
    }



}
