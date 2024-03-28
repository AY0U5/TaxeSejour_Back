package ma.zs.sejour.ws.dto.commun;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.sejour.zynerator.audit.Log;
import ma.zs.sejour.zynerator.criteria.BaseCriteria;
import ma.zs.sejour.zynerator.dto.AuditBaseDto;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeDto extends AuditBaseDto {

    private String code;

    private String username;

    private String paswrd;


    public EmployeDto() {
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
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Log

    public String getPaswrd() {
        return paswrd;
    }

    public void setPaswrd(String paswrd) {
        this.paswrd = paswrd;
    }


}