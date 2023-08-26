package cl.arriendo.peliculas.repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import cl.arriendo.peliculas.models.Cliente;



public interface ClienteRepository extends CrudRepository<Cliente, Long>{

	List<Cliente> findByName(String name);

}
