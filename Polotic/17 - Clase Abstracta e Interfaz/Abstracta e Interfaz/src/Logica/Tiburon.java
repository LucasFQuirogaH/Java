
package Logica;

public class Tiburon extends Animal implements Nadar{

    // Constructores
    public Tiburon() {
    }

    public Tiburon(String nombre, String especie) {
        super(nombre, especie);
    }

    // Metodos
    @Override
    public void soyAnimal() {
        System.out.println("Soy un tiburon");
    }

    @Override
    public void nadar() {
        System.out.println("Nado por debajo del agua");   
    }

    @Override
    public void respirarPorDebajoDelAgua() {
        System.out.println("Soy tiburon y respiro por debajo");
    }
    
}
