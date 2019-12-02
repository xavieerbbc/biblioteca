package negocio;

import java.util.List;
import javax.ejb.Remote;
import modelo.Bibliotecario;
@Remote
public interface GestionBibliotecarioRemote {
	
	public void guardarBibliotecario(String codigo, String nombre);
	public List<Bibliotecario> getBibliotecarios();
}
