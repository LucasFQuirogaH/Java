package Logica;

public class Persona {
    
// Atributos
    private int Id;
    private String nombre;
    private int edad;
    
    // Constructores
    public Persona() {
    }
    public Persona(int Id, String nombre, int edad) {
        this.Id = Id;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getters & Setters
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // To String
    @Override
    public String toString() {
        return "Persona{" + "Id=" + Id + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
}
