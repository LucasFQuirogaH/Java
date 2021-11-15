/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Huesped;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucquifer
 */
public class ControladoraPersistencia {

    HuespedJpaController hueJPA = new HuespedJpaController();

    // Metodo para alta
    public void crearHuesped(Huesped hues) {
        try {
            hueJPA.create(hues);
        } catch (Exception e) {
            System.out.println("No se pudo crear el huesped");
        }
    }
    // Metodo para baja
    public void eliminarHuesped(Huesped hues) {
        try {
            hueJPA.destroy(hues.getId());
        } catch (NonexistentEntityException ex) {
            System.out.println("No se pudo eliminar el Huesped");
        }
    }
    // Otro metodo de la baja usando solo el id
    public void eliminarHuesped(int id) {
        try {
            hueJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.out.println("No se pudo eliminar el Huesped");
        }
    }
    
    // Metodo para la lectura ------------------------------------------------------------------------------------------------------------
    public List <Huesped> obtenerHuesped (){
       return hueJPA.findHuespedEntities();
    }

    // Metodo para modificacion 
    // Para casos donde no haya que cambiar el Id
    public void modificaHuesped(Huesped hues){
        try {
            hueJPA.edit(hues);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Metodo para buscar ----------------------------------------------------------------------------------------------------------------
    public Huesped buscarHuesped(Huesped hues){
        return hueJPA.findHuesped(hues.getId());
    }
    
    // Metodo para buscar
    public Huesped buscarHuesped(int id){
        return hueJPA.findHuesped(id);
    }
}