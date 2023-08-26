package cl.arriendo.peliculas.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.arriendo.peliculas.models.Pelicula;
import cl.arriendo.peliculas.repository.PeliculaRepository;



	@Service
	public class PeliculaServices {

	@Autowired
	PeliculaRepository peliculaRepository;
	
	public List<Pelicula> findByTitulo(String titulo){
		
		return peliculaRepository.findByTitulo(titulo);	
	
	}
	
	
	public Pelicula creatPelicula(Pelicula pelicula) {
		return peliculaRepository.save(pelicula);
		
	}
	
	
	public List<Pelicula> findAll(){
		
		return (List<Pelicula>) peliculaRepository.findAll();
		
	}
	
	
	public Optional<Pelicula> findById(Long id) {
		
		return peliculaRepository.findById(id);
	}
	
	
	
	
	
}
