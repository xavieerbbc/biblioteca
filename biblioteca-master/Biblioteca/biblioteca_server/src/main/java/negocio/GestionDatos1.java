package negocio;

import java.util.List;



import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.AutorDAO;
import datos.BibliotecarioDAO;
import datos.EditorialDAO;
import datos.LibroDAO;
import modelo.Autor;
import modelo.Bibliotecario;
import modelo.Editorial;
import modelo.Libro;
//import java.util.ArrayList;


@Stateless
public class GestionDatos1{
	
	@Inject
	private LibroDAO daoLib;
	@Inject
	private AutorDAO daoAut;
	@Inject 
	private BibliotecarioDAO daoCat;
	
	
	public void guardarLibro(Libro libro){
		
		if(daoLib.read(libro.getCodigo())==null)
		{
			daoLib.insert(libro);
		}
		else
		{
			daoLib.update(libro);
		}
		
	}
	
	public List<Libro> getLibros(){
		return daoLib.getLibros();
	}

	public List<Autor> getAutores(){
		return daoAut.getAutores();
	}
	
	
	
	public List<Libro> getLibrosNombre(String filtro)
	{
		return daoLib.getLibrosNombre(filtro);
	}
	
	public void removeLibrosNombre(String filtro)
	{
		daoLib.remove(filtro);
	}

	public LibroDAO getDaoLib() {
		return daoLib;
	}

	public void setDaoLib(LibroDAO daoLib) {
		this.daoLib = daoLib;
	}

	public AutorDAO getDaoAut() {
		return daoAut;
	}

	public void setDaoAut(AutorDAO daoAut) {
		this.daoAut = daoAut;
	}

	public void guardarBibliotecario(String codigo, String nombre) {
		Bibliotecario B = new Bibliotecario();
		B.setCodigo(codigo);
		B.setNombre(nombre);
		System.out.println(B);
		daoCat.insert(B);

	}

	public List<Bibliotecario> getBibliotecarios() {
		return daoCat.getBibliotecarios();
	}

	public List<Bibliotecario> getBibliotecariosNombre(String filtro) {
		return daoCat.getBibliotecariosNombre(filtro);
	}

	
	

	
}
