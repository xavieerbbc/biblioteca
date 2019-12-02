package negocio;

import java.util.List;



import javax.ejb.Local;
import modelo.Bibliotecario;
import modelo.Libro;
@Local
public interface GestionBibliotecarioLocal {
	
	public void guardarBibliotecario(String codigo, String nombre);
	public List<Bibliotecario> getBibliotecarios();
	public List<Bibliotecario> getBibliotecariosNombre();
}
