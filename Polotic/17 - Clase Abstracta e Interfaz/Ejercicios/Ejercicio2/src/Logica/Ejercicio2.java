package Logica;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Crear un objeto de cada hijo
        Arbol abl1 = new Arbol("Ceibo", "Leñoso", 0.7, "Marron", "Secas", "Ceibo loco", 4, true, "Humedo");
        Flor fl1 = new Flor("Jazmin", 4, 6, "Azulado", "Blanco", "Amapola", "Verano", "Florcita", 0.24, true, "Humedo");
        Arbusto arb1 = new Arbusto(0, true, "Ligustina", "Anaranjado", true, "Rapolla", 0, true, "Humedo");
        
        //Llamamos a los metodo
        System.out.println("-------------------------------------------------------------------------");
        abl1.arbolito();
        System.out.println("");
        fl1.florcita();
        System.out.println("");
        arb1.arbustito();
    }
}
