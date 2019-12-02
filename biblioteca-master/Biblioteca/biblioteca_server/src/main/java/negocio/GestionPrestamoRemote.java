package negocio;

import java.util.List;

import javax.ejb.Remote;

import modelo.Prestamo;

@Remote
public interface GestionPrestamoRemote {
	public void guardarPrestamo(String codigo, String fecha, String estudiante, String bibliotecario, String libro);
	public List<Prestamo> getPrestamos();

}
