package Logica;

import IGU.Principal;

/**
 *
 * @author lucquifer
 */
public class PeluqueriaCanina {
    public static void main(String[] args) {

         // Creamos un objeto de la clase controladora
        Controladora control = new Controladora();
        
        // Configuracion de Pantalla  ----------------------------------------------------------------------------------------------------
        // Creas la pantalla
        Principal pantalla = new Principal(control);
        
        // La haces visible
        pantalla.setVisible(true);
        
        // Ubicas la pantalla en el medio
        pantalla.setLocationRelativeTo(null);
        // Fin configuracion de Pantalla ------------------------------------------------------------------------------------------------
        
    }
}
