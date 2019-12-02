package vista;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import modelo.Libro;
import modelo.Prestamo;
import negocio.GestionPrestamoLocal;

@ManagedBean
public class GestionPrestamosBean {

	@Inject
	private GestionPrestamoLocal gl;
	private String codigo;
	private String fecha;
	private String estudiante;
	private String bibliotecario;
	private String libro;
	private List<Prestamo> prestamos;

	public String guardarPrestamo() {

		System.out.println(codigo + "  " + "  " + fecha + "  " + estudiante + "  " + bibliotecario + "  " + libro);
		gl.guardarPrestamo(codigo, fecha, estudiante, bibliotecario, libro);

		prestamos = gl.getPrestamos();

		return "listar_prestamos";
	}

	public GestionPrestamoLocal getGl() {
		return gl;
	}

	public void setGl(GestionPrestamoLocal gl) {
		this.gl = gl;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}

	public String getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(String bibliotecario) {
		this.bibliotecario = bibliotecario;
	}

	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
}
