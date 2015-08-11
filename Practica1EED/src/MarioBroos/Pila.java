/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MarioBroos;
import java.util.Stack;
/**
 *
 * @author William
 */
public class Pila {
    Stack<objeto> s = new Stack<objeto>();
    
    public boolean puch(objeto o){
    s.push(o);
        return true;
    }
    
    public objeto pop(){
        return s.pop();
    }
}
