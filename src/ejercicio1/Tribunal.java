/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author david
 */
public class Tribunal {
    
    //Metodos de la clase
    
        protected int idtribunal; 
        public String nombre; 
        public String email;
        public String dni; 
        public String telefono;

    //Constructores de clase

        public Tribunal(){
        
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
    
    
        
    
    
}
