/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle.por.centinela;
import java.util.Scanner;

/**
 *
 * @author lucquifer
 */
public class BuclePorCentinela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String centinela = "";
        Scanner teclado = new Scanner (System.in);
        
        while (!centinela.equals("exit")){
            System.out.println("Ingrese la clave");
            centinela = teclado.nextLine(); // Leyendo por teclado la clave
        }
        System.out.println("Listo!");
    }
    
}
