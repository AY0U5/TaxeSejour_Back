package ma.zs.sejour.bean.core.commun;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.sejour.zynerator.audit.AuditBusinessObject;

import java.util.Objects;

@Entity
@Table(name = "locale")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="locale_seq",sequenceName="locale_seq",allocationSize=1, initialValue = 1)
public class Locale extends AuditBusinessObject {

    private Long id;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String rueCode;
    @Column(length = 500)
    private  String categorieSejourCode ;
    @Column(length = 500)
    private String redevableCode;


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="locale_seq")


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getRue() {
        return rueCode;
    }

    public void setRue(String rueCode) {
        this.rueCode = rueCode;
    }

    public String  getCategorieSejour() {
        return categorieSejourCode;
    }

    public void setCategorieSejour(String categorieSejourCode) {
        this.categorieSejourCode = categorieSejourCode;
    }

    public String getRedevable() {
        return redevableCode;
    }

    public void setRedevable(String redevableCode) {
        this.redevableCode = redevableCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locale locale = (Locale) o;
        return id != null && id.equals(locale.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
