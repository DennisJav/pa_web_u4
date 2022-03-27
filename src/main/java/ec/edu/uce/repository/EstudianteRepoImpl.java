package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Estudiante;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public List<Estudiante> buscarEstudiantesTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> miQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e ",Estudiante.class);
		return miQuery.getResultList();
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public void borrarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
		
	}

	
	
	
}
