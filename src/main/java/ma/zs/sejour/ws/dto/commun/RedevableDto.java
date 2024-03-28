package ma.zs.sejour.ws.dto.commun;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.sejour.zynerator.audit.Log;
import ma.zs.sejour.zynerator.criteria.BaseCriteria;
import ma.zs.sejour.zynerator.dto.AuditBaseDto;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RedevableDto extends AuditBaseDto {
    private String code;

    private String cin;

    private String nom;

    private TypeRedevableDto typeRedevableDto;


    public RedevableDto(){
        super();
    }


    @Log
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Log
    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    @Log
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TypeRedevableDto getTypeRedevableDto() {
        return typeRedevableDto;
    }

    public void setTypeRedevableDto(TypeRedevableDto typeRedevableDto) {
        this.typeRedevableDto = typeRedevableDto;
    }

}
