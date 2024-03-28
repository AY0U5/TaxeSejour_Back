package ma.zs.sejour.ws.dto.commun;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.sejour.zynerator.audit.Log;
import ma.zs.sejour.zynerator.criteria.BaseCriteria;
import ma.zs.sejour.zynerator.dto.AuditBaseDto;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RueDto extends AuditBaseDto {

    private String libelle;
    private String code;
    private QuartierDto quartierDto;

    public RueDto(){
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


    public QuartierDto getQuartierDto() {
        return quartierDto;
    }

    public void setQuartierDto(QuartierDto quartierDto) {
        this.quartierDto = quartierDto;
    }
}
