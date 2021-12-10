package persistencia;

import logica.Empleado;
import logica.Usuario;

/**
 *
 * @author lucquifer
 */
public class ControladoraPersistencia {

    EmpleadoJpaController empleJPA = new EmpleadoJpaController();
    UsuarioJpaController usuJPA = new UsuarioJpaController();

    public void crearEmpleado(Empleado emple, Usuario usu) {
        empleJPA.create(emple);
        usuJPA.create(usu);
    }
}
