package Logica;

import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author lucquifer
 */
public class Empleado {
    
    public int id;
    public String apellido;
    
    // Asi de sencillo genero el  1 a 1
    @OneToOne
    public Usuario unUsuario;
    
    @OneToMany
    public List<Ventas> listaVentas;
}
