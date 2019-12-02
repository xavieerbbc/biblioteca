/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Interfaces.VtnIngesarLibros;
import Interfaces.VtnPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Javier
 */
public class EventoVentanaPrincipal implements ActionListener {
    
    private VtnPrincipal ventanaPrincipal;

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
            VtnIngesarLibros vJB = new VtnIngesarLibros(this.ventanaPrincipal.getCons());
            vJB.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vJB);
        } 
     }
}