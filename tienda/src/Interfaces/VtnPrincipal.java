/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import BD.Consultas;
import Controlador.EventoVentanaPrincipal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Javier
 */
public class VtnPrincipal extends JFrame{
    
    private JDesktopPane escritorio;
    private JMenuBar barramenu;
    private List<JMenu> menuList;
    private List<JMenuItem> menuItemList;
    private Consultas cons;
    
    public VtnPrincipal(String title,int ancho,int alto,Consultas cons){
        super(title);
        this.cons=cons;
        this.setSize(ancho,alto);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciaComponentes();
        this.setVisible(true);
    }
    
    public void iniciaComponentes(){
        this.escritorio=new JDesktopPane();
        this.barramenu=new JMenuBar();
        
        this.menuList=new ArrayList<JMenu>();
        this.menuList.add(new JMenu("Tabla Libros"));
        
        this.menuItemList=new ArrayList<JMenuItem>();
        this.menuItemList.add(new JMenuItem("Libros"));
        
        this.setContentPane(this.escritorio);
        this.setJMenuBar(barramenu);
        this.barramenu.add(menuList.get(0));
        
        this.menuList.get(0).add(this.menuItemList.get(0));
        
        this.menuItemList.get(0).addActionListener(new EventoVentanaPrincipal(this));
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenuBar getBarramenu() {
        return barramenu;
    }

    public void setBarramenu(JMenuBar barramenu) {
        this.barramenu = barramenu;
    }

    public List<JMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<JMenu> menuList) {
        this.menuList = menuList;
    }

    public List<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public Consultas getCons() {
        return cons;
    }

    public void setCons(Consultas cons) {
        this.cons = cons;
    }
    
    
}
