package es.urjc.ssii.nitflex.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Representación de los datos básicos de un intento de conexión.
 * Es una entidad que se guardará en la base de datos.
 * 
 * @author Cristina Lopez
 *
 */

@Entity
public class IntentoConexion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idconexion;	
	
	private String fechayhora;
	private String ip;
	private String nombreusr;
	private String resultado;
	
	public IntentoConexion() {
	}
	
	public IntentoConexion(String fechayhora, String ip, String nombreusr, String resultado) {
		this.fechayhora = fechayhora;
		this.ip = ip;
		this.nombreusr = nombreusr;
		this.resultado = resultado;
	}

	// Getters y setters
	
	public Long getIdconexion() {
		return idconexion;
	}
	
	/*public void setIdconexion(Long idconexion) {
		this.idconexion = idconexion;
	}*/
	
	public String getFechayhora() {
		return fechayhora;
	}

	public void setFechayhora(String fechayhora) {
		this.fechayhora = fechayhora;
	}
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getNombreusr() {
		return nombreusr;
	}

	public void setNombreusr(String nombreusr) {
		this.nombreusr = nombreusr;
	}
	
	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
}