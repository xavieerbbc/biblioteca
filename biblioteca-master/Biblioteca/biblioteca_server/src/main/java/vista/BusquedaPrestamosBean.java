package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Autor;
import modelo.Prestamo;
import negocio.GestionPrestamoLocal;

@ManagedBean
public class BusquedaPrestamosBean {
	@Inject
	private GestionPrestamoLocal gl;
	
	private String filtro;
	
	private List<Prestamo> prestamos;
	
	public String BuscarPrestamo()
	{
		prestamos = gl.getPrestamos();
		return null;
	}

	public GestionPrestamoLocal getGl() {
		return gl;
	}

	public void setGl(GestionPrestamoLocal gl) {
		this.gl = gl;
	}

	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	
	

}
