package vista;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import negocio.GestionAutorLocal;
import negocio.GestionLibrosLocal;
import modelo.Autor;
import modelo.Libro;

@ManagedBean
public class BusquedaAutoresBean {
	
	@Inject //se trae instancias del servidor
	private GestionAutorLocal gl;
	
	/*Bean Properties*/
	private String filtro;
	private List<Autor> autores;
	
	public String BuscarAutor()
	{
		autores = gl.getAutores();
		return null;
	}

	public GestionAutorLocal getGl() {
		return gl;
	}

	public void setGl(GestionAutorLocal gl) {
		this.gl = gl;
	}

	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

}
