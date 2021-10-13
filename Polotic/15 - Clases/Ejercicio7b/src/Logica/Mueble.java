/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author lucquifer
 */
public class Mueble {

    // Atributos -------------------------------------------------------------------------------------------------------------------------------
    public String nombre;
    public double alto;
    public double ancho;
    public String material;
    public double cantidad;

// Constructores ---------------------------------------------------------------------------------------------------------------------------
    public Mueble(String nombre, double alto, double ancho, String material, double cantidad) {
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        this.cantidad = cantidad;
    }

    //Getters & Setters --------------------------------------------------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCalidad() {
        return cantidad;
    }

    public void setCalidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //To String -------------------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Mueble{" + "nombre=" + nombre + ", alto=" + alto + ", ancho=" + ancho + ", material=" + material + ", cantidad=" + cantidad + '}';
    }

}
