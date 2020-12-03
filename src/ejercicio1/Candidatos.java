/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Date;



/**
 *
 * @author david
 */

// Parametros de la clase
public class Candidatos {
    
    protected int idcandidato;
    public String nombre; 
    public String ciudad; 
    public Date fechainscripcion;
    public boolean finalista;
    
    //Constructor por defecto
    
    public Candidatos(){

    }
    
    //Constructor por parámetros 
    
    public Candidatos(int idcandidato, String nombre, String ciudad, Date fechainscripcion, boolean finalista){
        
        this.idcandidato = idcandidato;
        this.nombre = nombre;
        this.ciudad = ciudad; 
        this. fechainscripcion = fechainscripcion;
        this.finalista = finalista;
    
    }
    
    //Getters y Setters

    public int getIdcandidato() {
        return idcandidato;
    }

    public void setIdcandidato(int idcandidato) {
        this.idcandidato = idcandidato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechainscripcion() {
        return fechainscripcion;
    }

    public void setFechainscripcion(Date fechainscripcion) {
        this.fechainscripcion = fechainscripcion;
    }

    public boolean isFinalista() {
        return finalista;
    }

    public void setFinalista(boolean finalista) {
        this.finalista = finalista;
    }
    
    

}
    

