/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Interfaces.VtnIngresarEstudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Javier
 */
public class EventoVentanaEstudiante implements ActionListener{
    
    private VtnIngresarEstudiante ventanaLibros;

    public EventoVentanaEstudiante(VtnIngresarEstudiante ventanaLibros) {
        this.ventanaLibros = ventanaLibros;
    }

    public VtnIngresarEstudiante getVentanaLibros() {
        return ventanaLibros;
    }

    public void setVentanaLibros(VtnIngresarEstudiante ventanaLibros) {
        this.ventanaLibros = ventanaLibros;
    }
    
 

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==this.ventanaLibros.getBotonList().get(0)){
        this.ventanaLibros.getCons().InsertarEstudiante(
                this.ventanaLibros.getTxtList().get(0).getText(),
                this.ventanaLibros.getTxtList().get(1).getText(),
                this.ventanaLibros.getTxtList().get(2).getText(),
                this.ventanaLibros.getTxtList().get(3).getText(),
                this.ventanaLibros.getTxtList().get(4).getText());
           // this.ventanaLibros.cargarTabla();
       }
       if(ae.getSource()==this.ventanaLibros.getBotonList().get(1)){
        this.ventanaLibros.getCons().ActualizarLibros(
                this.ventanaLibros.getTxtList().get(0).getText(),
                this.ventanaLibros.getTxtList().get(1).getText(),
                this.ventanaLibros.getTxtList().get(2).getText(),
                this.ventanaLibros.getTxtList().get(3).getText(),
                this.ventanaLibros.getTxtList().get(4).getText());
        //this.ventanaLibros.cargarTabla();
       }if(ae.getSource()==this.ventanaLibros.getBotonList().get(2)){
        this.ventanaLibros.getCons().EliminarEstudiante(
                this.ventanaLibros.getTxtList().get(0).getText());
       // this.ventanaLibros.cargarTabla();
       
       }if(ae.getSource()==this.ventanaLibros.getBotonList().get(3)){
        this.ventanaLibros.cargarTabla();
       }
    }
    
}
