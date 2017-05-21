package es.urjc.ssii.nitflex.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.urjc.ssii.nitflex.modelo.Pelicula;
import es.urjc.ssii.nitflex.modelo.Usuario;
import es.urjc.ssii.nitflex.repositorio.RepositorioPelicula;
import es.urjc.ssii.nitflex.repositorio.RepositorioUsuario;

/**
 * Servicio Spring para gestión de peticiones REST.
 * 
 * @author Cristina y Alexey GII URJC
 *
 */
@Service
public class UsuariosService {
	
	@Autowired
	private RepositorioUsuario repositorioUsuario;

	public Usuario getUsuario(String nombreusr){
		return repositorioUsuario.findByNombreusr(nombreusr);
	}
	
}