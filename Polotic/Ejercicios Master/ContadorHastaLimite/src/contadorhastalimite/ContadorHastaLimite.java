/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorhastalimite;

import java.util.Scanner;

/**
 *
 * @author lucquifer
 */
public class ContadorHastaLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 1;
        int n = 0;
        Scanner limite = new Scanner (System.in);
        System.out.println("Ingrese un limite para contar: ");
        
        n = limite.nextInt();
        
        while (i <= n){
            System.out.println(i);
            i++;
            System.out.println("");
        }
        System.out.println("Se acabo");
    }
    
}
