package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;

@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public List<Paciente> buscarPacienteTodos(Integer id) {
		// TODO Auto-generated method stub
		TypedQuery<Paciente> miQuery = this.entityManager
				.createQuery("SELECT e FROM Paciente e WHERE e.id =:valor",Paciente.class);
		miQuery.setParameter("valor", id);
		
		List<Paciente> listaDetalles = miQuery.getResultList();

		return listaDetalles;
	}

	@Override
	public Paciente buscarPaciente(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public void borrarPaciente(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarPaciente(id));
	}

	
	
	
}
