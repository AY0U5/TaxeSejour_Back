package ma.zs.sejour.bean.core.commun;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.sejour.bean.core.taux.TauxTaxeSejourTrim;
import ma.zs.sejour.zynerator.audit.AuditBusinessObject;

import java.util.Objects;

@Entity
@Table(name = "quartier")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="quartier_seq",sequenceName="quartier_seq",allocationSize=1, initialValue = 1)
public class Quartier extends AuditBusinessObject {

    private Long id;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String secteurCode;


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="quartier_seq")


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getSecteur() {
        return secteurCode;
    }

    public void setSecteur(String sectsecteurCodeeur) {
        this.secteurCode = secteurCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quartier quartier = (Quartier) o;
        return id != null && id.equals(quartier.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
