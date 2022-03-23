package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteRepo estudianteRepo;
	
	@Override
	public void insertarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.insertarEstudiante(estudiante);
		
	}

	@Override
	public List<Estudiante> buscarEstudiantesTodos() {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarEstudiantesTodos();
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscar(id);
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.actualizarEstudiante(estudiante);
	}

	@Override
	public void borrarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRepo.borrarEstudiante(id);
	}

	
	
}
