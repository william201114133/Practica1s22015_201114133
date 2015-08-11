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
public class listadeobjetos {
   public static objeto primero;
   public static objeto ultimo;
   public static int tamaño=0;
   
   public boolean add(String nombre, String imagen) {
    if(primero==null){
            objeto nuevo=new objeto(nombre,imagen);
            primero=nuevo;
            ultimo=nuevo;
            nuevo.punterosiguiente=nuevo;
            nuevo.punteroanterior=nuevo;
            tamaño=1;
        }
        else{
            objeto nuevo= new objeto(nombre,imagen);
            ultimo.punterosiguiente=nuevo;
            nuevo.punteroanterior=ultimo;
            primero.punteroanterior=nuevo;
            nuevo.punterosiguiente=primero;
            ultimo=nuevo;
            tamaño++;}
    return true;
    }
   public boolean remove(String o) {
    objeto veri=primero;
    int conteo=0;
    while(conteo<=tamaño){
    if(o.equals(veri.getnombre())){
       veri.punteroanterior.punterosiguiente=veri.punterosiguiente;
       veri.punterosiguiente.punteroanterior=veri.punteroanterior;
       veri=null;
       tamaño--;
       break;
    }
    veri=veri.punterosiguiente;
    conteo++;
    }
    return true;
    }
}

