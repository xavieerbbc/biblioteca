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

public class GestionLibrosBean {
	
	@Inject
	private GestionLibrosLocal gl;
	
	
	/*Beans properties*/
	private String codigo;
	private String titulo;
	private String autor;
	private String categoria;
	private String editorial;
	
	private List<Libro> libros;
	
	
	public String guardarLibro() {
		
		System.out.println(codigo +"  "+ "  " +titulo+ "  " +autor+ "  " +categoria+ "  " +editorial) ;
		gl.guardarLibro(codigo, titulo,autor,categoria,editorial); 
		
		libros = gl.getLibros();
		
		return "listar_libros";
	}


	public GestionLibrosLocal getGl() {
		return gl;
	}


	public void setGl(GestionLibrosLocal gl) {
		this.gl = gl;
	}



	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public List<Libro> getLibros() {
		return libros;
	}


	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	

	
}