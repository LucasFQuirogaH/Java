/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author lucquifer
 */
public class Consultor extends Persona {

    // Atributos -------------------------------------------------------------------------------------------------------------------------------
    private int idConsultor;
    private String Empresa;

    // Constructores ------------------------------------------------------------------------------------------------------------------------
    public Consultor() {
    }

    public Consultor(int idConsultor, String Empresa, int id_persona, String dni, String nombre, String apellido, String telefono) {
        super(id_persona, dni, nombre, apellido, telefono);
        this.idConsultor = idConsultor;
        this.Empresa = Empresa;
    }

    // Getters & Setters -------------------------------------------------------------------------------------------------------------------
    public int getIdConsultor() {
        return idConsultor;
    }

    public void setIdConsultor(int idConsultor) {
        this.idConsultor = idConsultor;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }
    
    // To string -------------------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Consultor{" + "idConsultor=" + idConsultor + ", Empresa=" + Empresa + '}';
    }
}
