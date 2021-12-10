package Logica;

import java.util.List;
import javax.persistence.ManyToMany;

/**
 *
 * @author lucquifer
 */
public class PaqueteTuristico {

    public int codigo_paquete;
    public double costo;
    
    // Aqui va la relacion con la otra clase va de 1 a n
    @ManyToMany
    public List<ServicioTuristico> listaServicios;
    
}
