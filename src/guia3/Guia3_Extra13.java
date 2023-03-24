/*Crear un programa que dibuje una escalera de números, donde cada línea 
de números comience en uno y termine en el número de la línea. Solicitar 
la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa 
el número 3:
1
12
123*/
package guia3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia3_Extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in); 
      System.out.println("Ingrese la altura de la escalera.");
      int altura = leer.nextInt();
        System.out.println("Dibujando escalera...");
        for (int i = 0; i < altura; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
