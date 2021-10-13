/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignament2;

import java.util.Scanner;

/**
 *
 * @author lucquifer
 */
public class Assignament2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var Nombre = "";
        var Titulo = "";
        Scanner teclado = new Scanner(System.in);
        //----------------------------------------------------------------------
        System.out.println("Ingrese el nombre: ");
        Nombre = teclado.nextLine();
        System.out.println("Ingrese el titulo");
        Titulo = teclado.nextLine();
        //----------------------------------------------------------------------
        System.out.println("El titulo " + Titulo + " fue escrito por " + Nombre);
    }

}
