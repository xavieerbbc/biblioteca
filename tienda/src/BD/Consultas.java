/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Javier
 */
public class Consultas {
    
    private Conectar conn;
    private PreparedStatement sentencia = null;
    private ResultSet resultado = null;

    public Consultas(Conectar conn) {
        this.conn = conn;
    }    

    public ResultSet ConsultarLibros() {

        try {
            this.sentencia = conn.getConnection().prepareStatement("select * from libro");
            this.resultado = this.sentencia.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.resultado;
    }

    public void InsertarLibros(String li_ISBN, String li_titulo, String li_anio, String ed_codigo, String au_codigo) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("insert into libro(li_ISBN, li_titulo, li_anio, ed_codigo, au_codigo) values(?,?,?,?,?)");
            this.sentencia.setString(1, li_ISBN);
            this.sentencia.setString(2, li_titulo);
            this.sentencia.setString(3, li_anio);
            this.sentencia.setString(4, ed_codigo);
            this.sentencia.setString(5, au_codigo);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void ActualizarLibros(String li_ISBN, String li_titulo, String li_anio, String ed_codigo, String au_codigo) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("update libro(li_ISBN=?, li_titulo=?, li_anio=?, ed_codigo=?, au_codigo=?)");
            this.sentencia.setString(1, li_ISBN);
            this.sentencia.setString(2, li_titulo);
            this.sentencia.setString(3, li_anio);
            this.sentencia.setString(4, ed_codigo);
            this.sentencia.setString(5, au_codigo);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    
    public void BorrarLibros (String li_ISBN, String li_titulo, String li_anio, String ed_codigo, String au_codigo){
        
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("delete libro (li_ISBN, li_titulo, li_anio, ed_codigo, au_codigo)values (?,?,?,?,?)");
            this.sentencia.setString(1, li_ISBN);
            this.sentencia.setString(2, li_titulo);
            this.sentencia.setString(3, li_anio);
            this.sentencia.setString(4, ed_codigo);
            this.sentencia.setString(5, au_codigo);
            this.sentencia.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

   
}
