package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author lucquifer
 */
@Entity
public class Perro implements Serializable {

    // Atributos -------------------------------------------------------------------------------------------------------------------------------
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int num_cliente;
    @Basic
    private String nombre_perro;
    private String raza;
    private String color;
    private String alergico;
    private String atención_especial;
    private String nombre_duenio;
    private int celular_duenio;
    private String observaciones;

    // Constructores ------------------------------------------------------------------------------------------------------------------------
    public Perro() {
    }

    public Perro(int num_cliente, String nombre_perro, String raza, String color, String alergico, String atención_especial, String nombre_duenio, int celular_duenio, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atención_especial = atención_especial;
        this.nombre_duenio = nombre_duenio;
        this.celular_duenio = celular_duenio;
        this.observaciones = observaciones;
    }

    // Getters & Setters  ------------------------------------------------------------------------------------------------------------------
    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtención_especial() {
        return atención_especial;
    }

    public void setAtención_especial(String atención_especial) {
        this.atención_especial = atención_especial;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public int getCelular_duenio() {
        return celular_duenio;
    }

    public void setCelular_duenio(int celular_duenio) {
        this.celular_duenio = celular_duenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
