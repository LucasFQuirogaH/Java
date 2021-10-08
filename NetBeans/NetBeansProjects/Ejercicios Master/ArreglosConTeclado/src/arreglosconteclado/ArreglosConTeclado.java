/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosconteclado;

import java.util.Scanner;

/**
 *
 * @author lucquifer
 */
public class ArreglosConTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 4;
        int vector[] = new int[n];
        Scanner teclado = new Scanner (System.in);
        //---------------------------------------------------------------------
        for (int i = 0; i < n; i++){
            System.out.println("Ingrese el valor: ");
            vector[i] = teclado.nextInt();      
        }
        //---------------------------------------------------------------------
        System.out.println("");
        for (int i = 0; i < n; i++){
            System.out.println("El valor " + i + " es: " + vector[i]);
            System.out.println("");
        }
    } 
}
