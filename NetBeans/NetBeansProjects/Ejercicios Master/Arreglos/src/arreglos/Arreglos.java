/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author lucquifer
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector[] = new int [3];
        vector[0] = 35;
        vector[1] = 23;
        vector[2] = 24;
        
        //-----------------------------------------------------
        System.out.println("El valor de la posicion 2 es igual a: " + vector[1]);
        
        for (int i = 0; i < 2 ; i++){
            System.out.println("Estoy en el indice" + i + "y tiene el valor");
        }
    }
    
}
