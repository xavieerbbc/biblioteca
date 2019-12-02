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
public class Libro {
    
    private String ISBM;
	private String titulo;
	private String anio;
	private Editorial editorial;
	private Autor autor;
	
	public String getISBM() {
		return ISBM;
	}
	public void setISBM(String iSBM) {
		ISBM = iSBM;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Libro [ISBM=" + ISBM + ", titulo=" + titulo + ", anio=" + anio + ", editorial=" + editorial + ", autor="
				+ autor + "]";
	}
	
    
}
