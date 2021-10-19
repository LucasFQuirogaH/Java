package Logica;

public class Fruta {

    // Atributos
    private String nombre;
    private String color;
    private int calorías;
    private String tipoCascara;
    private boolean esComestible;
    
    // Constructores
    public Fruta() {
    }

    public Fruta(String nombre, String color, int calorías, String tipoCascara, boolean esComestible) {
        this.nombre = nombre;
        this.color = color;
        this.calorías = calorías;
        this.tipoCascara = tipoCascara;
        this.esComestible = esComestible;
    }
    
    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCalorías() {
        return calorías;
    }

    public void setCalorías(int calorías) {
        this.calorías = calorías;
    }

    public String getTipoCascara() {
        return tipoCascara;
    }

    public void setTipoCascara(String tipoCascara) {
        this.tipoCascara = tipoCascara;
    }

    public boolean isEsComestible() {
        return esComestible;
    }

    public void setEsComestible(boolean esComestible) {
        this.esComestible = esComestible;
    }
    
    // To String

    @Override
    public String toString() {
        return "Fruta{" + "nombre=" + nombre + ", color=" + color + ", calor\u00edas=" + calorías + ", tipoCascara=" + tipoCascara + ", esComestible=" + esComestible + '}';
    }
       
}
