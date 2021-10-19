package Logica;

public class Ejercicio1b {

    public static void main(String[] args) {

        // Creamos el vector
        Fruta vectorFruta[] = new Fruta[5];

        // Creamos las 5 frutas
        Fruta ft1 = new Fruta("Mango", "Naranja", 16, "Dura", true);
        vectorFruta[0] = ft1;
        Fruta ft2 = new Fruta("Kiwi", "Verde", 20, "Blanda", true);
        vectorFruta[1] = ft2;
        Fruta ft3 = new Fruta("Naranja", "Naranja", 32, "Blanda", true);
        vectorFruta[2] = ft3;
        Fruta ft4 = new Fruta("Banana", "Amarilla", 45, "Blanda", true);
        vectorFruta[3] = ft4;
        Fruta ft5 = new Fruta("Anana", "Marron", 70, "Dura", false);
        vectorFruta[4] = ft5;

        // Mostrar nombre y calorias
        for (int i = 0; i < vectorFruta.length; i++) {
            System.out.println("El nombre de la fruta es: " + vectorFruta[i].getNombre());
            System.out.println("La cantidad de calorias es de: " + vectorFruta[i].getCalorías());
            System.out.println("---------------------------------------");
        }

        // Cambiamos todos los datos de la fruta 1 y la fruta 4
        //("Mango", "Naranja", 16, "Dura", true);
        vectorFruta[0].setNombre("Sandia");
        vectorFruta[0].setColor("Verde");
        vectorFruta[0].setCalorías(34);
        vectorFruta[0].setTipoCascara("Semi Dura");
        vectorFruta[0].setEsComestible(true);

        //("Banana", "Amarilla", 45, "Blanda", true);
        vectorFruta[3].setNombre("Pera");
        vectorFruta[3].setColor("Amarilla");
        vectorFruta[3].setCalorías(14);
        vectorFruta[3].setTipoCascara("Blanda");
        vectorFruta[3].setEsComestible(true);

        // Mostramos de vuelta todo
        System.out.println("");
        for (int i = 0; i < vectorFruta.length; i++) {
            System.out.println("El nombre de la fruta es: " + vectorFruta[i].getNombre());
            System.out.println("La cantidad de calorias es de: " + vectorFruta[i].getCalorías());
            System.out.println("---------------------------------------");
        }

        // Mostrar las frutas que sean de color verde
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < vectorFruta.length; i++) {
            if (vectorFruta[i].getColor().equals("Verde")) {
                System.out.println(vectorFruta[i]);
            }
        }
    }
}
