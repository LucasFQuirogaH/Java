package Logica;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        
        // Creo la lista de personas
        List <Persona> ListaDePersonas;
        
        // Hago polimorfismo pra hacer de esta Lista una de sus hijas
        ListaDePersonas = new ArrayList <Persona>();
        
        // Creamos y guardamos objetos o instancias dentro de la lista
        ListaDePersonas.add(new Persona(73658, "Juan Moncho", 54));
        Persona pers1 = new Persona(7282, "Roberto Gomez", 36);
        ListaDePersonas.add(pers1);
        ListaDePersonas.add(new Persona(84764, "Manuel Terraza", 43));
        
        // Recorrer la lista
        // Forma 1
        for (int i = 0; i < ListaDePersonas.size(); i++) {
            System.out.println("Hola " + ListaDePersonas.get(i));
        }
        // Forma 2
        System.out.println("");
        for (Persona prs : ListaDePersonas) {
            System.out.println(prs);
        }

    }
    
}
