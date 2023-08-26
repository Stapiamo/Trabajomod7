package cl.arriendo.peliculas.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.arriendo.peliculas.models.Pelicula;
import cl.arriendo.peliculas.services.PeliculaServices;


@RestController
public class PeliculaController {

	@Autowired
	PeliculaServices peliculaService;
	
	@GetMapping ("Peliculas/titulo")
	public List<Pelicula> findPeliculasBytitulo (@RequestParam String titulo){
		
	return peliculaService.findByTitulo(titulo);
	}
	
	
	@GetMapping ("Peliculas/create")
	public Pelicula createPeliculas (@RequestParam String titulo, @RequestParam String cantidad){
		
		Pelicula pelicula= new Pelicula( titulo,cantidad);
		return peliculaService.creatPelicula(pelicula);
		
	}
	
	@GetMapping("/Peliculas/all")
	public List<Pelicula> listPelicula(){
		return peliculaService.findAll();
	
}
}