package AluguelCarro.persistense.repositories;

import AluguelCarro.persistense.entities.CarroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarroRepository extends JpaRepository<CarroEntity, Long> {

    //Query method
    List<CarroEntity> findAll();

    //Query JPQL
    @Query("SELECT c FROM CarroEntity c");
    List<CarroEntity> getAllCarros();
}
