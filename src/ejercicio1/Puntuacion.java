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
    
    protected int idpuntiacion; 
    public int puntuacion; 
    public boolean especial;
    protected Audicion idaudicion;
    protected Tribunal idtribunal;
    
    //Constructores 
    
    public Puntuacion(){
    
    }

    public Puntuacion(int idpuntiacion, int puntuacion, boolean especial) {
        this.idpuntiacion = idpuntiacion;
        this.puntuacion = puntuacion;
        this.especial = especial;
    }
    
    
}
