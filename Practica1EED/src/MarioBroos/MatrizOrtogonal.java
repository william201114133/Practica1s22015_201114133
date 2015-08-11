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
public class MatrizOrtogonal {
    Posicion inicio;
    Posicion movimiento;
    int columnas = 0;
    int filas = 0;
    
     public MatrizOrtogonal(){
        inicio = new Posicion(0,0);
    }
    
     public void nuevaFila(){
        Posicion aux = inicio;
        int x = 1;
        filas ++;
        while(aux.abajo != null){
            aux = aux.abajo;
            x ++;
        }
        Posicion Fila = new Posicion(0,x);
        aux.abajo = Fila;
        Fila.arriba = aux;
    }
     
    public void nuevaColumna(){
        Posicion aux = inicio;
        int y = 1;
        columnas ++;
        while(aux.derecha != null){
            aux = aux.derecha;
            y ++;
        }
        Posicion Columna = new Posicion(y,0);
        aux.derecha = Columna;
        Columna.izquierda = aux;
    }
    
    public Posicion Buscar(int x, int y){
        Posicion aux = inicio;
        int i = 1;
        int j = 1;
        if(x == 0){
            movimiento = aux.abajo;}
        else if(y == 0){
            movimiento = aux.derecha;}
        else{
            movimiento = aux.derecha.abajo;}
        while (i < x) {
            movimiento = movimiento.derecha;
            i++; }
        while (j < y) {
            movimiento = movimiento.abajo;
            j++;}
        return movimiento;
    }
    
    public void Agregar(int x, int y, Posicion nuevo){
        if(x == 1 && y ==1){
            Posicion auxiliar1 = inicio.derecha;
            Posicion auxiliar2 = inicio.abajo;
            auxiliar2.derecha = nuevo;
            auxiliar1.abajo = nuevo;
            nuevo.izquierda = auxiliar2;
            nuevo.arriba = auxiliar1;
        }
        else{
            x--;
            Posicion atras = Buscar(x,y);
            Posicion arriba = atras.arriba.derecha;
            atras.derecha = nuevo;
            arriba.abajo = nuevo;
            nuevo.izquierda = atras;
            nuevo.arriba = arriba;
        }
    }
    
    public void EliminarColumna(int pos){
        movimiento = inicio;
        while (movimiento.horizontal < pos){
            movimiento = movimiento.derecha;
        }
        movimiento = movimiento.izquierda;
        Posicion auxiliar = movimiento.derecha.derecha;
        if(auxiliar == null){
            while(movimiento != null){
                movimiento.derecha = null;
                movimiento = movimiento.abajo;
            }
        }
        else{
            while(movimiento != null){
                movimiento.derecha = auxiliar;
                auxiliar.izquierda = movimiento;
                auxiliar.anterior();
                movimiento = movimiento.abajo;
                auxiliar = auxiliar.abajo;
            }
        }
        columnas --;
    }
    public void imprimirse(){
        Posicion auxiliar = inicio;
        Posicion auxiliar2 = inicio;
        int i = 0;
        while (auxiliar2 != null) {
            while (auxiliar != null) {
                System.out.print(" (" + auxiliar.horizontal + "," + auxiliar.vertical + ")  ,");
                auxiliar = auxiliar.derecha;
            }
            System.out.print("\n");
            auxiliar2 = auxiliar2.abajo;
            auxiliar = auxiliar2;
            i ++;
        }
    }
}
