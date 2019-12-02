package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prestamo implements Serializable {

	
	@Id
	private String codigo;
	private String fecha;
	private String estudiante;
	private String bibliotecario;
	private String libro;
	
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
	@Override
	public String toString() {
		return "Prestamo [codigo=" + codigo + ", fecha=" + fecha + ", estudiante=" + estudiante + ", bibliotecario="
				+ bibliotecario + ", libro=" + libro + "]";
	}
	
	

}
