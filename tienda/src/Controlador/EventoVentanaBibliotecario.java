/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Interfaces.VtnIngresarAutor;
import Interfaces.VtnIngresarBibliotecario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Javier
 */
public class EventoVentanaBibliotecario implements ActionListener{
    
    private VtnIngresarBibliotecario ventanaLibros;

    public EventoVentanaBibliotecario(VtnIngresarBibliotecario ventanaLibros) {
        this.ventanaLibros = ventanaLibros;
    }

    public VtnIngresarBibliotecario getVentanaLibros() {
        return ventanaLibros;
    }

    public void setVentanaLibros(VtnIngresarBibliotecario ventanaLibros) {
        this.ventanaLibros = ventanaLibros;
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==this.ventanaLibros.getBotonList().get(0)){
        this.ventanaLibros.getCons().InsertarBibliotecario(
                this.ventanaLibros.getTxtList().get(0).getText(),
                this.ventanaLibros.getTxtList().get(1).getText(),
                this.ventanaLibros.getTxtList().get(2).getText(),
                this.ventanaLibros.getTxtList().get(3).getText());
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
        this.ventanaLibros.getCons().EliminarBibliotecario(
                this.ventanaLibros.getTxtList().get(0).getText());
       // this.ventanaLibros.cargarTabla();
       
       }if(ae.getSource()==this.ventanaLibros.getBotonList().get(3)){
        this.ventanaLibros.cargarTabla();
       }
    }
    
}
