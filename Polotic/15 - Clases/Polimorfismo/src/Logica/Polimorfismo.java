package Logica;

public class Polimorfismo {

    public static void main(String[] args) {
        
        Auto aut1 = new Auto();
        Colectivo colec1 = new Colectivo();
        Moto mot1 = new Moto();
        //------------------------------------------------------------------------------------------------------------------------------------------
        Vehiculo vector[] = new Vehiculo[5];
        //------------------------------------------------------------------------------------------------------------------------------------------
        vector[0] = aut1;
        vector[1] = colec1;
        vector[2] = mot1;
    }
    
}
