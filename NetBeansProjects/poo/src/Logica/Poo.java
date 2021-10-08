/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

/**
 *
 * @author lucquifer
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(14 , "Lucas" , "Quiroga" , 16);      
        
        alu1.marcarPresente();
        System.out.println("");
        System.out.println(alu2.detectarMayorDeEdad(20));
        
        //-----------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("");
        System.out.println("La id del alumno es :  " +  alu2.getId());
        System.out.println("El nombre es:  " +  alu2.getNombre());
        System.out.println("El apellido es  " +  alu2.getApellido());
        System.out.println("");
        System.out.println("Alumno Vacio");
        System.out.println("El id del alumno vacio es  " + alu1.getId());
        System.out.println("El nombre es:  " +  alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());
        // Le ponemos valores
        alu1.setId(876);
        alu1.setNombre("Juan");
        alu1.setApellido("Palomino");
        System.out.println("");
        System.out.println("El id del alumno vacio es  " + alu1.getId());
        System.out.println("El nombre es:  " +  alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(alu2.toString());
        //-----------------------------------------------------------------------------------------------------------------------------------------------
        
    }
}
