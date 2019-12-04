package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.Bibliotecario;
import modelo.Libro;

@Stateless
public class BibliotecarioDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Bibliotecario bibliotecario)
	{
		em.persist(bibliotecario);
		
	}
	
	public void update(Bibliotecario bibliotecario)
	{
		em.merge(bibliotecario);
		
	}
	
	public void remove(String codigo)
	{
		Bibliotecario bibliotecario=this.read(codigo);
		em.remove(bibliotecario);
		
	}
	
	public Bibliotecario read(String codigo)
	{
		Bibliotecario b=em.find(Bibliotecario.class, codigo);
		return b;
	}
	
	
	//consulta a una BD, se hace refrencia a las entidades del paquete modelo, no a la BD
	public List<Bibliotecario> getBibliotecarios()
	{
		String jpql = "SELECT b FROM Bibliotecario b";
		Query q = em.createQuery(jpql, Bibliotecario.class);
		List<Bibliotecario> bibliotecarios = q.getResultList();
		return bibliotecarios;
		
	}
	
	
	public List<Bibliotecario> getBibliotecariosNombre(String filtro)
	{
		String jpql = "SELECT b FROM Bibliotecario b WHERE nombre LIKE ?1 ";
		Query q = em.createQuery(jpql, Bibliotecario.class);
		q.setParameter(1, "%"+filtro+"%");
		List<Bibliotecario> bibliotecarios = q.getResultList();
		return bibliotecarios;
	}
	
	
	

}
