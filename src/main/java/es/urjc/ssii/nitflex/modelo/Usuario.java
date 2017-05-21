package es.urjc.ssii.nitflex.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Representación de los datos básicos de un usuario.
 * Es una entidad que se guardará en la base de datos.
 * 
 * @author Cristina Lopez
 *
 */

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idusuario;	
	
	//@Column(unique = true)
	private String nombreusr;
	
	private String contrasenya;
	private String nombre;
	private String apellidos;
	
	//@Column(unique = true)
	private String email;
	
	private int fechanac;
	private String pais;
	private String ciudad;
	
	public Usuario() {
	}
	
	public Usuario(String nombreusr, String contrasenya, String nombre, String apellidos, String email, int fechanac, String pais, String ciudad) {
		this.nombreusr = nombreusr;
		this.contrasenya = contrasenya;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.fechanac = fechanac;
		this.pais = pais;
		this.ciudad = ciudad;
	}

	// Getters y setters
	
	public Long getIdusuario() {
		return idusuario;
	}
	
	/*public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}*/
	
	public String getNombreusr() {
		return nombreusr;
	}

	public void setNombreusr(String nombreusr) {
		this.nombreusr = nombreusr;
	}
	
	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getFechanac() {
		return fechanac;
	}

	public void setAnyonac(int fechanac) {
		this.fechanac = fechanac;
	}
	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}