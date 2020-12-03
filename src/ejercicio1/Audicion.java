/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Calendar;

/**
 *
 * @author david
 */
public class Audicion {
   
    //parametros de la clase
    protected int idaudicion;
    public float puntuacionmedia;
    public String lugar;
    public Calendar fechahora;
    
    //Constructor por defecto
     public Audicion(){

    }
     
     //Constructor por parámetros

    public Audicion(int idaudicion, float puntuacionmedia, String lugar, Calendar fechahora) {
        this.idaudicion = idaudicion;
        this.puntuacionmedia = puntuacionmedia;
        this.lugar = lugar;
        this.fechahora = fechahora;
    }
    
    //Getters y setters

    public int getIdaudicion() {
        return idaudicion;
    }

    public void setIdaudicion(int idaudicion) {
        this.idaudicion = idaudicion;
    }

    public float getPuntuacionmedia() {
        return puntuacionmedia;
    }

    public void setPuntuacionmedia(float puntuacionmedia) {
        this.puntuacionmedia = puntuacionmedia;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Calendar getFechahora() {
        return fechahora;
    }

    public void setFechahora(Calendar fechahora) {
        this.fechahora = fechahora;
    }
    
    
        
 
}
