/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Interfaces.VtnIngesarLibros;
import Interfaces.VtnIngresarPrestamo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Javier
 */
public class EventoVentanaPrestamo implements ActionListener{
    private VtnIngresarPrestamo ventanaPrestamo;

    public EventoVentanaPrestamo(VtnIngresarPrestamo ventanaPrestamo) {
        this.ventanaPrestamo = ventanaPrestamo;
    }

    public VtnIngresarPrestamo getVentanaPrestamo() {
        return ventanaPrestamo;
    }

    public void setVentanaPrestamo(VtnIngresarPrestamo ventanaPrestamo) {
        this.ventanaPrestamo = ventanaPrestamo;
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==this.ventanaPrestamo.getBotonList().get(0)){
        this.ventanaPrestamo.getCons().InsertarPrestamo(
                this.ventanaPrestamo.getTxtList().get(0).getText(),
                this.ventanaPrestamo.getTxtList().get(1).getText(),
                this.ventanaPrestamo.getTxtList().get(2).getText(),
                this.ventanaPrestamo.getTxtList().get(3).getText(),
                this.ventanaPrestamo.getTxtList().get(4).getText());
           // this.ventanaLibros.cargarTabla();
       }
       if(ae.getSource()==this.ventanaPrestamo.getBotonList().get(1)){
        this.ventanaPrestamo.getCons().ActualizarPrestamo(
                this.ventanaPrestamo.getTxtList().get(0).getText(),
                this.ventanaPrestamo.getTxtList().get(1).getText(),
                this.ventanaPrestamo.getTxtList().get(2).getText(),
                this.ventanaPrestamo.getTxtList().get(3).getText(),
                this.ventanaPrestamo.getTxtList().get(4).getText());
        //this.ventanaLibros.cargarTabla();
       }if(ae.getSource()==this.ventanaPrestamo.getBotonList().get(2)){
        this.ventanaPrestamo.getCons().EliminarPrestamo(
                this.ventanaPrestamo.getTxtList().get(0).getText());
       // this.ventanaLibros.cargarTabla();
       }if(ae.getSource()==this.ventanaPrestamo.getBotonList().get(3)){
        this.ventanaPrestamo.cargarTabla();
       }}}
  
    
    
    

