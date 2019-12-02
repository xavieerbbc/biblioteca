/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Interfaces.VtnIngesarLibros;
/**
 *
 * @author Javier
 */
public class Consultas {
    
    private Conectar conn;
    private PreparedStatement sentencia = null;
    private ResultSet resultado = null;
    ResultSet rs;

    public Consultas(Conectar conn) {
        this.conn = conn;
    }    
//CONSULTAS LIBROS-----------------------------------------------------------------------------------------------------------------------------------
    public ResultSet ConsultarLibros() {

        try {
            this.sentencia = conn.getConnection().prepareStatement("select * from libro");
            this.resultado = this.sentencia.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.resultado;
    }
    
    public ResultSet ConsultarPrestamo() {

        try {
            this.sentencia = conn.getConnection().prepareStatement("select * from prestamo");
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
    
    public void InsertarPrestamo(String pres_codigo, String pres_fecha, String est_codigo, String bib_codigo, String li_ISBN) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("insert into prestamo(pres_codigo, pres_fecha, est_codigo, bib_codigo, li_ISBN) values(?,?,?,?,?)");
            this.sentencia.setString(1, pres_codigo);
            this.sentencia.setString(2, pres_fecha);
            this.sentencia.setString(3, est_codigo);
            this.sentencia.setString(4, bib_codigo);
            this.sentencia.setString(5, li_ISBN);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    
    public void ActualizarLibros(String li_ISBN, String li_titulo, String li_anio, String ed_codigo, String au_codigo) {
        try {
            
            
            this.sentencia = this.conn.getConnection().prepareStatement("UPDATE libro SET li_titulo=?, li_anio=?, ed_codigo=?, au_codigo=? WHERE li_ISBN = ?");
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
    
    
    public void ActualizarPrestamo(String pres_codigo, String pres_fecha, String est_codigo, String bib_codigo, String li_ISBN) {
        try {
            
            
            this.sentencia = this.conn.getConnection().prepareStatement("UPDATE presatamo SET =? pres_fecha=?, est_codigo=?, did_codigo=?, li_ISBN=? WHERE pres_codigo = ?");
            this.sentencia.setString(1, pres_codigo);
            this.sentencia.setString(2, pres_fecha);
            this.sentencia.setString(3,est_codigo );
            this.sentencia.setString(4, bib_codigo);
            this.sentencia.setString(5, li_ISBN);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    
    
    
    public void EliminarLibros(String li_ISBN) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("DELETE FROM libro WHERE li_ISBN=?");
            this.sentencia.setString(1, li_ISBN);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    
    public void EliminarPrestamo(String pres_codigo) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("DELETE FROM prestamo WHERE pres_codigo=?");
            this.sentencia.setString(1, pres_codigo);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    
    public void BuscarLibros(String li_ISBN) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("SELECT * FROM libro WHERE String li_ISBN = ?");
            this.sentencia.setString(1, li_ISBN);
            rs=this.sentencia.executeQuery();
            if(rs.next()){
                this.sentencia.setString(1, rs.getString("li_ISBN"));
                this.sentencia.setString(2, rs.getString("li_titulo"));
                this.sentencia.setString(3, rs.getString("li_anio"));
                this.sentencia.setString(4, rs.getString("ed_codigo"));
                this.sentencia.setString(5, rs.getString("au_codigo"));
               
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con la clave");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    
    
    public void BuscarPrestamo(String pres_codigo) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("SELECT * FROM prestamo WHERE String pres_codigo = ?");
            this.sentencia.setString(1, pres_codigo);
            rs=this.sentencia.executeQuery();
            if(rs.next()){
                this.sentencia.setString(1, rs.getString("pres_codigo"));
                this.sentencia.setString(2, rs.getString("pres_fecha"));
                this.sentencia.setString(3, rs.getString("est_codigo"));
                this.sentencia.setString(4, rs.getString("bib_codigo"));
                this.sentencia.setString(5, rs.getString("li_ISBN"));
               
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con la clave");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    
    
    
    
    
    //CONSULTAS AUTORES--------------------------------------------------------------------------------------------------------------------------------
    public ResultSet ConsultarAutor() {

        try {
            this.sentencia = conn.getConnection().prepareStatement("select * from autor");
            this.resultado = this.sentencia.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.resultado;
    }
    public void InsertarAutor(String au_codigo, String au_nombre, String au_nacionalidad) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("insert into autor(au_codigo, au_nombre, au_nacionalidad) values(?,?,?)");
            this.sentencia.setString(1, au_codigo);
            this.sentencia.setString(2, au_nombre);
            this.sentencia.setString(3, au_nacionalidad);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void EliminarAutor(String au_codigo) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("DELETE FROM autor WHERE au_codigo=?");
            this.sentencia.setString(1, au_codigo);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    public void BuscarAutor(String au_codigo) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("SELECT * FROM autor WHERE String au_codigo = ?");
            this.sentencia.setString(1, au_codigo);
            rs=this.sentencia.executeQuery();
            if(rs.next()){
                this.sentencia.setString(1, rs.getString("au_codigo"));
                this.sentencia.setString(2, rs.getString("au_nombre"));
                this.sentencia.setString(3, rs.getString("au_nacionalidad"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con la clave");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    
    //CONSULTAS DEL BIBLIOTECARIO-----------------------------------------------------------------------------------------------
    
    public ResultSet ConsultarBibliotecario() {

        try {
            this.sentencia = conn.getConnection().prepareStatement("select * from bibliotecario");
            this.resultado = this.sentencia.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.resultado;
    }
    public void InsertarBibliotecario(String bib_codigo, String bib_nombres, String bib_apellidos, String bib_horario) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("insert into bibliotecario(bib_codigo, bib_nombres, bib_apellidos, bib_horario) values(?,?,?,?)");
            this.sentencia.setString(1, bib_codigo);
            this.sentencia.setString(2, bib_nombres);
            this.sentencia.setString(3, bib_apellidos);
            this.sentencia.setString(4, bib_horario);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void EliminarBibliotecario(String bib_codigo) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("DELETE FROM bibliotecario WHERE bib_codigo=?");
            this.sentencia.setString(1, bib_codigo);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    public void BuscarBibliotecario(String bib_codigo) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("SELECT * FROM bibliotecario WHERE String bib_codigo = ?");
            this.sentencia.setString(1, bib_codigo);
            rs=this.sentencia.executeQuery();
            if(rs.next()){
                this.sentencia.setString(1, rs.getString("bib_codigo"));
                this.sentencia.setString(2, rs.getString("bib_nombres"));
                this.sentencia.setString(3, rs.getString("bib_apellidos"));
                this.sentencia.setString(3, rs.getString("bib_horario"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con la clave");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    //CONSULTAS EDITORIALES--------------------------------------------------------------------------------------------------------------------------------
    public ResultSet ConsultarEditorial() {

        try {
            this.sentencia = conn.getConnection().prepareStatement("select * from editorial");
            this.resultado = this.sentencia.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.resultado;
    }
    public void InsertarEditorial(String ed_codigo, String ed_nombre, String ed_ciudad) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("insert into editorial(ed_codigo, ed_nombre, ed_ciudad) values(?,?,?)");
            this.sentencia.setString(1, ed_codigo);
            this.sentencia.setString(2, ed_nombre);
            this.sentencia.setString(3, ed_ciudad);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void EliminarEditorial(String ed_codigo) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("DELETE FROM editorial WHERE ed_codigo=?");
            this.sentencia.setString(1, ed_codigo);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
     //CONSULTA ESTUDIANTES----------------------------------------------------------------------------------------------------------------------------
    public ResultSet ConsultarEstudiante() {

        try {
            this.sentencia = conn.getConnection().prepareStatement("select * from estudiante");
            this.resultado = this.sentencia.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.resultado;
    }
    public void InsertarEstudiante(String est_codigo, String est_nombres, String est_apellidos, String est_carrera, String est_ciclo) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("insert into estudiante(est_codigo, est_nombres, est_apellidos, est_carrera, est_ciclo) values(?,?,?,?,?)");
            this.sentencia.setString(1, est_codigo);
            this.sentencia.setString(2, est_nombres);
            this.sentencia.setString(3, est_apellidos);
            this.sentencia.setString(4, est_carrera);
            this.sentencia.setString(5, est_ciclo);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void EliminarEstudiante(String est_codigo) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("DELETE FROM estudiante WHERE est_codigo=?");
            this.sentencia.setString(1, est_codigo);
            this.sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    public void BuscarEstudiante(String est_codigo) {
        try {
            this.sentencia = this.conn.getConnection().prepareStatement("SELECT * FROM estudiante WHERE String est_codigo = ?");
            this.sentencia.setString(1, est_codigo);
            rs=this.sentencia.executeQuery();
            if(rs.next()){
                this.sentencia.setString(1, rs.getString("est_codigo"));
                this.sentencia.setString(2, rs.getString("est_nombres"));
                this.sentencia.setString(3, rs.getString("est_apellidos"));
                this.sentencia.setString(4, rs.getString("est_carrera"));
                this.sentencia.setString(5, rs.getString("est_ciclo"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con la clave");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
   
}
