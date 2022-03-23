package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.Estudiante;

public interface IEstudianteService {

	void insertarEstudiante(Estudiante estudiante);
	List<Estudiante> buscarEstudiantesTodos();
	Estudiante buscar(Integer id);
	void actualizarEstudiante(Estudiante estudiante);
	void borrarEstudiante(Integer id);
	
}
