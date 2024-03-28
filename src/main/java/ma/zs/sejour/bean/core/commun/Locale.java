package ma.zs.sejour.bean.core.commun;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.sejour.ws.dto.commun.RedevableDto;
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

    private Rue rue;

    private  CategorieSejour categorieSejour ;

    private Redevable redevable;


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

    @ManyToOne
    public Rue getRue() {
        return rue;
    }

    public void setRue(Rue rue) {
        this.rue = rue;
    }

    @ManyToOne
    public CategorieSejour getCategorieSejour() {
        return categorieSejour;
    }

    public void setCategorieSejour(CategorieSejour categorieSejour) {
        this.categorieSejour = categorieSejour;
    }

    @ManyToOne
    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
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
