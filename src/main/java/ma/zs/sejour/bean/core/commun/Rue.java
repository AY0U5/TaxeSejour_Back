package ma.zs.sejour.bean.core.commun;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.sejour.bean.core.taux.TauxTaxeSejourTrim;
import ma.zs.sejour.zynerator.audit.AuditBusinessObject;

import java.util.Objects;

@Entity
@Table(name = "rue")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="rue_seq",sequenceName="rue_seq",allocationSize=1, initialValue = 1)

public class Rue extends AuditBusinessObject {

    private Long id;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;
    private String quartierCode;


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="rue_seq")


    public String getQuartier() {
        return quartierCode;
    }

    public void setQuartier(String quartiercode) {
        this.quartierCode = quartierCode;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rue rue = (Rue) o;
        return id != null && id.equals(rue.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
