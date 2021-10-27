package Logica;

import java.util.Stack;

public class StackList {

    public static void main(String[] args) {

        // Declaracion de StackList
        Stack<Integer> Pila = new Stack <Integer>();
        
        //Mostrar la lista
        System.out.println(Pila);
        System.out.println();
        System.out.println(Pila.isEmpty());
        
        // Agregar datos
        Pila.push(9);
        Pila.push(4);
        Pila.push(8);
        Pila.push(19);
        
        // Para recorrer los datos
        for (Integer dato : Pila ){
            System.out.println(dato);
            System.out.println("");
        }
         
        // Ahora probamos que la muestre igual como recien
        System.out.println();
        System.out.println(Pila);
        
        // Traemos el ultimo dato
        System.out.println();
        Pila.pop();
        System.out.println(Pila);
        
        // Busqueda
        System.out.println();
        System.out.println(Pila.search(5));
        
        // Solo mostrar el ultimo
        System.out.println();
        System.out.println(Pila.peek());
        
    }
}
