package pkg8.conversion.de.tipos;

import java.util.Scanner;

public class ConversionDeTipos {

    public static void main(String[] args) {
        //Convertir string a entero
        String edad = "20";
        int nuevaEdad = Integer.parseInt(edad);
        System.out.println((nuevaEdad + 1));
        System.out.println("--------------------------------------------------------------------");
        // Pedir un valor por consola
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa la edad: ");
        nuevaEdad = Integer.parseInt(consola.nextLine());
        System.out.println("La edad ingresada es: " + nuevaEdad);
        System.out.println("---------------------------------------------------------------------------------------------------");
        int anio = 1984;
        String enString = String.valueOf(anio);
        System.out.println(enString + 5);
    }

}
