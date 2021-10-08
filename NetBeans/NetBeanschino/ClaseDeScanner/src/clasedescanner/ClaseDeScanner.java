/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasedescanner;

import java.util.Scanner;

/**
 *
 * @author lucquifer
 */
public class ClaseDeScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var Nombre = "";
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        Nombre = consola.nextLine();
        System.out.println("Su nombre es: " + Nombre);
    }
    
}
