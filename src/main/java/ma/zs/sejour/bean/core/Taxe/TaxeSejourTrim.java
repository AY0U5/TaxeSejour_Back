package ma.zs.sejour.bean.core.Taxe;

import java.util.Objects;


import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.bean.core.taux.TauxTaxeSejourTrim;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.sejour.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import org.apache.poi.sl.draw.EmbeddedExtractor;

import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "taxe_sejour_trim")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="taxe_sejour_trim_seq",sequenceName="taxe_sejour_trim_seq",allocationSize=1, initialValue = 1)
public class TaxeSejourTrim   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String locale;
    @Column(length = 500)
    private String redevable;
    private BigDecimal nbrNuit = BigDecimal.ZERO;
    @Column(length = 500)
    private String code;
    private BigDecimal trim = BigDecimal.ZERO;
    private BigDecimal annee = BigDecimal.ZERO;
    private BigDecimal montantBase = BigDecimal.ZERO;
    private Integer nbrMoisRetard = 0;
    private BigDecimal montantRetard = BigDecimal.ZERO;
    private BigDecimal montantPremierMoisRetard = BigDecimal.ZERO;
    private BigDecimal montantAutreMoisRetard = BigDecimal.ZERO;
    private BigDecimal montantTotal = BigDecimal.ZERO;

    private Employe employe;

    private TauxTaxeSejourTrim tauxTaxeSejourTrim ;


    public TaxeSejourTrim(){
        super();
    }

    public TaxeSejourTrim(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="taxe_sejour_trim_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getLocale(){
        return this.locale;
    }
    public void setLocale(String locale){
        this.locale = locale;
    }
    public String getRedevable(){
        return this.redevable;
    }
    public void setRedevable(String redevable){
        this.redevable = redevable;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taux_taxe_sejour_trim")
    public TauxTaxeSejourTrim getTauxTaxeSejourTrim(){
        return this.tauxTaxeSejourTrim;
    }
    public void setTauxTaxeSejourTrim(TauxTaxeSejourTrim tauxTaxeSejourTrim){
        this.tauxTaxeSejourTrim = tauxTaxeSejourTrim;
    }
    public BigDecimal getNbrNuit(){
        return this.nbrNuit;
    }
    public void setNbrNuit(BigDecimal nbrNuit){
        this.nbrNuit = nbrNuit;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
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
    public BigDecimal getMontantBase(){
        return this.montantBase;
    }
    public void setMontantBase(BigDecimal montantBase){
        this.montantBase = montantBase;
    }
    public Integer getNbrMoisRetard(){
        return this.nbrMoisRetard;
    }
    public void setNbrMoisRetard(Integer nbrMoisRetard){
        this.nbrMoisRetard = nbrMoisRetard;
    }
    public BigDecimal getMontantRetard(){
        return this.montantRetard;
    }
    public void setMontantRetard(BigDecimal montantRetard){
        this.montantRetard = montantRetard;
    }
    public BigDecimal getMontantPremierMoisRetard(){
        return this.montantPremierMoisRetard;
    }
    public void setMontantPremierMoisRetard(BigDecimal montantPremierMoisRetard){
        this.montantPremierMoisRetard = montantPremierMoisRetard;
    }
    public BigDecimal getMontantAutreMoisRetard(){
        return this.montantAutreMoisRetard;
    }
    public void setMontantAutreMoisRetard(BigDecimal montantAutreMoisRetard){
        this.montantAutreMoisRetard = montantAutreMoisRetard;
    }
    public BigDecimal getMontantTotal(){
        return this.montantTotal;
    }
    public void setMontantTotal(BigDecimal montantTotal){
        this.montantTotal = montantTotal;
    }

    @ManyToOne
    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxeSejourTrim taxeSejourTrim = (TaxeSejourTrim) o;
        return id != null && id.equals(taxeSejourTrim.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

