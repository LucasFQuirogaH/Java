package Logica;

public class Auto extends Vehiculo {
    
    //Atributos
    private int cantidadDeAsientos;
    private int cantidadDePuertas;
    
    //Constructores
    public Auto() {
    }
    public Auto(String idVehiculo, String patente, int cantidadDeRuedas, boolean seguro) {
        super(idVehiculo, patente, cantidadDeRuedas, seguro);
    }
    
    // Getters & Setters
    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }
    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }
    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }
    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }
    
    //To String
    @Override
    public String toString() {
        return "Auto{" + "cantidadDeAsientos=" + cantidadDeAsientos + ", cantidadDePuertas=" + cantidadDePuertas + '}';
    }
}
