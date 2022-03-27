package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {


	void insertarPaciente(Paciente paciente);
	List<Paciente> buscarPacienteTodos(Integer id);
	Paciente buscarPaciente(Integer id);
	void actualizarPaciente(Paciente paciente);
	void borrarPaciente(Integer id);
}
