package ma.zs.sejour.bean.core.Taxe;

import java.util.Objects;


import ma.zs.sejour.bean.core.commun.Employe;
import ma.zs.sejour.bean.core.taux.TauxTaxeSejourAnnuel;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.sejour.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;


import java.math.BigDecimal;


@Entity
@Table(name = "taxe_sejour_annuel")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="taxe_sejour_annuel_seq",sequenceName="taxe_sejour_annuel_seq",allocationSize=1, initialValue = 1)
public class TaxeSejourAnnuel   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    private BigDecimal montantBase = BigDecimal.ZERO;
    private Integer annee = 0;
    @Column(length = 500)
    private String etatTaxeSejour;
    private BigDecimal montantTotal = BigDecimal.ZERO;
    private BigDecimal montantRetard = BigDecimal.ZERO;
    private BigDecimal nbrMoisRetard = BigDecimal.ZERO;


    private Employe employe;

    private TauxTaxeSejourAnnuel tauxTaxeSejourAnnuel ;


    public TaxeSejourAnnuel(){
        super();
    }

    public TaxeSejourAnnuel(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="taxe_sejour_annuel_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taux_taxe_sejour_annuel")
    public TauxTaxeSejourAnnuel getTauxTaxeSejourAnnuel(){
        return this.tauxTaxeSejourAnnuel;
    }
    public void setTauxTaxeSejourAnnuel(TauxTaxeSejourAnnuel tauxTaxeSejourAnnuel){
        this.tauxTaxeSejourAnnuel = tauxTaxeSejourAnnuel;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public BigDecimal getMontantBase(){
        return this.montantBase;
    }
    public void setMontantBase(BigDecimal montantBase){
        this.montantBase = montantBase;
    }
    public Integer getAnnee(){
        return this.annee;
    }
    public void setAnnee(Integer annee){
        this.annee = annee;
    }
    public String getEtatTaxeSejour(){
        return this.etatTaxeSejour;
    }
    public void setEtatTaxeSejour(String etatTaxeSejour){
        this.etatTaxeSejour = etatTaxeSejour;
    }
    public BigDecimal getMontantTotal(){
        return this.montantTotal;
    }
    public void setMontantTotal(BigDecimal montantTotal){
        this.montantTotal = montantTotal;
    }
    public BigDecimal getMontantRetard(){
        return this.montantRetard;
    }
    public void setMontantRetard(BigDecimal montantRetard){
        this.montantRetard = montantRetard;
    }
    public BigDecimal getNbrMoisRetard(){
        return this.nbrMoisRetard;
    }
    public void setNbrMoisRetard(BigDecimal nbrMoisRetard){
        this.nbrMoisRetard = nbrMoisRetard;
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
        TaxeSejourAnnuel taxeSejourAnnuel = (TaxeSejourAnnuel) o;
        return id != null && id.equals(taxeSejourAnnuel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

