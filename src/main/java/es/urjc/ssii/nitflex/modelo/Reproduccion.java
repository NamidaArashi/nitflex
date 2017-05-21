package es.urjc.ssii.nitflex.modelo;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import es.urjc.ssii.nitflex.modelo.Usuario;
import es.urjc.ssii.nitflex.modelo.Pelicula;
import javax.persistence.OneToOne;

/**
 * Representación de los datos básicos de una reproduccion.
 * Es una entidad que se guardará en la base de datos.
 * 
 * @author Cristina Lopez
 *
 */

@Entity
public class Reproduccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idreproduccion;	
	
	private String fechayhora;
	
	@OneToOne
	@JoinColumn(name = "usuario", referencedColumnName="idusuario")
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name = "pelicula", referencedColumnName="idpelicula")
	private Pelicula pelicula;
	
	public Reproduccion() {
	}
	
	public Reproduccion(String fechayhora, Usuario usuario, Pelicula pelicula) {
		this.fechayhora = fechayhora;
		this.usuario = usuario;
		this.pelicula = pelicula;
	}

	// Getters y setters
	
	public Long getIdreproduccion() {
		return idreproduccion;
	}
	
	/*public void setIdreproduccion(Long idreproduccion) {
		this.idreproduccion = idreproduccion;
	}*/
	
	public String getFechayhora() {
		return fechayhora;
	}

	public void setFechayhora(String fechayhora) {
		this.fechayhora = fechayhora;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
}