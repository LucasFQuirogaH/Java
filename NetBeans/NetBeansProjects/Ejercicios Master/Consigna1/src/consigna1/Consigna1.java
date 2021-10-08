/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consigna1;
import java.util.Scanner;

/**
 *
 * @author lucquifer
 */
public class Consigna1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        while(true){
            double sueldo = 0;
            int categoria;
            System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo");
            Scanner teclado = new Scanner (System.in);
            categoria = teclado.nextInt();
            //-------------------------------------------------------------------------------       
            if (categoria == 1){
                sueldo = 15890 * 1.1;
            } else if (categoria == 2){
                sueldo = 25630.89;
            } else if (categoria == 3){
                sueldo = 35560.20 * 0.89;
            } else{
                System.out.println("Debe ingresar un numero valido");
                System.out.println("");
            }
            //------------------------------------------------------------------------------
            if (sueldo != 0){
                System.out.println("El total de sueldo es: " + sueldo);
                System.out.println("");
            }
        }
    }
}