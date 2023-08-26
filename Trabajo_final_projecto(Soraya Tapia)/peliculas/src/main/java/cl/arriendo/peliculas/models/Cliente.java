package cl.arriendo.peliculas.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;





@Entity
public class Cliente {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String correo;
	private String direccion;
	
	
	
	
	public Cliente() {
		super();

	}


	public Cliente(String nombre, String correo, String direccion) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.direccion = direccion;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




}
