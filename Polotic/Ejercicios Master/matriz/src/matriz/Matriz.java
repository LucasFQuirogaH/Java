/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author lucquifer
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 2;
        int m = 2;
        int matriz[][] = new int[n][m];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < m ; j++){
                System.out.println("Ingrese el dato:");
                matriz[i][j] = teclado.nextInt();
            }
        }
        //---------------------------------------------------------------------
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < m ; j++){
                System.out.println("El valor " + i + " , " + j + " es: " + matriz[i][j]);
                System.out.println("");
            }
        }
    }
}