package usa.haverd.projrcttaxesejour.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usa.haverd.projrcttaxesejour.bean.commun.CategorieSejour;


@Repository
public interface CategorieSejourDao extends JpaRepository<CategorieSejour,Long> {
    CategorieSejour findByCode(String code);
    int deleteByCode(String code);

}