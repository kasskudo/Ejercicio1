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
public class Grupo {
    
    //Parametros de la clase 
    
    protected int idcandidato;
    public int idportavoz;
    
    //Constructores 
    
    public Grupo(){
    
    }

    public Grupo(int idcandidato, int idportavoz) {
        this.idcandidato = idcandidato;
        this.idportavoz = idportavoz;
    }
  
    //Getters & Setters

    public int getIdcandidato() {
        return idcandidato;
    }

    public void setIdcandidato(int idcandidato) {
        this.idcandidato = idcandidato;
    }

    public int getIdportavoz() {
        return idportavoz;
    }

    public void setIdportavoz(int idportavoz) {
        this.idportavoz = idportavoz;
    }
      
}
