package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionEditorialLocal;
import negocio.GestionLibrosLocal;
import modelo.Editorial;
import modelo.Libro;
@ManagedBean
public class BusquedaEditorialesBean {
	
	@Inject //se trae instancias del servidor
	private GestionEditorialLocal gl;
	
	/*Bean Properties*/
	private String filtro;
	
	private List<Editorial> editoriales;
	
	
	public String BuscarEditorial()
	{
		editoriales = gl.getEditorialesNombre();
		return null;
	}


	public GestionEditorialLocal getGl() {
		return gl;
	}


	public void setGl(GestionEditorialLocal gl) {
		this.gl = gl;
	}


	public String getFiltro() {
		return filtro;
	}


	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}


	public List<Editorial> getEditoriales() {
		return editoriales;
	}


	public void setEditoriales(List<Editorial> editoriales) {
		this.editoriales = editoriales;
	}

	

	
}
