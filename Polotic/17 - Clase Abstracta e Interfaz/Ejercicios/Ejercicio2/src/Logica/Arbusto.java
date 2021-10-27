package Logica;

public class Arbusto extends Planta{

    // Atributos
    private double anchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorDeHojas;
    private boolean sePodaONo;
    
    //Constructores
    public Arbusto() {
    }
    public Arbusto(double anchoArbusto, boolean esDomestico, String variedadArbusto, String colorDeHojas, boolean sePodaONo, String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorDeHojas = colorDeHojas;
        this.sePodaONo = sePodaONo;
    }
    
    // Getters & Setters
    public double getAnchoArbusto() {
        return anchoArbusto;
    }
    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }
    public boolean isEsDomestico() {
        return esDomestico;
    }
    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }
    public String getVariedadArbusto() {
        return variedadArbusto;
    }
    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }
    public String getColorDeHojas() {
        return colorDeHojas;
    }
    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }
    public boolean isSePodaONo() {
        return sePodaONo;
    }
    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }
    
    // Metodos comunes
    public void arbustito(){
        System.out.println("Soy un arbusto");
    }
}
