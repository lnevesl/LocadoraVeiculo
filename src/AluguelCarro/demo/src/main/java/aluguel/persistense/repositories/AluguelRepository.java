package aluguel.persistense.repositories;


import aluguel.persistense.entities.AluguelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AluguelRepository extends JpaRepository<AluguelEntity, Long> {

    //Query method
    List<AluguelEntity> findAll();

    //Query JPQL
    @Query("SELECT c FROM AluguelEntity c")
    List<AluguelEntity> getAllAluguel();
}
