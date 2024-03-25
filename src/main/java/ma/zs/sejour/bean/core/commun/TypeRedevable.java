package ma.zs.sejour.bean.core.commun;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.sejour.zynerator.audit.AuditBusinessObject;

import java.util.Objects;

@Entity
@Table(name = "type_redevable")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_redevable_seq",sequenceName="type_redevable_seq",allocationSize=1, initialValue = 1)
public class TypeRedevable extends AuditBusinessObject {

    private Long id;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="type_redevable_seq")


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
        TypeRedevable typeRedevable = (TypeRedevable) o;
        return id != null && id.equals(typeRedevable.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
