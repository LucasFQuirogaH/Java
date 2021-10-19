package Logica;

public class Ejercicio1 {

    public static void main(String[] args) {

        VideoJuego vector[] = new VideoJuego[5];

        // Creacion de objetos  o instanciando  --------------------------------------------------------------------------------------
        VideoJuego vj1 = new VideoJuego(48747, "Legend of Zelda: Oracle of ages", "Gameboy color", 1, "Plataforma");
        VideoJuego vj2 = new VideoJuego(38924, "Double Dragon", "Gamesoft", 2, "Lucha");
        VideoJuego vj3 = new VideoJuego(239887, "Final Fight", "Videos Electronicos", 2, "Lucha");
        VideoJuego vj4 = new VideoJuego(53278, "Mortal Kombat", "Sega", 2, "Lucha");
        VideoJuego vj5 = new VideoJuego(83043, "Kunfu master", "Videos Electronicos", 1, "Karate");

        // Asignacion dentro del vector  -----------------------------------------------------------------------------------------------
        vector[0] = vj1;
        vector[1] = vj2;
        vector[2] = vj3;
        vector[3] = vj4;
        vector[4] = vj5;

        // Muestra titulo, consola y cantidad de jugadores  ----------------------------------------------------------------------
        for (int i = 0; i < 5; i++) {
            System.out.println("Juego " + (i + 1));
            System.out.println("Titulo: " + vector[i].getTitulo());
            System.out.println("Consola: " + vector[i].getConsola());
            System.out.println("Cantidad de jugadores: " + vector[i].getCantidadJugadores());
            System.out.println("-----------------------------------------------------------------------------------------------------------");
        }

        // Cambiamos los nombres de los 2 ultimos videojuegos -------------------------------------------------------------
        vector[3].setTitulo("MK 3");
        vector[3].setCantidadJugadores(1);
        vector[4].setTitulo("KM 1");
        vector[4].setCantidadJugadores(2);

        // Mostrar Todo  --------------------------------------------------------------------------------------------------------------------
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

        // Mostrar solo Videos Electronicos como consola
        System.out.println("");
        System.out.println("Muestro solo los que son Video Juegos:");
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getConsola().equals("Videos Electronicos")) {
                System.out.println(vector[i]);
            }
        }

    }

}
