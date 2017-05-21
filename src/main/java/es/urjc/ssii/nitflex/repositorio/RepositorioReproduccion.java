package es.urjc.ssii.nitflex.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.urjc.ssii.nitflex.modelo.Reproduccion;

/**
 * Operaciones con base de datos para películas.
 * 
 * @author J. M. Colmenar
 *
 */
public interface RepositorioReproduccion  extends CrudRepository<Reproduccion,Long> {
	
	List<Reproduccion> findAll();

	List<Reproduccion> findAllByOrderByFechayhoraAsc();
	
	Reproduccion findByIdreproduccion(Long idreproduccion);
	
}