/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Javier
 */
public class Prestamo {
    
    private String codigo;
	private String fecha;
	private Estudiante estudiante;
	private Bibliotecario biblio;
	private Libro libro;
	
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
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Bibliotecario getBiblio() {
		return biblio;
	}
	public void setBiblio(Bibliotecario biblio) {
		this.biblio = biblio;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	@Override
	public String toString() {
		return "Prestamo [codigo=" + codigo + ", fecha=" + fecha + ", estudiante=" + estudiante + ", biblio=" + biblio
				+ ", libro=" + libro + "]";
	}
	
    
}
