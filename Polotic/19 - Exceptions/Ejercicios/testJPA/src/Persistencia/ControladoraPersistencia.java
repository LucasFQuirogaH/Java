package Persistencia;

import Logica.Alumno;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucquifer
 */
public class ControladoraPersistencia {
    
    
    // Creamos una instancia ----------------------------------------------------------------------
    AlumnoJpaController aluJPA = new AlumnoJpaController();
    
    // Creamos un metodo
    public void crearAlumno(Alumno alu){
        try {
            aluJPA.create(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
