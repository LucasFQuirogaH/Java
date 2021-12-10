package Logica;

import java.util.List;
import javax.persistence.ManyToMany;

/**
 *
 * @author lucquifer
 */
public class ServicioTuristico {
    
    
    // Atributos
    public int codigo;
    public String nombre;
    public String descripcion;
    
    // Aqui colocas la relacion que va a haber de 1 a n
    @ManyToMany
    public List<PaqueteTuristico> listaPaquetes;
  
    
}
