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
public class CategoriaDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Bibliotecario categoria)
	{
		em.persist(categoria);
		
	}
	
	public void update(Bibliotecario categoria)
	{
		em.merge(categoria);
		
	}
	
	public void remove(int codigo)
	{
		Bibliotecario categoria=this.read(codigo);
		em.remove(categoria);
		
	}
	
	public Bibliotecario read(int codigo)
	{
		Bibliotecario c=em.find(Bibliotecario.class, codigo);
		return c;
	}
	
	
	//consulta a una BD, se hace refrencia a las entidades del paquete modelo, no a la BD
	public List<Bibliotecario> getCategorias()
	{
		String jpql = "SELECT c FROM Categoria c";
		Query q = em.createQuery(jpql, Bibliotecario.class);
		List<Bibliotecario> categorias = q.getResultList();
		return categorias;
		
	}
	
	
	public List<Bibliotecario> getCategoriasNombre(String filtro)
	{
		String jpql = "SELECT c FROM Categoria c WHERE nombre LIKE ?1 ";
		Query q = em.createQuery(jpql, Bibliotecario.class);
		q.setParameter(1, "%"+filtro+"%");
		List<Bibliotecario> categorias = q.getResultList();
		return categorias;
	}
	
	
	

}
