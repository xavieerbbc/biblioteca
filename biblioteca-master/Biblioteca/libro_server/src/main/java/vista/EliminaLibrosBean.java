package vista;


import java.util.List;



import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import negocio.GestionLibrosLocal;
import modelo.Libro;
@ManagedBean

/**
 *  
 *  @RequestScope
 *
 */

public class EliminaLibrosBean {
	
	@Inject
	private GestionLibrosLocal gl;
	private List<Libro> libros;
	
	/*Beans properties*/
	private String filtro;
	
	
	
	public String eliminaLibro() {
		
		System.out.println(""+filtro) ;
		gl.eliminaLibrosNombre(filtro);; 
	
		return null;
	}

	public GestionLibrosLocal getGl() {
		return gl;
	}

	public void setGl(GestionLibrosLocal gl) {
		this.gl = gl;
	}

	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}


	
}