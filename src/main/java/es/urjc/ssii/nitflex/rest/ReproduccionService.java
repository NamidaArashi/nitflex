package es.urjc.ssii.nitflex.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.urjc.ssii.nitflex.modelo.Pelicula;
import es.urjc.ssii.nitflex.modelo.Reproduccion;
import es.urjc.ssii.nitflex.modelo.Usuario;
import es.urjc.ssii.nitflex.repositorio.RepositorioPelicula;
import es.urjc.ssii.nitflex.repositorio.RepositorioReproduccion;

/**
 * Servicio Spring para gestión de peticiones REST.
 * 
 * @author Cristina y Alexey GII URJC
 *
 */
@Service
public class ReproduccionService {
	
	@Autowired
	private RepositorioReproduccion listaReproducciones;
	
	public List<Reproduccion> getReproducciones() {
		return (List<Reproduccion>) listaReproducciones.findAll();
	}
	
	public void setReproduccion(String fechayhora, Usuario usuario, Pelicula pelicula) {
		Reproduccion rep = new Reproduccion();
		rep.setFechayhora(fechayhora);
		rep.setPelicula(pelicula);
		rep.setUsuario(usuario);
	}

}