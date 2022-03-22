package ec.edu.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.service.IEstudianteService;


@Controller
@RequestMapping("/estudiantes")//Dar un nombre en plurarl al recurso
public class EstudianteController {

    @Autowired
    private IEstudianteService estudianteService;

    @RequestMapping("/buscar/{idEstudiante}")
    public String obtenerUsuario(@PathVariable("idEstudiante") Integer idEstudiante, Model modelo){
        Estudiante estud = this.estudianteService.buscar(idEstudiante);
        /*Estudiante estu = new Estudiante();
        estu.setNombre("Denis");
        estu.setApellido("Tapia");
        estu.setId(idEstudiante);*/
        modelo.addAttribute("estu",estud);
        return "estudiante";
    }

}
