package ma.zs.sejour.dao.criteria.core.commun;


import ma.zs.sejour.zynerator.criteria.BaseCriteria;


public class EmployeCriteria extends BaseCriteria {

    private String code;
    private String codeLike;
    private String username;
    private String usernameLike;
    private String paswrd;
    private String paswrdLike;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeLike() {
        return codeLike;
    }

    public void setCodeLike(String codeLike) {
        this.codeLike = codeLike;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsernameLike() {
        return usernameLike;
    }

    public void setUsernameLike(String usernameLike) {
        this.usernameLike = usernameLike;
    }

    public String getPaswrd() {
        return paswrd;
    }

    public void setPaswrd(String paswrd) {
        this.paswrd = paswrd;
    }

    public String getPaswrdLike() {
        return paswrdLike;
    }

    public void setPaswrdLike(String paswrdLike) {
        this.paswrdLike = paswrdLike;
    }
}