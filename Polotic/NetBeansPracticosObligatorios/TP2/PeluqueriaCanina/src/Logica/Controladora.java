package Logica;

import Persistencia.ControladoraDePersistencia;
import java.util.List;

/**
 *
 * @author lucquifer
 */
public class Controladora {

    // Creas un objeto de la controladora de persistencia para conectarme  ---------------------------------------------
    ControladoraDePersistencia controlPersistencia = new ControladoraDePersistencia();

    // Implementas los metodos creados en la controladora de la persistencia  ----------------------------------------
    // Metodos propios de la controladora que llama a los metodos de la controladora de persistencia  --------
    
    // Metodo de apertura
    public void altaPerro(int numeroClientePantalla , String nombrePantalla , String razaPantalla , String colorPantalla , String alergicoPantalla , String atencionPantalla , String duenioPantalla , int celularPantalla , String observacionesPantalla) {
        
        Perro perro = new Perro();
        
        perro.setNum_cliente(numeroClientePantalla);
        perro.setNombre_perro(nombrePantalla);
        perro.setRaza(razaPantalla);
        perro.setColor(colorPantalla);
        perro.setAlergico(alergicoPantalla);
        perro.setAtención_especial(atencionPantalla);
        perro.setNombre_duenio(duenioPantalla);
        perro.setCelular_duenio(celularPantalla);
        perro.setObservaciones(observacionesPantalla);
        
        controlPersistencia.crearPerro(perro);
    }
    
    
    public void altaPerro(Perro perro) {
        controlPersistencia.crearPerro(perro);
    }

    public void bajaPerro(Perro perro) {
        controlPersistencia.eliminarPerro(perro);
    }

    public void bajaPerro(int Num_cliente) {
        controlPersistencia.eliminarPerro(Num_cliente);
    }

    public List<Perro> lecturaPerro() {
        return controlPersistencia.obtenerPerros();
    }

    public void modificacionPerro(Perro perro) {
        controlPersistencia.modificarPerro(perro);
    }

    public void busquedaPerro(Perro perro) {
        controlPersistencia.buscarPerro(perro);
    }

    public void busquedaPerro(int Num_cliente) {
        controlPersistencia.buscarPerro(Num_cliente);
    }
}
