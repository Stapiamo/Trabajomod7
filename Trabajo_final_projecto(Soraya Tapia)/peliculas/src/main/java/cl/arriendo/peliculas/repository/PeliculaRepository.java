package cl.arriendo.peliculas.repository;
import org.springframework.data.repository.CrudRepository;
import cl.arriendo.peliculas.models.Pelicula;
import java.util.List;


public interface PeliculaRepository extends CrudRepository<Pelicula, Long> {

	public List<Pelicula> findByTitulo(Object pelicula);
}
