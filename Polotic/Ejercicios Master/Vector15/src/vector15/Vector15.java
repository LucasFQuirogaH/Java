/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector15;

import java.util.Scanner;

/**
 *
 * @author lucquifer
 */
public class Vector15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Hay que contar cuantas veces se ingresa el numero 3
        //----------------------------------------------------------------------
        int n = 15;
        int numeros[] = new int[n];
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        //----------------------------------------------------------------------
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero");
            numeros[i] = teclado.nextInt();
            if (numeros[i] == 3) {
                contador++;
            }
        }
        //----------------------------------------------------------------------
        System.out.println("se encontraron " + contador + " resultados con valor 3");
    }

}
