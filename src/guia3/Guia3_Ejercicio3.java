/* Realizar un programa que permita introducir solo frases o palabras 
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se 
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java. */
package guia3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia3_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase.");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        
        if(frase.length()==8){
            System.out.println("CORRECTO");
                    }else{
            System.out.println("INCORRECTO");
        }
        
    }
    
}
