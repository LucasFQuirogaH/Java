/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7c;

/**
 *
 * @author lucquifer
 */
public class Logica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota arregloDeMascotas[] = new Mascota[5];
        Mascota m1 = new Mascota("Fili", "Chiquito", "Macho", "Marron", "Peludo", "Pequinez");
        Mascota m2 = new Mascota("Lili", "Chiquito", "Hembra", "Marron claro", "Peludo", "Pequinez");
        Mascota m3 = new Mascota("Firulais", "Chiquito", "Macho", "Marron", "Peludo", "Pequinez");
        Mascota m4 = new Mascota("Mili", "Chiquito", "Hembra", "Marron", "Peinado", "Pequinez");
        Mascota m5 = new Mascota("Pili", "Chiquito", "Hembra", "Blanco y negro", "Peinado", "Pequinez");

        arregloDeMascotas[0] = m1;
        arregloDeMascotas[1] = m2;
        arregloDeMascotas[2] = m3;
        arregloDeMascotas[3] = m4;
        arregloDeMascotas[4] = m5;

        for (int i = 0; i < 5; i++) {
            System.out.println("Mascota " + (i + 1) + ":");
            System.out.println("Su nombre es: " + arregloDeMascotas[i].getNombre());
            System.out.println("Su color es: " + arregloDeMascotas[i].getColor());
            System.out.println("Su especie es: " + arregloDeMascotas[i].getEspecie());
            System.out.println("------------------------------------------------------------------------------------------------------------");
        }

        // Cambiamos los nombres ------------------------------------------------------------------------------------------------------
        arregloDeMascotas[0].setNombre("Filiberto");
        arregloDeMascotas[1].setNombre("Liliana");
        System.out.println("Cambio de nombres -----------------------------------------------------------------------------------------------");
        for (int i = 0; i < 2; i++) {
            System.out.println("Mascota " + (i + 1) + ":");
            System.out.println("Su nombre es: " + arregloDeMascotas[i].getNombre());
            System.out.println("Su color es: " + arregloDeMascotas[i].getColor());
            System.out.println("Su especie es: " + arregloDeMascotas[i].getEspecie());
            System.out.println("------------------------------------------------------------------------------------------------------------");
        }
        // Recorrer el vector con las especie Peludo -------------------------------------------------------------------------------------------
        for (int i = 0; i < 5; i++) {
            if (arregloDeMascotas[i].getPelaje().equalsIgnoreCase("Peludo")) {
                System.out.println("Mascota " + (i + 1) + ":");
                System.out.println("Su nombre es: " + arregloDeMascotas[i].getNombre());
                System.out.println("Su color es: " + arregloDeMascotas[i].getColor());
                System.out.println("Su especie es: " + arregloDeMascotas[i].getEspecie());
                System.out.println("------------------------------------------------------------------------------------------------------------");
            }
        }
    }
}
