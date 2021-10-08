/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdevariable;

/**
 *
 * @author lucquifer
 */
public class TiposDeVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Minimo en Byte " + Byte.MIN_VALUE);
        System.out.println("Maximo en Byte " + Byte.MAX_VALUE);
        //----------------------------------------------------------------------
        System.out.println("");
        System.out.println("Maximo en short " + Short.MAX_VALUE);
        System.out.println("Minimo en Short " + Short.MIN_VALUE);
        //----------------------------------------------------------------------
        System.out.println("");
        int Entero = 10;
        var Flotante = 20.98;
        System.out.println("La suma es: " + (Entero + Flotante));
        System.out.println("");
        System.out.println("El flotante es: " + (int)Flotante);
        //----------------------------------------------------------------------
        System.out.println("");
        System.out.println("El minimo int es " + Integer.MIN_VALUE);
        System.out.println("El maximo int es " + Integer.MAX_VALUE);
        //----------------------------------------------------------------------
        System.out.println("");
        float NumeroFlotante = 10;
        System.out.println("NumeroFlotante = " + NumeroFlotante);
        //----------------------------------------------------------------------
        System.out.println("");
        System.out.println("Valor minimo float " + Float.MIN_VALUE);
        System.out.println("Valor maximo float " + Float.MAX_VALUE);
        //----------------------------------------------------------------------
        System.out.println("");
        System.out.println("Valor minimo double " + Double.MIN_VALUE);
        System.out.println("Valor maximo double " + Double.MAX_VALUE);
    }
}
