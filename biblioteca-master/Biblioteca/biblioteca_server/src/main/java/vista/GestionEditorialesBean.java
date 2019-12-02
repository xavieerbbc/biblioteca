package vista;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import negocio.GestionEditorialLocal;
import modelo.Bibliotecario;
import modelo.Editorial;
@ManagedBean
public class GestionEditorialesBean {
	
	
	
	@Inject
	private GestionEditorialLocal Gd;
	
	/*Bean Properties*/
	private List<Editorial> editorial;
	private String codigo;
	private String nombre;
	private String ciudad;
	
	
	public String guardarEditorial() {
		
		System.out.println(codigo + "  " + nombre+ ciudad) ;
		Gd.guardarEditorial(codigo, nombre, ciudad);
		
		editorial = Gd.getEditoriales();
		
		return "listar_editoriales";
	}



	public GestionEditorialLocal getGd() {
		return Gd;
	}



	public void setGd(GestionEditorialLocal gd) {
		Gd = gd;
	}



	public List<Editorial> getEditorial() {
		return editorial;
	}



	public void setEditorial(List<Editorial> editorial) {
		this.editorial = editorial;
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



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	

	
	
}
