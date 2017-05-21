package es.urjc.ssii.nitflex.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import es.urjc.ssii.nitflex.repositorio.*;
import es.urjc.ssii.nitflex.modelo.IntentoConexion;
import es.urjc.ssii.nitflex.modelo.Pelicula;
import es.urjc.ssii.nitflex.modelo.Usuario;

@RestController
public class LoginRestController {
	
	@Autowired
	private RepositorioUsuario repositorioUsuario;
	@Autowired
	private RepositorioPelicula repositorioPelicula;
	@Autowired
	private RepositorioIntentoConexion repositorioConexion;
	
	@RequestMapping(value= "/", method = RequestMethod.GET)
	public ModelAndView inicio(Model model){
		ModelAndView login = new ModelAndView("login");
		return login;
	}
	
	@RequestMapping(value= "/login", method = RequestMethod.GET)
	public ModelAndView login(Model model,
			@RequestParam(name="usuario", required=false) String usuario,
			@RequestParam(name="contrasena", required=false) String pass){
		
		Usuario user = repositorioUsuario.findByNombreusr(usuario);
		List<IntentoConexion> conexionesUsuario = repositorioConexion.findAllByNombreusr(usuario);
		IntentoConexion conexion = new IntentoConexion();
		int ultima_conexion= conexionesUsuario.size();
		
		ModelAndView login = new ModelAndView("errorLogin");
		
		if(user != null) {
			if(usuario.equals(user.getNombreusr()) && pass.equals(user.getContrasenya())){
				conexion.setNombreusr(usuario);
				String aux = new Date().toString();
				conexion.setFechayhora(aux);
				conexion.setIp("111.11.11.1");
				conexion.setResultado("Correcta");
				repositorioConexion.save(conexion);
				List<Pelicula> listaPelis = repositorioPelicula.findAll();
				model.addAttribute("listaPelis", listaPelis);
				login= new ModelAndView("inicio");
			}else{
				conexion.setNombreusr(usuario);
				String aux = new Date().toString();
				conexion.setFechayhora(aux);
				conexion.setIp("111.11.11.1");
				conexion.setResultado("Incorrecta");
				repositorioConexion.save(conexion);
				login= new ModelAndView("errorLogin");
			}
			if(conexionesUsuario.size()>3){
				if(conexionesUsuario.get(ultima_conexion-1).getResultado().equals("Incorrecta")&&
				conexionesUsuario.get(ultima_conexion-2).getResultado().equals("Incorrecta")&&
				conexionesUsuario.get(ultima_conexion-3).getResultado().equals("Incorrecta")){
				login= new ModelAndView("bloqueado");
				}
			}
		} else {
			conexion.setNombreusr(usuario);
			String aux = new Date().toString();
			conexion.setFechayhora(aux);
			conexion.setIp("111.11.11.1");
			conexion.setResultado("Incorrecta");
			repositorioConexion.save(conexion);
			login= new ModelAndView("errorLogin");
		}
		
		return login;
	}
}
