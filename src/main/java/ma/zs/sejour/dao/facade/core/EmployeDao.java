package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.haverd.projrcttaxesejour.bean.commun.Employe;


@Repository
public interface EmployeDao extends JpaRepository<Employe,Long> {

    Employe findByCode(String code);
    int deleteByCode(String code);
}
