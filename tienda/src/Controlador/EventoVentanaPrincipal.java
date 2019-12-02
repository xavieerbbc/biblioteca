/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Interfaces.Editorial;
import Interfaces.VtnIngesarLibros;
import Interfaces.VtnIngresarEditorial;
import Interfaces.VtnIngresarAutor;
import Interfaces.VtnIngresarBibliotecario;
import Interfaces.VtnIngresarEstudiante;
import Interfaces.VtnIngresarPrestamo;
import Interfaces.VtnPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Javier
 */
public class EventoVentanaPrincipal implements ActionListener {
    
    private VtnPrincipal ventanaPrincipal;
    private VtnIngresarAutor ventanaAutor;

    public EventoVentanaPrincipal(VtnPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public VtnPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public void setVentanaPrincipal(VtnPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    
   

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(this.ventanaPrincipal.getMenuItemList().get(0))){
            VtnIngresarAutor vA = new VtnIngresarAutor(this.ventanaPrincipal.getCons());
            vA.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vA);
        } 
        
        if(ae.getSource().equals(this.ventanaPrincipal.getMenuItemList().get(1))){
            VtnIngresarBibliotecario vA = new VtnIngresarBibliotecario(this.ventanaPrincipal.getCons());
            vA.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vA);
        }
        if(ae.getSource().equals(this.ventanaPrincipal.getMenuItemList().get(2))){
            VtnIngresarEditorial vEdi = new VtnIngresarEditorial(this.ventanaPrincipal.getCons());
            vEdi.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vEdi);
        }
        if(ae.getSource().equals(this.ventanaPrincipal.getMenuItemList().get(3))){
            VtnIngresarEstudiante vJB = new VtnIngresarEstudiante(this.ventanaPrincipal.getCons());
            vJB.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vJB);
        }
        if(ae.getSource().equals(this.ventanaPrincipal.getMenuItemList().get(4))){
            VtnIngesarLibros vJB = new VtnIngesarLibros(this.ventanaPrincipal.getCons());
            vJB.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vJB);
        }
        if(ae.getSource().equals(this.ventanaPrincipal.getMenuItemList().get(5))){
            VtnIngresarPrestamo vJB = new VtnIngresarPrestamo(this.ventanaPrincipal.getCons());
            vJB.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vJB);
        }
     }
}