package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionBibliotecarioLocal;
import negocio.GestionLibrosLocal;
import modelo.Bibliotecario;
import modelo.Libro;
@ManagedBean
public class BusquedaBibliotecariosBean {
	
	@Inject //se trae instancias del servidor
	private GestionBibliotecarioLocal gl;
	
	/*Bean Properties*/
	private String filtro;
	
	private List<Bibliotecario> bibliotecario;
	
	
	public String BuscarBibliotecario()
	{
		bibliotecario = gl.getBibliotecariosNombre();
		return null;
	}


	public GestionBibliotecarioLocal getGl() {
		return gl;
	}


	public void setGl(GestionBibliotecarioLocal gl) {
		this.gl = gl;
	}


	public String getFiltro() {
		return filtro;
	}


	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}



	public List<Bibliotecario> getBibliotecario() {
		return bibliotecario;
	}


	public void setBibliotecario(List<Bibliotecario> bibliotecario) {
		this.bibliotecario = bibliotecario;
	}
	

	
	
	
	

}