package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.Estudiante;

public interface IEstudianteService {

	void insertarEstudiante(Estudiante estudiante);
	List<Estudiante> buscarEstudiantesTodos(Integer id);
	Estudiante buscar(Integer id);
	void actualizarEstudiante(Estudiante estudiante);
	void borrarEstudiante(Integer id);
	
}
