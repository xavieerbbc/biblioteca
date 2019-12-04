package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionDatos;
import modelo.Bibliotecario;
import modelo.Libro;
@ManagedBean
public class BusquedaBibliotecariosBean {
	
	@Inject //se trae instancias del servidor
	private GestionDatos gl;
	
	/*Bean Properties*/
	private String filtro;
	
	private List<Bibliotecario> bibliotecario;
	
	
	public String BuscarBibliotecario()
	{
		bibliotecario = gl.getBibliotecariosNombre(filtro);
		return null;
	}


	


	public GestionDatos getGl() {
		return gl;
	}





	public void setGl(GestionDatos gl) {
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