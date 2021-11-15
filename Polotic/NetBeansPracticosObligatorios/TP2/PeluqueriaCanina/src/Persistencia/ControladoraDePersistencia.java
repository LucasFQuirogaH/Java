package Persistencia;

import Logica.Perro;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucquifer
 */
public class ControladoraDePersistencia {

    // Creamos un objeto de la JPA controller
    PerroJpaController perriJPA = new PerroJpaController();

    // Creamos un metodo de alta  ----------------------------------------------------------------------------------------------------
    public void crearPerro(Perro perri) {
        try {
            perriJPA.create(perri);
        } catch (Exception e) {
            System.out.println("No se pudo crear el perrito!!");
        }
    }

    // Creamos un metodo de baja  ---------------------------------------------------------------------------------------------------
    public void eliminarPerro(Perro perri){
        try {
            perriJPA.destroy(perri.getNum_cliente());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // O sino 
    public void eliminarPerro(int Num_cliente){
        try {
            perriJPA.destroy(Num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Creamos un metodo de lectura
    public List<Perro> obtenerPerros(){
        return perriJPA.findPerroEntities();
    }

    // Creamos un metodo de modificacion
    public void modificarPerro(Perro perri){
        try {
            perriJPA.edit(perri);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraDePersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Metodo para la busqueda
    public Perro  buscarPerro(Perro perri){
        return perriJPA.findPerro(perri.getNum_cliente());
    }
    
        // O sino
    public Perro buscarPerro(int Num_cliente){
    return perriJPA.findPerro(Num_cliente);
    }
}
