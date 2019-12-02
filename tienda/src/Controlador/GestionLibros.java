/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Autor;
import Modelo.Bibliotecario;
import Modelo.Editorial;
import Modelo.Estudiante;
import Modelo.Libro;
import Modelo.Prestamo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javier
 */
public class GestionLibros {
    
    private List<Autor> autor = new ArrayList<Autor>();
    private List<Bibliotecario> biblio = new ArrayList<Bibliotecario>();
    private List<Editorial> editorial = new ArrayList<Editorial>();
    private List<Estudiante> estudiante = new ArrayList<Estudiante>();
    private List<Libro> libro = new ArrayList<Libro>();
    private List<Prestamo> prestamo = new ArrayList<Prestamo>();

    public List<Autor> getAutor() {
        return autor;
    }

    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }

    public List<Bibliotecario> getBiblio() {
        return biblio;
    }

    public void setBiblio(List<Bibliotecario> biblio) {
        this.biblio = biblio;
    }

    public List<Editorial> getEditorial() {
        return editorial;
    }

    public void setEditorial(List<Editorial> editorial) {
        this.editorial = editorial;
    }

    public List<Estudiante> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(List<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }

    public List<Libro> getLibro() {
        return libro;
    }

    public void setLibro(List<Libro> libro) {
        this.libro = libro;
    }

    public List<Prestamo> getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(List<Prestamo> prestamo) {
        this.prestamo = prestamo;
    }
    
    
    
}
