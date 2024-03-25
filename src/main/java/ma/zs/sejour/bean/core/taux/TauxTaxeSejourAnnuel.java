package ma.zs.sejour.bean.core.taux;

import java.util.Objects;







import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.sejour.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;


import java.math.BigDecimal;


@Entity
@Table(name = "taux_taxe_sejour_annuel")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="taux_taxe_sejour_annuel_seq",sequenceName="taux_taxe_sejour_annuel_seq",allocationSize=1, initialValue = 1)
public class TauxTaxeSejourAnnuel   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String categorieSejourCode;
    private BigDecimal montantNuit = BigDecimal.ZERO;
    private BigDecimal pourcentagePremierMoisRetard = BigDecimal.ZERO;
    private BigDecimal pourcentageAutreMoisRetard = BigDecimal.ZERO;
    @Column(length = 500)
    private String employe;



    public TauxTaxeSejourAnnuel(){
        super();
    }

    public TauxTaxeSejourAnnuel(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="taux_taxe_sejour_annuel_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCategorieSejourCode(){
        return this.categorieSejourCode;
    }
    public void setCategorieSejourCode(String categorieSejourCode){
        this.categorieSejourCode = categorieSejourCode;
    }
    public BigDecimal getMontantNuit(){
        return this.montantNuit;
    }
    public void setMontantNuit(BigDecimal montantNuit){
        this.montantNuit = montantNuit;
    }
    public BigDecimal getPourcentagePremierMoisRetard(){
        return this.pourcentagePremierMoisRetard;
    }
    public void setPourcentagePremierMoisRetard(BigDecimal pourcentagePremierMoisRetard){
        this.pourcentagePremierMoisRetard = pourcentagePremierMoisRetard;
    }
    public BigDecimal getPourcentageAutreMoisRetard(){
        return this.pourcentageAutreMoisRetard;
    }
    public void setPourcentageAutreMoisRetard(BigDecimal pourcentageAutreMoisRetard){
        this.pourcentageAutreMoisRetard = pourcentageAutreMoisRetard;
    }
    public String getEmploye(){
        return this.employe;
    }
    public void setEmploye(String employe){
        this.employe = employe;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TauxTaxeSejourAnnuel tauxTaxeSejourAnnuel = (TauxTaxeSejourAnnuel) o;
        return id != null && id.equals(tauxTaxeSejourAnnuel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

