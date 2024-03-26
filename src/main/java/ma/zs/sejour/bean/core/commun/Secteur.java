package ma.zs.sejour.bean.core.commun;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.sejour.zynerator.audit.AuditBusinessObject;

import java.util.Objects;

@Entity
@Table(name = "secteur")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="secteur_seq",sequenceName="secteur_seq",allocationSize=1, initialValue = 1)

public class Secteur extends AuditBusinessObject {

    private Long id;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;

    private String villeCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getVilleCode() {
        return villeCode;
    }

    public void setVilleCode(String villeCode) {
        this.villeCode = villeCode;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="secteur_seq")




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
        Secteur secteur = (Secteur) o;
        return id != null && id.equals(secteur.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
