package vista;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionBibliotecarioLocal;
import negocio.GestionLibrosLocal;
import modelo.Bibliotecario;
import modelo.Libro;
@ManagedBean
public class GestionBibliotecariosBean {
	
	@Inject //se trae instancias del servidor
	private GestionBibliotecarioLocal gl;
	
	/*Bean Properties*/
	private String codigo;
	private String nombre;
	private List<Bibliotecario> bibliotecario;
	
	
	public String guardarBibliotecario() {
		
		System.out.println(codigo + "  " + nombre) ;
		gl.guardarBibliotecario(codigo, nombre);; 
		
		bibliotecario= gl.getBibliotecarios();
		
		return "listar_bibliotecarios";
	}


	public GestionBibliotecarioLocal getGl() {
		return gl;
	}


	public void setGl(GestionBibliotecarioLocal gl) {
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
