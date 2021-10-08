/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardanombres;

import java.util.Scanner;

/**
 *
 * @author lucquifer
 */
public class GuardaNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombres[] = new String[4];
        Scanner teclado = new Scanner(System.in);
        //----------------------------------------------------------------------
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre: ");
            nombres[i] = teclado.nextLine();
        }
        //----------------------------------------------------------------------
        System.out.println("");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("El nombre es: " + nombres[i]);
            System.out.println("");
        }
    }

}
