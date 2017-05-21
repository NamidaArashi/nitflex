package es.urjc.ssii.nitflex.rest;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import es.urjc.ssii.nitflex.modelo.Pelicula;
import es.urjc.ssii.nitflex.modelo.Usuario;

/**
 * Controlador Spring para gestión de peticiones REST.
 * 
 * @author Cristina y Alexey GII URJC
 *
 */

@RestController
public class PeliculasRestController {

	@Autowired
	private PeliculasService peliculasService;
	private UsuariosService usuariosService;

	@RequestMapping(value = "/inicio", method = RequestMethod.GET)
	public ModelAndView getPeliculas(Model model) throws IOException{
		
		List<Pelicula> listaPelis = peliculasService.getPeliculas();
		
		model.addAttribute("listaPelis", listaPelis);
		ModelAndView index = new ModelAndView("inicio");
		
		return index;
	}

	@RequestMapping(value = "/pelicula/{index}", method = RequestMethod.GET)
	public Pelicula getPelicula(@PathVariable("index") Long index) {
		return peliculasService.getPelicula(index);
	}
}
