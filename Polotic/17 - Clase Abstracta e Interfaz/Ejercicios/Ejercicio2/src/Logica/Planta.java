package Logica;

public class Planta {
    
    // Atributos
    private String nombre;
    private double altoDelTallo;
    private boolean tieneHojas;
    private String climaIdeal;
    
    // Contructores
    public Planta() {
    }
    public Planta(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoDelTallo = altoDelTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }
    
    // Getters & Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getAltoDelTallo() {
        return altoDelTallo;
    }
    public void setAltoDelTallo(double altoDelTallo) {
        this.altoDelTallo = altoDelTallo;
    }
    public boolean isTieneHojas() {
        return tieneHojas;
    }
    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }
    public String getClimaIdeal() {
        return climaIdeal;
    }
    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    
    // To String
    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", altoDelTallo=" + altoDelTallo + ", tieneHojas=" + tieneHojas + ", climaIdeal=" + climaIdeal + '}';
    }
}
