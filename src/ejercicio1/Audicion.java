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
    private int idaudicion;
    private float puntuacionmedia;
    private String lugar;
    private Calendar fechahora;
    private Categoria categoria;
    private Tribunal tribunal1;
    private Tribunal tribunal2;
    private Tribunal tribunal3;
    
    //Constructor por defecto
     public Audicion(){

    }
     
     //Constructor por parámetros

    public Audicion(int idaudicion, float puntuacionmedia, String lugar, Calendar fechahora, Categoria categoria, Tribunal tribunal1, Tribunal tribunal2, Tribunal tribunal3) {
        this.idaudicion = idaudicion;
        this.puntuacionmedia = puntuacionmedia;
        this.lugar = lugar;
        this.fechahora = fechahora;
        this.categoria = categoria;
        this.tribunal1 = tribunal1;
        this.tribunal2 = tribunal2;
        this.tribunal3 = tribunal3;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Tribunal getTribunal1() {
        return tribunal1;
    }

    public void setTribunal1(Tribunal tribunal1) {
        this.tribunal1 = tribunal1;
    }

    public Tribunal getTribunal2() {
        return tribunal2;
    }

    public void setTribunal2(Tribunal tribunal2) {
        this.tribunal2 = tribunal2;
    }

    public Tribunal getTribunal3() {
        return tribunal3;
    }

    public void setTribunal3(Tribunal tribunal3) {
        this.tribunal3 = tribunal3;
    }
    
    
    
        
 
}
