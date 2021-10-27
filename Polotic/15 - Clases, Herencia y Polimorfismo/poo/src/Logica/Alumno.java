/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author lucquifer
 */
public class Alumno {

    // Atributos -------------------------------------------------------------------------------------------------------------------------------
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    //---------------------------------------------------------------------------------------------------------------------------------------------
    // Metodos constructores
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //---------------------------------------------------------------------------------------------------------------------------------------------
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    // Metodos comunes

    // Procedimiento
    public void marcarPresente() {
        System.out.println("El alumno esta presente");
    }

    // Funcion
    public boolean detectarMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

}
