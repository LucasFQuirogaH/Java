package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author lucquifer
 */
public class Controladora {

    // La controladora ----------------------------------------------------------------------------------------------------------------------
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    

    // Implementacion de los metodos
    public void crearHuesped(Huesped hues) {
        controlPersis.crearHuesped(hues);
    }

    public void eliminarHuesped(Huesped hues) {
        controlPersis.eliminarHuesped(hues);
    }

    public void eliminarHuesped(int id) {
        controlPersis.eliminarHuesped(id);
    }

    public List<Huesped> obtenerHuesped() {
       return controlPersis.obtenerHuesped();
    }

    public void modificarHuesped(Huesped hues) {
        controlPersis.modificaHuesped(hues);
    }

    public Huesped buscarHuesped(Huesped hues) {
       return controlPersis.buscarHuesped(hues);
    }

    public Huesped buscarHuesped(int id) {
        return controlPersis.buscarHuesped(id);
    }

}
