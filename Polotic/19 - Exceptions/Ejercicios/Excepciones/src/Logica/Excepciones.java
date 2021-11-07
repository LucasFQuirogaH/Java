package Logica;

public class Excepciones {

    public static void main(String[] args) {
        // Una excepcion  ----------------------------------------------------------------
        try {
            double division = 35 / 0;
            System.out.println("division = " + division);
        } catch (Exception e) {
            System.out.println("No se puede dividir por cero");
        }
        System.out.println("Hola, pasamos la excepcion");

        // Otra excepcion  ----------------------------------------------------------------
        int edades[] = {3, 4, 5, 6};
        try {
            System.out.println("La edad en la posicion 4 es: " + edades[4]);
        } catch (Exception e) {
            System.out.println("No hay nada en esa posicion");
        } finally {
            System.out.println("PASAMOS");
        }

        // Probamos otra con throws
        // Creas el objetoo
        Prueb objeto = new Prueb();
        objeto.calcularPromedio(5.9, 6.8, 0);
        
        System.out.println("Pasamos muy bien!!!!");
    
    
    
    
    // Fin  --------------------------------------------------------------------------------------------------------------------------------------
    }
}

