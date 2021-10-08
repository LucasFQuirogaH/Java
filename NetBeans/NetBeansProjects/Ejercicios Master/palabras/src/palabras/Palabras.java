/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras;

import java.util.Scanner;

/**
 *
 * @author lucquifer
 */
public class Palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String muestro = "";
        Scanner palabra = new Scanner (System.in);
        while(!muestro.equals ("exit")){
            System.out.println("Palabra: " + muestro);
            System.out.println("Ingrese una palabra");
            muestro = palabra.nextLine();
        }
    }
    
}
