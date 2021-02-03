/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author david
 */
public class Grupo extends Candidatos{
    
    //Parametros de la clase 
    
    public int idportavoz;
    public ArrayList<Persona> personas;
    
    //Constructores 
    public Grupo(){
         super();
    
    }

    public Grupo(int idportavoz, ArrayList<Persona> personas) {
        this.idportavoz = idportavoz;
        this.personas = personas;
    }

    public Grupo(int idportavoz, ArrayList<Persona> personas, int idcandidato, String nombre, String ciudad, Date fechainscripcion, boolean finalista) {
        super(idcandidato, nombre, ciudad, fechainscripcion, finalista);
        this.idportavoz = idportavoz;
        this.personas = personas;
    }

    
  
    //Getters & Setters

    public int getIdportavoz() {
        return idportavoz;
    }

    public void setIdportavoz(int idportavoz) {
        this.idportavoz = idportavoz;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
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
