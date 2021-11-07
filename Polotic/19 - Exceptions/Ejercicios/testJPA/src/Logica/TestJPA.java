package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;

/**
 *
 * @author lucquifer
 */
public class TestJPA {
    public static void main(String[] args) {

        // Instancia de un alumno
        Alumno alumno = new Alumno("2355633", "Lucas", "Quiroga", new Date("05/04/1982"));
        
        ControladoraPersistencia control = new ControladoraPersistencia();
        
        control.crearAlumno(alumno);
    }
    
}
