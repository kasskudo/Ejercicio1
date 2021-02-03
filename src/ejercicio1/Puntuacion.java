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
public class Puntuacion {
    
    //Parametros de la clase 
    
    private int idpuntiacion; 
    private int puntuacion; 
    private boolean especial;
    private Audicion audicion;
    private Tribunal tribunal;
    
    //Constructores 
    
    public Puntuacion(){
    
    }

    public Puntuacion(int idpuntiacion, int puntuacion, boolean especial, Audicion audicion, Tribunal tribunal) {
        this.idpuntiacion = idpuntiacion;
        this.puntuacion = puntuacion;
        this.especial = especial;
        this.audicion = audicion;
        this.tribunal = tribunal;
    }

    //Getters & Setters
    
    public int getIdpuntiacion() {
        return idpuntiacion;
    }

    public void setIdpuntiacion(int idpuntiacion) {
        this.idpuntiacion = idpuntiacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public Audicion getAudicion() {
        return audicion;
    }

    public void setAudicion(Audicion audicion) {
        this.audicion = audicion;
    }

    public Tribunal getTribunal() {
        return tribunal;
    }

    public void setTribunal(Tribunal tribunal) {
        this.tribunal = tribunal;
    }

    
    
    
}
