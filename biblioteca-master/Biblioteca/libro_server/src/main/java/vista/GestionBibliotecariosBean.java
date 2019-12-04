package vista;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionDatos;
import modelo.Bibliotecario;
import modelo.Libro;
@ManagedBean
public class GestionBibliotecariosBean {
	
	@Inject //se trae instancias del servidor
	private GestionDatos gl;
	
	/*Bean Properties*/
	private String codigo;
	private String nombre;
	private List<Bibliotecario> bibliotecario;
	
	
	public String guardarBibliotecario() {
		
		System.out.println(codigo + "  " + nombre) ;
		gl.guardarBibliotecario(codigo, nombre);
		
		bibliotecario= gl.getBibliotecarios();
		
		return "listar_bibliotecario";
	}





	public GestionDatos getGl() {
		return gl;
	}





	public void setGl(GestionDatos gl) {
		this.gl = gl;
	}





	public List<Bibliotecario> getBibliotecario() {
		return bibliotecario;
	}


	public void setBibliotecario(List<Bibliotecario> bibliotecario) {
		this.bibliotecario = bibliotecario;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	

}
