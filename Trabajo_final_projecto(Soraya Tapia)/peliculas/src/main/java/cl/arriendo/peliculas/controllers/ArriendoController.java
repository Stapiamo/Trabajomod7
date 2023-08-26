package cl.arriendo.peliculas.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cl.arriendo.peliculas.services.ArriendoServices;

@RestController
public class ArriendoController {

	
	@Autowired
	ArriendoServices arriendoservices;
}
