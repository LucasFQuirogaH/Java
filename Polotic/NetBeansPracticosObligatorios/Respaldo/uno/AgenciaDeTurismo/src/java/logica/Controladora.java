package logica;

import java.sql.Date;

/**
 *
 * @author lucquifer
 */
public class Controladora {

    public void crearEmpleado(String nombre, String apellido, String direccion, String dni, Date fecha_nac, String nacionalidad, String celular, String email, String cargo, Double sueldo, String nombreUsu, String contrasenia) {

        Empleado emple = new Empleado();
        Usuario usu = new Usuario();

        // Asignando a empleado  --------------------------------------------------------------------------------------------------------
        emple.setNombre(nombre);
        emple.setApellido(apellido);
        emple.setDirección(direccion);
        emple.setDni(dni);
        emple.setFecha_nac(fecha_nac);
        emple.setNacionalidad(nacionalidad);
        emple.setCelular(celular);
        emple.setEmail(email);
        emple.setCargo(cargo);
        
        // Asignando a Usuario  -----------------------------------------------------------------------------------------------------------
        usu.setNombreUsu(nombreUsu);
        usu.setContrasenia(contrasenia);
    }

}
