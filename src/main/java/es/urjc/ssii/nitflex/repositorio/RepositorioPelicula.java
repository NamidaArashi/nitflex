package es.urjc.ssii.nitflex.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.urjc.ssii.nitflex.modelo.Pelicula;

/**
 * Operaciones con base de datos para películas.
 * 
 * @author Cristina y Alexey GII URJC
 *
 */
public interface RepositorioPelicula  extends CrudRepository<Pelicula,Long> {
	

	List<Pelicula> findAll();
	
	List<Pelicula> findAllByOrderByTituloAsc();

	Pelicula findByTitulo(String titulo);
	
	Pelicula findByIdpelicula(Long idpelicula);
	
}