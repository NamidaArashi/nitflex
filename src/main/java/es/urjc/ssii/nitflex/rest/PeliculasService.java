package es.urjc.ssii.nitflex.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.urjc.ssii.nitflex.modelo.Pelicula;
import es.urjc.ssii.nitflex.repositorio.RepositorioPelicula;

/**
 * Servicio Spring para gestión de peticiones REST.
 * 
 * @author Cristina y Alexey GII URJC
 *
 */
@Service
public class PeliculasService {
	
	@Autowired
	private RepositorioPelicula listaPeliculas;
	
	public List<Pelicula> getPeliculas() {
		return (List<Pelicula>) listaPeliculas.findAll();
	}

	public Pelicula getPelicula(Long index) {
		return listaPeliculas.findByIdpelicula(index);
	}

}