package modelo;

import javax.persistence.Entity;


@Entity
public class Estudiante extends Persona {
	
	private int id;
	private String carrera;
	private String ciclo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
