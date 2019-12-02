package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.AutorDAO;
import datos.BibliotecarioDAO;
import datos.EditorialDAO;
import datos.LibroDAO;
import datos.PrestamoDAO;
import modelo.Autor;
import modelo.Bibliotecario;
import modelo.Editorial;
import modelo.Libro;
import modelo.Persona;
import modelo.Prestamo;
//import java.util.ArrayList;

@Stateless
public class GestionDatos implements GestionLibrosRemote, GestionLibrosLocal, GestionAutorRemote, GestionAutorLocal,GestionBibliotecarioRemote, GestionBibliotecarioLocal, GestionEditorialRemote, GestionEditorialLocal , GestionPrestamoLocal, GestionPrestamoRemote{

	@Inject
	private LibroDAO daoLib;
	@Inject
	private AutorDAO daoAut;
	@Inject
	private BibliotecarioDAO daoCat;
	@Inject
	private EditorialDAO daoEdit;
	@Inject
	private PrestamoDAO daoPre;

	public void guardarLibro(String codigo, String titulo, String anio, String autor, String editorial) {
		Libro L = new Libro();
		L.setCodigo(codigo);
		L.setTitulo(titulo);
		L.setAutor(autor);
		L.setAnio(anio);
		L.setEditorial(editorial);
		System.out.println(L);
		daoLib.insert(L);

	}

	public List<Libro> getLibros() {
		return daoLib.getLibros();
	}

	public List<Libro> getLibrosNombre(String filtro) {
		return daoLib.getLibrosNombre(filtro);
	}

	public void removeLibrosNombre(String filtro) {
		daoLib.remove(filtro);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////

	public void guardarAutor(String codigo, String nombre) {
		Autor A = new Autor();
		A.setCodigo(codigo);
		A.setNombre(nombre);
		System.out.println(A);
		daoAut.insert(A);

	}

	public List<Autor> getAutores() {
		return daoAut.getAutores();
	}

	public List<Autor> getAutoresNombre(String filtro) {
		return daoAut.getAutoresNombre(filtro);
	}

	///////////////////////////////////////////////////////////////////

	public void guardarBibliotecario(String codigo, String nombre, String horario) {
		Bibliotecario B = new Bibliotecario();
		B.setCodigo(codigo);
		B.setNombre(nombre);
		B.setHorario(horario);
		System.out.println(B);
		daoCat.insert(B);

	}

	public List<Bibliotecario> getBibliotecarios() {
		return daoCat.getBibliotecarios();
	}

	public List<Bibliotecario> getBibliotecariosNombre(String filtro) {
		return daoCat.getBibliotecariosNombre(filtro);
	}

	////////////////////////////////////////////////////////////////////////

	public void guardarEditorial(String codigo, String nombre, String ciudad) {
		Editorial E = new Editorial();
		E.setCodigo(codigo);
		E.setNombre(nombre);
		E.setCiudad(ciudad);
		System.out.println(E);
		daoEdit.insert(E);

	}

	public List<Editorial> getEditoriales() {
		return daoEdit.getEditoriales();
	}

	public List<Editorial> getEditorialesNombre(String filtro) {
		return daoEdit.getEditorialesNombre(filtro);
	}

	//////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////

	public void guardarPrestamo(String codigo, String fecha, String estudiante, String bibliotecario, String libro) {
		Prestamo p = new Prestamo();
		p.setCodigo(codigo);
		p.setFecha(fecha);
		p.setEstudiante(estudiante);
		p.setBibliotecario(bibliotecario);
		p.setLibro(libro);
		System.out.println(p);
		daoPre.insert(p);

	}
	public List<Prestamo> getPrestamos() {
		return daoPre.getPrestamos();
	}

	public List<Prestamo> getPrestamosNombre(String filtro) {
		return daoPre.getPrestamosNombre(filtro);
	}

	

//////////////////////////////////////////////////////////////////////////////

	

	@Override
	public List<Editorial> getEditorialesNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bibliotecario> getBibliotecariosNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Autor> getAutoresNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public void eliminaLibrosNombre(String filtro) {
		// TODO Auto-generated method stub

	}
///////////////////////////////////////////////////////////////////////////

	@Override
	public void guardarBibliotecario(String codigo, String nombre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Prestamo> getPrestamosNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
