package es.urjc.ssii.nitflex.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.urjc.ssii.nitflex.modelo.Usuario;

/**
 * Operaciones con base de datos para películas.
 * 
 * @author J. M. Colmenar
 *
 */
public interface RepositorioUsuario  extends CrudRepository<Usuario,Long> {

	List<Usuario> findAllByOrderByNombreusrAsc();

	Usuario findByNombreusr(String nombreusr);
	
	Usuario findByNombre(String nombre);
	
	Usuario findByIdusuario(Long idusuario);
	
}