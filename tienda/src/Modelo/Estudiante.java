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
public class Estudiante extends Persona{
    
    private String codigo;
	private String carrera;
	private String ciclo;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	@Override
	public String toString() {
		return "Estudiante [codigo=" + codigo + ", carrera=" + carrera + ", ciclo=" + ciclo + "]";
	}
	
    
}
