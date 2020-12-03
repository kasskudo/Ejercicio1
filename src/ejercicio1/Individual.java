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
public class Individual {
    
    //Parametros de la clase
    
    protected int idcandidato;
    public int edad; 
    
    //Constructor por defecto
    
    public Individual(){
    }
    
    //Constructor por parámetros

    public Individual(int idcandidato, int edad) {
        this.idcandidato = idcandidato;
        this.edad = edad;
    }
    
    //Getters y Setters 

    public int getIdcandidato() {
        return idcandidato;
    }

    public void setIdcandidato(int idcandidato) {
        this.idcandidato = idcandidato;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
 
}
