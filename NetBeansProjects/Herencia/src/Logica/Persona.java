/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author lucquifer
 */
public class Persona {
    
     //Atributos -------------------------------------------------------------------------------------------------------------------------------
    private int id_persona;
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    
    //Constructores -------------------------------------------------------------------------------------------------------------------------

    public Persona() {
    }
    public Persona(int id_persona, String dni, String nombre, String apellido, String telefono) {
        this.id_persona = id_persona;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    
    // Getters & Setters -------------------------------------------------------------------------------------------------------------------
    public int getId_persona() {
        return id_persona;
    }
    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // To String -------------------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Persona{" + "id_persona=" + id_persona + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + '}';
    }
}
