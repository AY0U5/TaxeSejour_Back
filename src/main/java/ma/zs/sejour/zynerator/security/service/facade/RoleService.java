package ma.zs.sejour.zynerator.security.service.facade;

import ma.zs.sejour.zynerator.security.bean.Role;
import ma.zs.sejour.zynerator.security.dao.criteria.core.RoleCriteria;
import ma.zs.sejour.zynerator.service.IService;



public interface RoleService extends  IService<Role,RoleCriteria>  {
    Role findByAuthority(String authority);
    int deleteByAuthority(String authority);


    



}
