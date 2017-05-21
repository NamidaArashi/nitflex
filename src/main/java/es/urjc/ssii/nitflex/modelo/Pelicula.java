package es.urjc.ssii.nitflex.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Representación de los datos básicos de una película.
 * Es una entidad que se guardará en la base de datos.
 * 
 * @author Cristina Lopez
 *
 */

@Entity
public class Pelicula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idpelicula;	
	
	private String titulo;
	private String pais;
	private int anyo;
	private String director;
	private String resumen;
	private String url;
	private String img;
	//private List<String> etiquetas;
	
	public Pelicula() {
	}
	
	public Pelicula(String titulo, String pais, int anyo, String director, String resumen, String url, String img, ArrayList<String> etiquetas) {
		this.titulo = titulo;
		this.pais = pais;
		this.anyo = anyo;
		this.director = director;
		this.resumen = resumen;
		this.url = url;
		this.img = img;
		//this.etiquetas = etiquetas;
	}

	// Getters y setters
	
	public Long getIdpelicula() {
		return idpelicula;
	}
	
	/*public void setIdpeli(Long idpelicula) {
		this.idpeli = idpelicula;
	}*/
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	/*public List<String> getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(List<String> etiquetas) {
		this.etiquetas = etiquetas;
	}*/
}
