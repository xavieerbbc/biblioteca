package negocio;

import java.util.List;



import javax.ejb.Local;
import modelo.Editorial;
import modelo.Libro;
@Local
public interface GestionEditorialLocal {
	
	public void guardarEditorial(String codigo, String nombre, String ciudad);
	public List<Editorial> getEditoriales();
	public List<Editorial> getEditorialesNombre();
}
