/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author david
 */
public class Convocatoria implements Comparable<Convocatoria>{

    //Parámetros de la clase

    private int id;
    private Date fechaCelebracion;
    private String lugarCelebracion;
    private Categoria categoria;
    private Tribunal[] tribunal = new Tribunal[3];
    private HashMap<Integer, String> convocados;


    //Constructor por defecto

    public Convocatoria(){

    }
    
    
    //Getters y Setters
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaCelebracion() {
        return fechaCelebracion;
    }

    public void setFechaCelebracion(Date fechaCelebracion) {
        this.fechaCelebracion = fechaCelebracion;
    }

    public String getLugarCelebracion() {
        return lugarCelebracion;
    }

    public void setLugarCelebracion(String lugarCelebracion) {
        this.lugarCelebracion = lugarCelebracion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Tribunal[] getTribunal() {
        return tribunal;
    }

    public void setTribunal(Tribunal[] tribunal) {
        this.tribunal = tribunal;
    }

    public HashMap<Integer, String> getConvocados() {
        return convocados;
    }

    public void setConvocados(HashMap<Integer, String> convocados) {
        this.convocados = convocados;
    }


    
 
    
   //Interfaz Comparable para ordenar los objetos de la clase. 

    @Override
    public int compareTo(Convocatoria o) {
      return getFechaCelebracion().compareTo(o.getFechaCelebracion());
    }
    
    
    //Metodo toString 
    
    @Override
    public String toString (){
       
   return "Convocatoria{" + "identificador=" + id + ", lugarCelebracion=" + lugarCelebracion + ", fechaCelebracion=" + fechaCelebracion + ", categoria=" + categoria + 
          ", Tribunal=" + tribunal + "convocados=" + convocados + "}"; 
    }  
   

    

}
