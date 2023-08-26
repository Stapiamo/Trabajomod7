package cl.arriendo.peliculas.repository;
import org.springframework.data.repository.CrudRepository;
import cl.arriendo.peliculas.models.Arriendo;

public interface ArriendoRepository extends CrudRepository<Arriendo, Long>{

}
