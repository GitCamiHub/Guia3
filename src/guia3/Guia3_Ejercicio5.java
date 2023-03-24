/*Escriba un programa en el cual se ingrese un valor limite positivo,
y a continuacion solicite numeros al usuario hasta que la suma de los 
numeros introducidos supere el limite inicial.*/
package guia3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia3_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite, numeros, sumatoria=0;
        System.out.println("Ingrese un valor limite positivo.");
        limite = leer.nextInt();
        do {            
            System.out.println("Ingrese un numero");
            numeros = leer.nextInt();
            sumatoria+=numeros;
        } while (sumatoria<=limite);
        System.out.println("Se supero el limite inicial. La sumatoria es : "+ sumatoria);
    }
    
}
