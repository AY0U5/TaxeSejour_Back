package ma.zs.sejour.bean.core.commun;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.sejour.zynerator.audit.AuditBusinessObject;

import java.util.Objects;

@Entity
@Table(name = "categorie_sejour")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="categorie_sejour_seq",sequenceName="categorie_sejour_seq",allocationSize=1, initialValue = 1)

public class CategorieSejour extends AuditBusinessObject {

    private Long id;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="categorie_sejour_seq")


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

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategorieSejour categorieSejour = (CategorieSejour) o;
        return id != null && id.equals(categorieSejour.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
