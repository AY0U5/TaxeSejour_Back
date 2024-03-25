package ma.zs.sejour.zynerator.security.service.facade;

import ma.zs.sejour.zynerator.security.bean.RoleUser;
import ma.zs.sejour.zynerator.security.dao.criteria.core.RoleUserCriteria;
import ma.zs.sejour.zynerator.service.IService;

import java.util.List;



public interface RoleUserService extends  IService<RoleUser,RoleUserCriteria>  {

    List<RoleUser> findByRoleId(Long id);
    int deleteByRoleId(Long id);
    long countByRoleAuthority(String authority);
    List<RoleUser> findByUserId(Long id);
    int deleteByUserId(Long id);
    long countByUserEmail(String email);



}
