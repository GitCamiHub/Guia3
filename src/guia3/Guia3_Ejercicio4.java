/*Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”.
Nota: investigar la funcion Substring y equals() de Java.*/

package guia3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia3_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase o palabra que empiece con 'A'.");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        
        if(frase.startsWith("A")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
