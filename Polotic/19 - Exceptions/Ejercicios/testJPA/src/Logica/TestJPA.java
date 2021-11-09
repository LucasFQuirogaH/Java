package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lucquifer
 */
public class TestJPA {

    public static void main(String[] args) {

        //Alumno alumno = new Alumno("78328652", "Lucas", "Quiroga", new Date("04/05/1982"));
        //Alumno alumno2 = new Alumno("184614214", "Juan", "Alberto", new Date("04/05/1982"));
        
        
        ControladoraPersistencia control = new ControladoraPersistencia();
        
//control.crearAlumno(alumno2);
        
        // Eliminar
        //control.eliminarAlumno("184614214");
        
        // Modificar
        //alumno2.setApellido("Palomino");
        //alumno2.setNombre("Mariano");
        
        // Ejecutor
        //control.modificarAlumno(alumno2);
        
        // Genero una lista para poner los registros
        //List<Alumno> listaAlumnos = control.traerAlumnos();
        //for (Alumno alu : listaAlumnos) {
            //System.out.println(alu.getDni() + " " + alu.getNombre() + " " + alu.getApellido());
        //}
        
        // Traemos un alumno en particular
        Alumno alu = control.traerAlumnoEnParticular("78328652");
        System.out.println(alu.getDni() + " " + alu.getNombre() + " " + alu.getApellido());
    }
    
}
