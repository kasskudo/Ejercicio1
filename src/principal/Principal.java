/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import ejercicio1.*;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author david
 */
public class Principal {
    
     public static void main(String[] args){

        Hashtable<Integer, String> conjuntoCandidatos = new Hashtable<Integer, String>();
        
        conjuntoCandidatos.put(1, "Loli");
        conjuntoCandidatos.put(2, "Los valientes");
        conjuntoCandidatos.put(3, "Magic Andrew");
        conjuntoCandidatos.put(4, "Danza Extrema Team");
        conjuntoCandidatos.put(5, "Star Acrobatics");
        conjuntoCandidatos.put(6, "Sergio Garcia");
        
        //Sacar los nombres de los candidatos
        for (Map.Entry<Integer, String> entry : conjuntoCandidatos.entrySet()) {
            System.out.println(entry.getValue());
             
        }
        
        //Array estatico para las 3 personas del tribunal siguiendo el constructor de tribunal. 
        //(int idtribunal, String nombre, String email, String dni, String telefono)
        
    Tribunal[] personasTribunal = new Tribunal [3];
    
        Tribunal p1 = new Tribunal(1,"Luis Gutierrez", "luisguti@gmail.com", "61849405K", "923723221");
        Tribunal p2 = new Tribunal(2, "Paco Flores", "pacofloresr@gmail.com", "53900155L", "688320977");
        Tribunal p3 = new Tribunal(3, "Laura Pi", "laurapi@gmail.com", "12345687O", "987654321");
        personasTribunal[0] = p1;
        personasTribunal[1] = p2;
        personasTribunal[1] = p3;
        
    }
    
}
