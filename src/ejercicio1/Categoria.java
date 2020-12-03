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
public class Categoria {
    
    //Parametros de la clase.
    
    protected int idcategoria; 
    public String categoria;
    
    //Constructor por defecto
    
    public Categoria(){
    
    }

    //Constructor por parámetros.
    public Categoria(int idcategoria, String categoria) {
        this.idcategoria = idcategoria;
        this.categoria = categoria;
    }
    
    //Getters y Setters

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
