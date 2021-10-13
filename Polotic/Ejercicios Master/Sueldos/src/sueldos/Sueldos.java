/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldos;

import java.util.Scanner;

/**
 *
 * @author lucquifer
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 12;
        float sueldos[] = new float[n];
        float suma = 0;
        Scanner teclado = new Scanner(System.in);
        //----------------------------------------------------------------------
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor: ");
            sueldos[i] = teclado.nextFloat();
            suma += sueldos[i];
        }
        System.out.println("La suma de sueldos es: " + suma + " pesos");
        System.out.println("");
        System.out.println("Y el promedio de sueldos es: " + (suma/n));
    }   
}
