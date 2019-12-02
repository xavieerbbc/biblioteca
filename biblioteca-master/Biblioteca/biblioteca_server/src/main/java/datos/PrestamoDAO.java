package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Bibliotecario;
import modelo.Prestamo;

@Stateless
public class PrestamoDAO {
	@Inject
	private EntityManager em;
	
	public void insert(Prestamo prestamo)
	{
		em.persist(prestamo);
		
	}
	
	public void update(Prestamo prestamo)
	{
		em.merge(prestamo);
		
	}
	
	public void remove(int codigo)
	{
		Prestamo prestamo=this.read(codigo);
		em.remove(prestamo);
		
	}
	
	public Prestamo read(int codigo)
	{
		Prestamo p=em.find(Prestamo.class, codigo);
		return p;
	}
	
	
	//consulta a una BD, se hace refrencia a las entidades del paquete modelo, no a la BD
	public List<Prestamo> getPrestamos()
	{
		String jpql = "SELECT p FROM Prestamo p";
		Query q = em.createQuery(jpql, Prestamo.class);
		List<Prestamo> prestamos = q.getResultList();
		return prestamos;
		
	}
	
	
	public List<Prestamo> getPrestamosNombre(String filtro)
	{
		String jpql = "SELECT p FROM Prestamo p WHERE estudiante LIKE ?1 ";
		Query q = em.createQuery(jpql, Prestamo.class);
		q.setParameter(1, "%"+filtro+"%");
		List<Prestamo> prestamos = q.getResultList();
		return prestamos;
	}

}
