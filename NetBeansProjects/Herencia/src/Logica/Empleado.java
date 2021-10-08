/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.logging.Logger;

/**
 *
 * @author lucquifer
 */
public class Empleado extends Persona {

    // Atributos -------------------------------------------------------------------------------------------------------------------------------
    private int legajo;
    private String cargo;
    private double sueldo;

    //Constructores -------------------------------------------------------------------------------------------------------------------------
    public Empleado() {
    }

    public Empleado(int legajo, String cargo, double sueldo, int id_persona, String dni, String nombre, String apellido, String telefono) {
        super(id_persona, dni, nombre, apellido, telefono);
        this.legajo = legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    
    //Getters & Setters --------------------------------------------------------------------------------------------------------------------
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    // To String -------------------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Empleado{" + "legajo=" + legajo + ", cargo=" + cargo + ", sueldo=" + sueldo + '}';
    }
    
}
