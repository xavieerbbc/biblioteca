package negocio;

import java.util.List;

import javax.ejb.Local;

import modelo.Prestamo;

@Local
public interface GestionPrestamoLocal {
	
	public void guardarPrestamo(String codigo, String fecha, String estudiante, String bibliotecario, String libro);
	public List<Prestamo> getPrestamos();
	public List<Prestamo> getPrestamosNombre();
	

}
