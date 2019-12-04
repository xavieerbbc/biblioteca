/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import BD.Consultas;
import Controlador.EventoVentanaAutor;
import Controlador.EventoVentanaLibros;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier
 */
public class VtnIngresarAutor extends JInternalFrame{
    
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private List<JButton> botonList;
    private JPanel panelPrincipal;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private Consultas cons;

    public VtnIngresarAutor(Consultas cons) {
        super("Autores", true, true, true, true);
        this.cons = cons;
        this.iniciaComponentes();
        this.setSize(600, 450);
    }

    public void iniciaComponentes() {
        this.etiList = new ArrayList<JLabel>();
        this.etiList.add(new JLabel("au_codigo:"));
        this.etiList.add(new JLabel("au_nombre:"));
        this.etiList.add(new JLabel("au_nacionalidad:"));
        

        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        

        this.botonList = new ArrayList<JButton>();
        this.botonList.add(new JButton("Insertar"));
        this.botonList.add(new JButton("Modificar"));
        this.botonList.add(new JButton("Borrar"));
        this.botonList.add(new JButton("Listar"));

        LayoutManager disenioPrincipal = new BorderLayout();
        this.panelPrincipal = new JPanel(disenioPrincipal);
        LayoutManager disenioSup = new GridLayout(7, 2);
        JPanel panelSup = new JPanel(disenioSup);

        for (int i = 0; i < 3; i++) {
            panelSup.add(this.etiList.get(i));
            panelSup.add(this.txtList.get(i));
        }
        panelSup.add(this.botonList.get(0));
        panelSup.add(this.botonList.get(1));
        panelSup.add(this.botonList.get(2));
        panelSup.add(this.botonList.get(3));
        

        this.botonList.get(0).addActionListener((ActionListener) new EventoVentanaAutor(this));
        this.botonList.get(1).addActionListener((ActionListener) new EventoVentanaAutor(this));
        this.botonList.get(2).addActionListener((ActionListener) new EventoVentanaAutor(this));
        this.botonList.get(3).addActionListener((ActionListener) new EventoVentanaAutor(this));
        


        this.panelPrincipal.add(panelSup, BorderLayout.NORTH);

        this.modeloTabla = new DefaultTableModel();
        this.modeloTabla.setColumnIdentifiers(new Object[]{"au_codigo", "au_nombre", "au_nacionalidad"});

        this.tabla = new JTable(this.cargarTabla());
        this.scroll = new JScrollPane(this.tabla);

        this.panelPrincipal.add(this.scroll, BorderLayout.CENTER);

        this.add(this.panelPrincipal);

    }

    public DefaultTableModel cargarTabla() {
        for (int i = this.modeloTabla.getRowCount() - 1; i >= 0; i--) {
            this.modeloTabla.removeRow(i);
        }

        ResultSet resultado = this.cons.ConsultarAutor();
        try {
            while (resultado.next()) {
                this.modeloTabla.addRow(new Object[]{resultado.getString("au_codigo"), resultado.getString("au_nombre"), resultado.getString("au_nacionalidad")});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.modeloTabla;
    }

    public List<JLabel> getEtiList() {
        return etiList;
    }

    public void setEtiList(List<JLabel> etiList) {
        this.etiList = etiList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public List<JButton> getBotonList() {
        return botonList;
    }

    public void setBotonList(List<JButton> botonList) {
        this.botonList = botonList;
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public Consultas getCons() {
        return cons;
    }

    public void setCons(Consultas cons) {
        this.cons = cons;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;

    }
    
}
