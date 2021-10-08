/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author lucquifer
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia = 4;
        String nombreDia;
        switch (dia){
            case 1: nombreDia = "Lunes";
            break;
            case 2: nombreDia = "Martes";
            break;
            case 3: nombreDia = "Miercoles";
            break;
            case 4: nombreDia = "Jueves";
            break;
            case 5: nombreDia = "Viernes";
            break;
            case 6: nombreDia = "Sabado";
            break;
            case 7: nombreDia = "Domingo";
            break;
            default: nombreDia = "Dia invalido";
            break;
        }
        System.out.println(nombreDia);
    }
    
}
