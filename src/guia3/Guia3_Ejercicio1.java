/*Crear un programa que dado un número determine si es par o impar.*/
package guia3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia3_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ingrese un numero");
       Scanner leer= new Scanner(System.in);
       int num = leer.nextInt();
       
        if (num%2==0) {
            System.out.println("Es un numero PAR.");
        }else{
            System.out.println("Es un numero IMPAR");
        }
    }
    
}
