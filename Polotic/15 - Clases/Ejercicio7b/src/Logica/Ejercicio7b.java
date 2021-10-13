/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

/**
 *
 * @author lucquifer
 */
public class Ejercicio7b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mueble m1 = new Mueble("Ropero", 1.2, 0.7, "Fenolico", 8);
        Mueble m2 = new Mueble("Mesa", 1.6, 0.9, "Melamina", 4);
        Mueble m3 = new Mueble("Silla", 0.4, 0.4, "Corrugado", 6);
        // Muestro -----------------------------------------------------------------------------------------------------------------------------
        System.out.println("Mueble 1 : " + m1.toString());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mueble 2 : " + m2.toString());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mueble 3 : " + m3.toString());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        // Modificamos a madera el material -----------------------------------------------------------------------------------------
        m1.setMaterial("Madera");
        m2.setMaterial("Madera");
        m3.setMaterial("Madera");
        // Muestro otra vez -----------------------------------------------------------------------------------------------------------------
        System.out.println("Muestro otra vez pero ya modificado -------------------------------------------------------------------------------------------------");
        System.out.println("Mueble 1 : " + m1.toString());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mueble 2 : " + m2.toString());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mueble 3 : " + m3.toString());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }
}