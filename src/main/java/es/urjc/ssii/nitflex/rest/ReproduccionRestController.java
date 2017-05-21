package es.urjc.ssii.nitflex.rest;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
public class ReproduccionRestController {

	@Autowired
	private ReproduccionService reproduccionService;

	@RequestMapping(value = "/reproduccion", method = RequestMethod.GET)
	
	public ModelAndView getPeliculas(@RequestParam Usuario usuario,
									 @RequestParam Pelicula pelicula,
									 Model model) throws IOException {
		
        Calendar fecha = new GregorianCalendar();

        int anyo = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        String fechatotal = dia + " / " + (mes+1) + " / " + anyo + " " + hora + " " + minuto + " " + segundo;
		
		reproduccionService.setReproduccion(fechatotal, usuario, pelicula);
		
		model.addAttribute("peli", pelicula);
		
		ModelAndView reproduccion = new ModelAndView("reproduccion");
		
		return reproduccion;
	}
}