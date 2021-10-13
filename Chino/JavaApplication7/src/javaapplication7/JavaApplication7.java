package javaapplication7;

public class JavaApplication7 {

    public static void main(String[] args) {
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        System.out.println("");
        var frase = "Hola como estas";
        System.out.println("frase = " + frase);
        System.out.println("");
        int numeri = 'L';
        System.out.println("numeri = " + numeri);
        System.out.println("-----------------------------------------  Boolean -----------------------------------------");
        System.out.println("");
        var edad = 16;
        var esAdulto = edad > 18;
        if (esAdulto){
            System.out.println("Es mayor de edad");
        } else{
            System.out.println("Es menor");
        }
    }
    
}
