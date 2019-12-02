package negocio;

import java.util.List;


import javax.ejb.Local;

import modelo.Autor;
import modelo.Libro;
@Local
public interface GestionAutorLocal {
	
	public void guardarAutor(String codigo, String nombre);
	public List<Autor> getAutores();
	public List<Autor> getAutoresNombre();
}
