/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MarioBroos;
import java.util.LinkedList;
/**
 *
 * @author William
 */
public class Cola {
    LinkedList<objeto> cola = new LinkedList<objeto>();
    
    public void encolar(objeto o){
    cola.addFirst(o);
    }
    
    public objeto desencolar(){
    return cola.removeLast();
    }
}
