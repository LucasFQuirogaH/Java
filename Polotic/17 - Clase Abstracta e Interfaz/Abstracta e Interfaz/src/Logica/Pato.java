package Logica;

public class Pato extends Animal implements Volador, Nadar {

    public Pato() {
    }

    public Pato(String nombre, String especie) {
        super(nombre, especie);
    }

    @Override
    public void soyAnimal() {
        System.out.println("Soy un pato!!");
    }

    // Interfaces
    @Override
    public void volar() {
        System.out.println("Estoy volando");
    }

    @Override
    public void nadar() {
        System.out.println("Nado por arriba del agua");
    }

    @Override
    public void respirarPorDebajoDelAgua() {
        System.out.println("Soy pato y respiro por debajo");
    }

}
