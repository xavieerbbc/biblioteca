package modelo;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Autor{
	
	
	@Id
	@Column(name="codigo_autor")
	private String codigo;
	
	@Column(name="nombre_autor")
	private String nombre;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Autor [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
	
}
