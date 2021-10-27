/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

/**
 *
 * @author lucquifer
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Auto aut1 = new Auto("Negro", "Toyota", "Hilux", "LQ105IH", 4);
        Auto aut2 = new Auto();
        System.out.println("Este auto vacio: " + aut2.toString());
        System.out.println("");
        System.out.println("El auto que quiero papa es: " + aut1.toString());
        System.out.println("");
        System.out.println("El color de mi toyota es: " + aut1.getColor());
        // Seteo mi toyota a Gris Oscuro ----------------------------------------------------------------------------------------------
        aut1.setColor("Gris Oscuro");
        System.out.println("");
        System.out.println("Ahora mi camioneta toyota es de color: " + aut1.getColor());
    }
}
