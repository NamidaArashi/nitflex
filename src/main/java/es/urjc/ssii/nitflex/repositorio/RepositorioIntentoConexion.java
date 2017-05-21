package es.urjc.ssii.nitflex.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.urjc.ssii.nitflex.modelo.IntentoConexion;
import es.urjc.ssii.nitflex.modelo.Usuario;

/**
 * Operaciones con base de datos para películas.
 * 
 * @author Cristina y Alexey GII URJC
 *
 */
public interface RepositorioIntentoConexion  extends CrudRepository<IntentoConexion,Long> {

	List<IntentoConexion> findAllByOrderByFechayhoraAsc();
	
	List<IntentoConexion> findAllByNombreusr(String nombreusr);

	IntentoConexion findByNombreusr(String nombreusr);
	
	IntentoConexion findByFechayhora(String fechayhora);
	
	IntentoConexion findByIdconexion(Long idconexion);
	
}