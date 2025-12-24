package aluguel.persistense.repositories;

import aluguel.persistense.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    //Query method
    List<ClienteEntity> findAll();

    //Query JPQL
    @Query("SELECT c FROM ClienteEntity c")
    List<ClienteEntity> getAllClientes();

}
