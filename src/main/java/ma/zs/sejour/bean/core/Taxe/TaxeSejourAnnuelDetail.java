package ma.zs.sejour.bean.core.Taxe;

import java.util.Objects;





import ma.zs.sejour.bean.core.Taxe.TaxeSejourAnnuel;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.sejour.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "taxe_sejour_annuel_detail")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="taxe_sejour_annuel_detail_seq",sequenceName="taxe_sejour_annuel_detail_seq",allocationSize=1, initialValue = 1)
public class TaxeSejourAnnuelDetail   extends AuditBusinessObject     {

    private Long id;

    private BigDecimal nbrNuit = BigDecimal.ZERO;
    private BigDecimal trim = BigDecimal.ZERO;
    private BigDecimal annee = BigDecimal.ZERO;

    private TaxeSejourAnnuel taxeSejourAnnuel ;


    public TaxeSejourAnnuelDetail(){
        super();
    }

    public TaxeSejourAnnuelDetail(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="taxe_sejour_annuel_detail_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public BigDecimal getNbrNuit(){
        return this.nbrNuit;
    }
    public void setNbrNuit(BigDecimal nbrNuit){
        this.nbrNuit = nbrNuit;
    }
    public BigDecimal getTrim(){
        return this.trim;
    }
    public void setTrim(BigDecimal trim){
        this.trim = trim;
    }
    public BigDecimal getAnnee(){
        return this.annee;
    }
    public void setAnnee(BigDecimal annee){
        this.annee = annee;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taxe_sejour_annuel")
    public TaxeSejourAnnuel getTaxeSejourAnnuel(){
        return this.taxeSejourAnnuel;
    }
    public void setTaxeSejourAnnuel(TaxeSejourAnnuel taxeSejourAnnuel){
        this.taxeSejourAnnuel = taxeSejourAnnuel;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxeSejourAnnuelDetail taxeSejourAnnuelDetail = (TaxeSejourAnnuelDetail) o;
        return id != null && id.equals(taxeSejourAnnuelDetail.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

