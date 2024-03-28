package ma.zs.sejour.ws.dto.commun;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.sejour.bean.core.commun.Redevable;
import ma.zs.sejour.zynerator.audit.Log;
import ma.zs.sejour.zynerator.criteria.BaseCriteria;
import ma.zs.sejour.zynerator.dto.AuditBaseDto;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocaleDto extends AuditBaseDto {

    private String code;
    private String libelle;


    private RueDto rueDto;

    private CategorieSejourDto categorieSejourDto ;

    private RedevableDto redevableDto;



    public LocaleDto(){
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
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public RueDto getRueDto() {
        return rueDto;
    }

    public void setRueDto(RueDto rueDto) {
        this.rueDto = rueDto;
    }

    public CategorieSejourDto getCategorieSejourDto() {
        return categorieSejourDto;
    }

    public void setCategorieSejourDto(CategorieSejourDto categorieSejourDto) {
        this.categorieSejourDto = categorieSejourDto;
    }

    public RedevableDto getRedevableDto() {
        return redevableDto;
    }

    public void setRedevableDto(RedevableDto redevableDto) {
        this.redevableDto = redevableDto;
    }
}
