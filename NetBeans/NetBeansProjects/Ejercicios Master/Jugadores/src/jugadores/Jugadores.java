/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugadores;

import java.util.Scanner;

/**
 *
 * @author lucquifer
 */
public class Jugadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        int m = 3;
        int sumador = 0;
        int goles[][] = new int[n][m];
        float promedios[] = new float[n];
        Scanner teclado = new Scanner(System.in);
        //----------------------------------------------------------------------
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese el gol: ");
                goles[i][j] = teclado.nextInt();
            }
        }
        //----------------------------------------------------------------------
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumador += goles[i][j];
            }
            promedios[i] = sumador / m;
            sumador = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Los valores promedios son: " + promedios[i]);
        }
    }
}
