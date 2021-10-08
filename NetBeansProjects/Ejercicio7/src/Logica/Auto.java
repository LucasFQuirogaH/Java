/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author lucquifer
 */
public class Auto {
    // Atributos ------------------------------------------------------------------------------------------------------------------------------
    public String color;
    public String marca;
    public String modelo;
    public String patente;
    public int cantidadDePuertas;
    
    // Metodos constructores ------------------------------------------------------------------------------------------------------------
    public Auto() {
    }

    public Auto(String color, String marca, String modelo, String patente, int cantidadDePuertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.cantidadDePuertas = cantidadDePuertas;
    }
    // Metodos Getters y Setters -------------------------------------------------------------------------------------------------------

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }
    // Metodo toString --------------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Auto{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", cantidadDePuertas=" + cantidadDePuertas + '}';
    }
    
}
