package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Estudiante;
import modelo.Libro;

@Stateless
public class EstudianteDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Estudiante estudiante)
	{
		em.persist(estudiante);
		
	}
	
	public void update(Estudiante estudiante)
	{
		em.merge(estudiante);
		
	}
	
	public void remove(String codigo)
	{
		Estudiante estudiante=this.read(codigo);
		em.remove(estudiante);
		
	}
	
	public Estudiante read(String codigo)
	{
		Estudiante e=em.find(Estudiante.class, codigo);
		return e;
	}
	
	
	//consulta a una BD, se hace refrencia a las entidades del paquete modelo, no a la BD
	public List<Estudiante> getEstudiantes()
	{
		String jpql = "SELECT e FROM Estudiante e";
		Query q = em.createQuery(jpql, Estudiante.class);
		List<Estudiante> estudiantes = q.getResultList();
		return estudiantes;
		
	}
	
	
	public List<Estudiante> getEstudiantesNombre(String filtro)
	{
		String jpql = "SELECT e FROM Estudiante e WHERE carrera LIKE ?1 ";
		Query q = em.createQuery(jpql, Estudiante.class);
		q.setParameter(1, "%"+filtro+"%");
		List<Estudiante> estudiantes = q.getResultList();
		return estudiantes;
		
	}

}
