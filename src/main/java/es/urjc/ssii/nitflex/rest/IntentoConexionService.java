package es.urjc.ssii.nitflex.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.urjc.ssii.nitflex.modelo.Usuario;
import es.urjc.ssii.nitflex.modelo.IntentoConexion;
import es.urjc.ssii.nitflex.repositorio.RepositorioIntentoConexion;

@Service
public class IntentoConexionService {
	
	@Autowired
	private RepositorioIntentoConexion repositorioConexion;

	public List<IntentoConexion> getIntentoConexionUsuario(String nombreusr){
		return repositorioConexion.findAllByNombreusr(nombreusr);
	}
	
}