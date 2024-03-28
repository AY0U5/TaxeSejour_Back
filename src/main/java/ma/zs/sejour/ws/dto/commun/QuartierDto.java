package ma.zs.sejour.ws.dto.commun;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.sejour.bean.core.commun.Secteur;
import ma.zs.sejour.zynerator.audit.Log;
import ma.zs.sejour.zynerator.dto.AuditBaseDto;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuartierDto extends AuditBaseDto {

    private String libelle;

    private String code;

    private SecteurDto secteurDto;


    public QuartierDto(){
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

    public SecteurDto getSecteurDto() {
        return secteurDto;
    }

    public void setSecteurDto(SecteurDto secteurDto) {
        this.secteurDto = secteurDto;
    }
}
