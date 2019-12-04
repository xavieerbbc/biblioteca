package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bibliotecario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4673459807906818530L;
	@Id
	private String codigo;
	private String nombre;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Bibliotecario [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
	
}
