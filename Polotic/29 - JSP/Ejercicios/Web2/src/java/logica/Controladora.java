package logica;
/**
 *
 * @author lucquifer
 */
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    public void crearEmpleado(String nombre, String apellido, String cargo, Double sueldo, String nombreUsu, String contrasenia) {
        
        Empleado emple = new Empleado();
        Usuario usu = new Usuario();
        
        // Asigno valores a empleado
        emple.setNombre(nombre);
        emple.setApellido(apellido);
        emple.setCargo(cargo);
        emple.setSueldo(sueldo);
        
        // Asigno valores a usuario
        usu.setNombreUsu(nombreUsu);
        usu.setContrasenia(contrasenia);
        
        // Asigno valores a empleado
        emple.setUsu(usu);
        
        controlPersis.crearEmpleado(emple , usu);
        
    }
    
}
