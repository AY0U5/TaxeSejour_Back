package ma.zs.sejour.ws.dto.commun;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.sejour.zynerator.audit.Log;
import ma.zs.sejour.zynerator.criteria.BaseCriteria;
import ma.zs.sejour.zynerator.dto.AuditBaseDto;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeRedevableDto extends AuditBaseDto {
    private String libelle;
    private String code;


    public TypeRedevableDto(){
        super();
    }

    @Log
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Log
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
