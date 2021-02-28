/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Conectar {
            static final String DB_URL = "jdbc:mysql://localhost:3306/concurso";
    // Credenciales de la base de datos
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;

    public static Connection establecerConexion() {
        try {
            //System.out.println("Conectando a la Base de Datos...");
            conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            System.out.println("Se ha producido una SQLException:" + ex.getMessage());
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Se ha producido una ClassNotFoundException:" + ex.getMessage());
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            System.out.println("La conexion a la base de datos se ha realizado.");
            return conn;
        }  
   
}
}

