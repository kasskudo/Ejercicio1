/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Tribunal {
    
    //Metodos de la clase
    
        protected int idtribunal; 
        private String nombre; 
        private String email;
        private String dni; 
        private String telefono;
        private ArrayList<Audicion> audiciones;

    //Constructores de clase

        public Tribunal(){
        
        }

        public Tribunal(int idtribunal, String nombre, String email, String dni, String telefono, ArrayList<Audicion> audiciones) {
        this.idtribunal = idtribunal;
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.audiciones = audiciones;
    }
    
        public Tribunal(int idtribunal, String nombre, String email, String dni, String telefono) {
        this.idtribunal = idtribunal;
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
      
    }
    
    
   //Getters y Setters

    public int getIdtribunal() {
        return idtribunal;
    }

    public void setIdtribunal(int idtribunal) {
        this.idtribunal = idtribunal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Audicion> getAudiciones() {
        return audiciones;
    }

    public void setAudiciones(ArrayList<Audicion> audiciones) {
        this.audiciones = audiciones;
    }
    
     public void exportarTribunal(Tribunal nuevo){
     
         try{
         File f = new File("Tribunal.txt");
         FileWriter fw;
         BufferedWriter bw;
         if(f.exists()){
         fw = new FileWriter(f);
         bw = new BufferedWriter(fw);
         bw.newLine();
         bw.write(nuevo.idtribunal + "|" + nuevo.nombre + "|" + nuevo.email + "|" + nuevo.dni + "|" + nuevo.telefono);
         } else {
             fw = new FileWriter(f);
         bw = new BufferedWriter(fw);
         bw.newLine();
         bw.write(nuevo.idtribunal + "|" + nuevo.nombre + "|" + nuevo.email + "|" + nuevo.dni + "|" + nuevo.telefono);    
         }
         bw.close();
         fw.close();
         } 
         catch (Exception e) {
         System.out.println(e);
         }
     }
       
}
