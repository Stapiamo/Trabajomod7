package cl.arriendo.peliculas.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.arriendo.peliculas.models.Cliente;
import cl.arriendo.peliculas.repository.ClienteRepository;




@Service
public class ClienteServices {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	public List<Cliente> findByName(String name){
		
		return clienteRepository.findByName(name);	
	
	}
	

}
