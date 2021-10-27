
package Logica;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        // Creacion de instancias
        Charmander chmdr1 = new Charmander(4, "Charmander", 15, "Masculino", 1, "Fuego");
        Bulbasaur blbsr1 = new Bulbasaur(1, "Bulbasaur", 13, "Masculino", 13, "Planta");
        Squirtle sqtl1 = new Squirtle(7, "Squirtle", 11, "Masculino", 1, "Agua");
        Pikachu pkch1 = new Pikachu(25, "Pikachu", 8, "Masculino", 1, "Electrico");
        
        // Acciones
        chmdr1.atacarAraniazo();
        System.out.println("");
        blbsr1.atacarHojaAfilada();
        System.out.println("");
        sqtl1.atacarHidropulso();
        System.out.println("");
        pkch1.atacarPlacaje();
    }
}