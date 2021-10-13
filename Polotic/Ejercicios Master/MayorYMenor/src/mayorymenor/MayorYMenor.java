/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayorymenor;

import java.util.Scanner;

/**
 *
 * @author lucquifer
 */
public class MayorYMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 4;
        int numeros[] = new int[n];
        int mayor = 0;
        int menor = 1000000;
        Scanner teclado = new Scanner(System.in);
        //----------------------------------------------------------------------
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor: ");
            numeros[i] = teclado.nextInt();
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El mayor es: " + mayor);
        System.out.println("");
        System.out.println("El menor es: " + menor);
    }
}
