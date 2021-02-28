/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Connection con = Conectar.establecerConexion();
       
        
        Statement sta = con.createStatement();
        
       Statement stat = con.createStatement();
       ResultSet rset = stat.executeQuery("SELECT * FROM persona; ");
       
       
       
       
       while (rset.next()){
          String idpersona = rset.getString("idpersona");
           String nombre = rset.getString("nombre");
           String email  = rset.getString("email");
           String dni = rset.getString("dni");
           String telefono = rset.getString("telefono");
           String idcandidato = rset.getString("idcandidato");
          
           
           System.out.println("Los datos de las personas son: " + idpersona + ", " + nombre + ", " + email + ", " + dni + ", " + telefono + idcandidato);
           
       }
       
       String estado;
       String nombreArtistico; 
       String Ciudad;
       String nombrePersona; 
       String dniPersona;
       int personasGrupo;
       String portavoz;
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("¿Candidato individual o grupo?");
       estado = teclado.nextLine();
       
       if(estado.equals("individual")){
       System.out.println("Nombre artistico del candidato");
       nombreArtistico = teclado.nextLine();   
       System.out.println("Ciudad del candidato");
       Ciudad = teclado.nextLine();
       System.out.println("Nombre de la persona");
       nombrePersona = teclado.nextLine();
       System.out.println("DNI de la persona");
       dniPersona = teclado.nextLine();
       
    } else if(estado.equals("grupo")){
       System.out.println("¿Cuantos integrantes contiene el grupo?");
       personasGrupo = teclado.nextInt();
        int i;
       for(i=0; i<personasGrupo; i++){
           
           System.out.println("Nombre artistico del candidato");
       nombreArtistico = teclado.nextLine();   
       System.out.println("Ciudad del candidato");
       Ciudad = teclado.nextLine();
       System.out.println("Nombre de la persona");
       nombrePersona = teclado.nextLine();
       System.out.println("DNI de la persona");
       dniPersona = teclado.nextLine();
       
 }
       System.out.println("¿Quien es el portavoz?");
       portavoz = teclado.nextLine();
       }
             
}
    
    
}
