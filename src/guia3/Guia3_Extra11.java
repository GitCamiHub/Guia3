/*Escribir un programa que lea un número entero y devuelva el número de 
dígitos que componen ese número. Por ejemplo, si introducimos el número 12345,
el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo 
entero truncan los números o resultados.*/
package guia3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia3_Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador=0;
        System.out.println("Ingrese un numero.");
        int num = leer.nextInt();
        do{
            num = num/10;
            contador+=1;
        }while (num>0);
        
        System.out.println("El numero tiene " + contador + " cifras.");
    }
    
}
