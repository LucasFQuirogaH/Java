package Logica;

public class Vehiculo {
    
    //Atributos
    private String idVehiculo;
    private String patente;
    private int cantidadDeRuedas;
    private boolean seguro;
    
    //Constructor
    public Vehiculo() {
    }
    public Vehiculo(String idVehiculo, String patente, int cantidadDeRuedas, boolean seguro) {
        this.idVehiculo = idVehiculo;
        this.patente = patente;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.seguro = seguro;
    }
    
    //Getters & Setters
    public String getIdVehiculo() {
        return idVehiculo;
    }
    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }
    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }
    public boolean isSeguro() {
        return seguro;
    }
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }
    
    //To String
    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", patente=" + patente + ", cantidadDeRuedas=" + cantidadDeRuedas + ", seguro=" + seguro + '}';
    }
}
