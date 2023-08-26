package cl.arriendo.peliculas.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.arriendo.peliculas.models.Cliente;
import cl.arriendo.peliculas.services.ClienteServices;




@RestController
	public class ClienteController {

@Autowired
	ClienteServices clienteServices;



@GetMapping ("Cliente/name")
	public List<Cliente> findClientesByName (@RequestParam String name){
	
	return clienteServices.findByName(name);
}







}
