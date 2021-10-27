package Logica;

public class Arbol extends Planta {

    // Atributos
    private String variedad;
    private String tipoDeTronco;
    private double radioDeTronco;
    private String color;
    private String tipoDeHojas;

    // Constructores
    public Arbol() {
    }
    public Arbol(String variedad, String tipoDeTronco, double radioDeTronco, String color, String tipoDeHojas, String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioDeTronco = radioDeTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }
    
    // Getters & Setters
    public String getVariedad() {
        return variedad;
    }
    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }
    public String getTipoDeTronco() {
        return tipoDeTronco;
    }
    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }
    public double getRadioDeTronco() {
        return radioDeTronco;
    }
    public void setRadioDeTronco(double radioDeTronco) {
        this.radioDeTronco = radioDeTronco;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTipoDeHojas() {
        return tipoDeHojas;
    }
    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }
    
    // To String
    @Override
    public String toString() {
        return "Arbol{" + "variedad=" + variedad + ", tipoDeTronco=" + tipoDeTronco + ", radioDeTronco=" + radioDeTronco + ", color=" + color + ", tipoDeHojas=" + tipoDeHojas + '}';
    }
    
    // Metodos comunes
    public void arbolito(){
        System.out.println("Soy un arbol");
    }
}
