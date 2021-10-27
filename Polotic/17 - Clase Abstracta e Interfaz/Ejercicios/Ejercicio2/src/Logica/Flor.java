package Logica;

public class Flor extends Planta{

    // Atributos
    private String olorDePetalos;
    private int cantidad;
    private double promedioDePetalos;
    private String colorDelPistilo;
    private String colorDeLosPetalos;
    private String variedadDeFlor;
    private String estacionQueFlorece;
    
    // Constructor
    public Flor() {
    }
    public Flor(String olorDePetalos, int cantidad, double promedioDePetalos, String colorDelPistilo, String colorDeLosPetalos, String variedadDeFlor, String estacionQueFlorece, String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.olorDePetalos = olorDePetalos;
        this.cantidad = cantidad;
        this.promedioDePetalos = promedioDePetalos;
        this.colorDelPistilo = colorDelPistilo;
        this.colorDeLosPetalos = colorDeLosPetalos;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }
    
    //Getters & Setters

    public String getOlorDePetalos() {
        return olorDePetalos;
    }
    public void setOlorDePetalos(String olorDePetalos) {
        this.olorDePetalos = olorDePetalos;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPromedioDePetalos() {
        return promedioDePetalos;
    }
    public void setPromedioDePetalos(double promedioDePetalos) {
        this.promedioDePetalos = promedioDePetalos;
    }
    public String getColorDelPistilo() {
        return colorDelPistilo;
    }
    public void setColorDelPistilo(String colorDelPistilo) {
        this.colorDelPistilo = colorDelPistilo;
    }
    public String getColorDeLosPetalos() {
        return colorDeLosPetalos;
    }
    public void setColorDeLosPetalos(String colorDeLosPetalos) {
        this.colorDeLosPetalos = colorDeLosPetalos;
    }
    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }
    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }
    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }
    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }
    
    // To String
    @Override
    public String toString() {
        return "Flor{" + "olorDePetalos=" + olorDePetalos + ", cantidad=" + cantidad + ", promedioDePetalos=" + promedioDePetalos + ", colorDelPistilo=" + colorDelPistilo + ", colorDeLosPetalos=" + colorDeLosPetalos + ", variedadDeFlor=" + variedadDeFlor + ", estacionQueFlorece=" + estacionQueFlorece + '}';
    }
    
    // Metodos comunes
    public void florcita(){
        System.out.println("Soy una flor");
    }

}
