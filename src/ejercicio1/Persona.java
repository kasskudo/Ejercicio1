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
public class Persona {
    
    //parametros de la clase
    
    protected int idpersona; 
    public String nombre; 
    public String email;
    public String dni;
    public String telefono;
    protected Individual idcandidato;
    
    
    //Constructores 
    
    public Persona(){
    
    }

    public Persona(int idpersona, String nombre, String email, String dni, String telefono, Individual idcandidato) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.idcandidato = idcandidato;
    }
    
    //Getters y Setters 

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
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

    public Individual getIdcandidato() {
        return idcandidato;
    }

    public void setIdcandidato(Individual idcandidato) {
        this.idcandidato = idcandidato;
    }
    

}
