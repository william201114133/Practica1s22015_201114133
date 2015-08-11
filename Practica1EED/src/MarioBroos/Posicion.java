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
public class Posicion {
    int horizontal = 0;
    int vertical = 0;
    Posicion derecha= null;
    Posicion izquierda=null;
    Posicion arriba=null;
    Posicion abajo=null;
    
    public Posicion(){}
    
    public Posicion(int x, int y){
        horizontal = x;
        vertical = y;
    }
    
    public void siguiente(){
        horizontal ++;
    }
    
    public void anterior(){
        horizontal --;
    }
    
    public void arriba(){
        vertical ++;
    }
    public void abajo(){
        vertical --;
    }
}
