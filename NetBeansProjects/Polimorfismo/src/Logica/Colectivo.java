package Logica;

public class Colectivo extends Vehiculo{
    
    //Atributos
    private int cantidadDeAsientos;
    private boolean tieneMartillo;
    
    //Constructores
    public Colectivo() {
    }
    public Colectivo(String idVehiculo, String patente, int cantidadDeRuedas, boolean seguro) {
        super(idVehiculo, patente, cantidadDeRuedas, seguro);
    }
    
    //Getters & Setters
    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }
    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }
    public boolean isTieneMartillo() {
        return tieneMartillo;
    }
    public void setTieneMartillo(boolean tieneMartillo) {
        this.tieneMartillo = tieneMartillo;
    }
}
