package ma.zs.sejour.zynerator.security.dao.facade.core;

import ma.zs.sejour.zynerator.repository.AbstractRepository;
import ma.zs.sejour.zynerator.security.bean.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RoleDao extends AbstractRepository<Role,Long>  {
    Role findByAuthority(String authority);
    int deleteByAuthority(String authority);

    @Query("SELECT NEW Role(item.id,item.authority) FROM Role item")
    List<Role> findAllOptimized();

}
