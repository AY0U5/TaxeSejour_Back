package ma.zs.sejour.bean.core.commun;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.sejour.zynerator.audit.AuditBusinessObject;

import java.util.Objects;

@Entity
@Table(name = "redevable")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="redevable_seq",sequenceName="redevable_seq",allocationSize=1, initialValue = 1)
public class Redevable extends AuditBusinessObject {

    private Long id;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String cin;
    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String typeRedevableCode;



    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="redevable_seq")


    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTypeRedevable() {
        return typeRedevableCode;
    }

    public void setTypeRedevable(String typeRedevableCode) {
        this.typeRedevableCode = typeRedevableCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Redevable redevable = (Redevable) o;
        return id != null && id.equals(redevable.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
