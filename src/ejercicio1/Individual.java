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
public class Individual extends Candidatos {
    
    //Parametros de la clase
    
    private int edad;
    private Persona persona;
    
    //Constructor por defecto
    
    public Individual(){
        super();
    }
    
    //Constructor por parámetros
    
    
    public Individual(int idcandidato, String nombre, String ciudad, Date fechainscripcion, boolean finalista, int edad) {
        super(idcandidato, nombre, ciudad, fechainscripcion, finalista);
        this.edad = edad;
    }
    
    public Individual(Candidatos candidato, int edad){
        super(candidato.idcandidato, candidato.nombre, candidato.ciudad, candidato.fechainscripcion, candidato.finalista);
        this.edad = edad; 
    }
    
    //Getters y Setters 

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

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
