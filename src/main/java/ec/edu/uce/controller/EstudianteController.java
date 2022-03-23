package ec.edu.uce.controller;

import java.util.List;

import javax.naming.Binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.service.IEstudianteService;

@Controller // Notacion para controller
@RequestMapping("/estudiantes") // Siempre en plural
public class EstudianteController {

	@Autowired
	private IEstudianteService estudianteService;

	@GetMapping("/buscar/{idEstudiante}") // se crea la variable para enviar que se generalice
	// @RequestMapping(path = "/buscar/{idEstudiante}", method = RequestMethod.GET)
	public String obtenerUsuario(@PathVariable("idEstudiante") Integer idEstudiante, Model modelo) { // se envia el
																										// modelo
		Estudiante estud = this.estudianteService.buscar(idEstudiante);
		/*
		 * Estudiante estu = new Estudiante(); estu.setNombre("Denis");
		 * estu.setApellido("Tapia"); estu.setId(idEstudiante);
		 */
		modelo.addAttribute("estu", estud);
		return "estudiante"; // siempre retorna un String, es la vista nombre del html
	}

	// localhost:8081/estudiantes/buscar/todos

	@GetMapping("/buscar/todos")
	public String buscarEstudiantesTodos(Model modelo) {
		List<Estudiante> listaEstudiantes = this.estudianteService.buscarEstudiantesTodos();
		modelo.addAttribute("estudiantes", listaEstudiantes);
		return "lista";
	}

	@GetMapping("/estudianteNuevo")
	public String obtenerPaginaIngresoDatos() {

		return "estudianteNuevo";
	}
	
	@PostMapping("/insertar")
	public String insertarEstudiante(Estudiante estudiante, BindingResult result, Model modelo) {
		this.estudianteService.insertarEstudiante(estudiante);
		return "lista";
	}

	
	
	
	
}
