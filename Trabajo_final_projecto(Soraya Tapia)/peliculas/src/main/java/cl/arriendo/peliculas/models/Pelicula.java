package cl.arriendo.peliculas.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Pelicula {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String titulo;
	private String cantidad;
	
	
	
	public Pelicula(String titulo, String cantidad) {
		super();
		this.titulo = titulo;
		this.cantidad = cantidad;
	}

	
	
	public Pelicula() {
		super();
	
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getCantidad() {
		return cantidad;
	}



	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
	
	
}
