package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepo pacienteRepo;
	
	@Override
	public void insertarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepo.insertarPaciente(paciente);
	}

	@Override
	public List<Paciente> buscarPacienteTodos(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepo.buscarPacienteTodos(id);
	}

	@Override
	public Paciente buscarPaciente(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepo.buscarPaciente(id);
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepo.actualizarPaciente(paciente);
	}

	@Override
	public void borrarPaciente(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepo.borrarPaciente(id);
	}

	
	
	
}
