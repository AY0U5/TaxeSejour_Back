package ma.zs.sejour.bean.core.Etat;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.sejour.zynerator.audit.AuditBusinessObject;
import ma.zs.sejour.bean.core.commun.Secteur;

import java.util.Objects;

@Entity
@Table(name = "etat_taxe_sejour_annuel")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etat_taxe_sejour_annuel_seq",sequenceName="etat_taxe_sejour_annuel_seq",allocationSize=1, initialValue = 1)

public class EtatTaxeSejour extends AuditBusinessObject {

    private Long id;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;
    @ManyToOne
    private Secteur secteur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="etat_taxe_sejour_annuel_seq")



    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Secteur getSecteur() {
        return secteur;
    }
    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtatTaxeSejour etatTaxeSejour = (EtatTaxeSejour)  o;
        return id != null && id.equals(etatTaxeSejour.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


