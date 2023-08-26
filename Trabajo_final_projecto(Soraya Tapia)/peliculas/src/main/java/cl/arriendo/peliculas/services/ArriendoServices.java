package cl.arriendo.peliculas.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.arriendo.peliculas.repository.ArriendoRepository;

@Service
public class ArriendoServices {
	
	
	@Autowired
	ArriendoRepository arriendoRepository;
	

}
