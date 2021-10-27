package Logica;

import java.util.List;
import java.util.LinkedList;

public class ListasEnlazadas {

    public static void main(String[] args) {

        List<Persona> ListaDePersonas = new LinkedList<Persona>();

        // Agregamos las Personas a la lista -------------------------------------------------------
        ListaDePersonas.add(new Persona(73658, "Juan Moncho", 54));
        Persona pers1 = new Persona(7282, "Roberto Gomez", 36);
        ListaDePersonas.add(pers1);
        ListaDePersonas.add(new Persona(84764, "Manuel Terraza", 43));

        // Recorrido
        System.out.println("");
        for (Persona prs : ListaDePersonas) {
            System.out.println(prs);
        }

        // Agregamos una nueva al final. Esto permite las linkedList
        ListaDePersonas.add(new Persona(1441, "Mariana Lara", 37));

        // Agregamos una al principio. Esto permite las linkedList
        ListaDePersonas.add(0, new Persona(62354, "Alejandra Lara", 37));

        // Recorrido
        System.out.println("---------------------------------------------------------------------------------------------");
        for (Persona prs : ListaDePersonas) {
            System.out.println(prs);
        }
    }
}
