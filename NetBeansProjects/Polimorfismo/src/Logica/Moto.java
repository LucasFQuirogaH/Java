package Logica;

public class Moto extends Vehiculo {
    
    //Atributos
    private double cilindrada;
    private boolean haceRuidoElEscape;
    
    //Constructores
    public Moto() {
    }
    public Moto(String idVehiculo, String patente, int cantidadDeRuedas, boolean seguro) {
        super(idVehiculo, patente, cantidadDeRuedas, seguro);
    }
    
    //Getters & Setters
    public double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    public boolean isHaceRuidoElEscape() {
        return haceRuidoElEscape;
    }
    public void setHaceRuidoElEscape(boolean haceRuidoElEscape) {
        this.haceRuidoElEscape = haceRuidoElEscape;
    }
}
