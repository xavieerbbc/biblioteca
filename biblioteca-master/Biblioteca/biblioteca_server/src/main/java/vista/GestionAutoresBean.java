package vista;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionAutorLocal;
import modelo.Autor;
import modelo.Bibliotecario;
@ManagedBean
public class GestionAutoresBean {
	
	
	
	@Inject
	private GestionAutorLocal Gd;
	
	/*Bean Properties*/
	private String codigo;
	private String nombre;
	private List<Autor> autores;
	
	
	public String guardarAutor() {
		
		System.out.println(codigo + "  " + nombre) ;
		Gd.guardarAutor(codigo, nombre);
		autores= Gd.getAutores(); 
		
		return "listar_autores";
	}




	public GestionAutorLocal getGd() {
		return Gd;
	}



	public void setGd(GestionAutorLocal gd) {
		Gd = gd;
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




	public List<Autor> getAutores() {
		return autores;
	}




	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}






	
}
