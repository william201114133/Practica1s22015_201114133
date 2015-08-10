/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MarioBroos;

/**
 *
 * @author William
 */
public class objeto {
    objeto punterosiguiente;
    objeto punteroanterior;
    
    String nombre;
    String imagen;
    
    public objeto(String nombre, String imagen){
    this.nombre=nombre;
    this.imagen=imagen;
    }
    
    public void setnombre(String nombre){
    this.nombre=nombre;
    }
    public String getnombre(){
    return nombre;
    }
    public String getimagen(){
    return imagen;
    }
}
