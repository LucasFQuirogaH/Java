package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lucquifer
 */
public class ProbandoJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Definis un objeto de la controladora
        Controladora control = new Controladora();

        // Empezas a trabajar
        Huesped nuevoHuesped1 = new Huesped(8496569, "Juan Manuel", "Rodriguez", new Date("09/30/1981"));
        Huesped nuevoHuesped2 = new Huesped(8645983, "Gabriel", "Aranda", new Date("07/11/1981"));
        Huesped nuevoHuesped3 = new Huesped(8345893, "Mariana", "Lara", new Date("10/14/1982"));
        //Metodo ejecutor
        //control.crearHuesped(nuevoHuesped1);
        //control.crearHuesped(nuevoHuesped2);
        //control.crearHuesped(nuevoHuesped3);
        
        // Modificas el apellido por ejemplo
        nuevoHuesped3.setApellido("Lara Lahoz");
        control.modificarHuesped(nuevoHuesped3);

        //control.eliminarHuesped(nuevoHuesped2);
        List<Huesped> lista = control.obtenerHuesped();
        for (Huesped hue : lista) {
            System.out.println("Id: " + hue.getId() + "\n" + "Nombre: " + hue.getNombre() + "\n" +  "Apellido: " + hue.getApellido() + "\n" + "Fecha de Nacimiento: " + hue.getFechaNac());
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }

}
