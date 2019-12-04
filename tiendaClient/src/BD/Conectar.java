/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Javier
 */
public class Conectar {
    private static Connection conn;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String passvord="";
    private static final String url="jdbc:mysql://localhost:3306/biblioteca";
    
    // Funcion que va conectarse a mi bd de mysql
    public Conectar() {
        // Reseteamos a null la conexion a la bd
        conn=null;
        try{
            Class.forName(driver);
            // Nos conectamos a la bd
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (conn!=null){
                System.out.println("Conexion establecida");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion" + e);
            
        }
    }
    public  Connection getConnection(){
        return conn;
    }   
    
    public void desconectar(){
        conn =null;
        if(conn==null){
            System.out.println("Conexion terminada");
        }
    }
}
