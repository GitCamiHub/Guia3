/*Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
su equivalente: 1 día, 2 horas.*/
package guia3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia3_Extra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double tiempo, horas,dias;
        System.out.println("Ingrese una medida de tiempo en minutos: ");
        tiempo = leer.nextDouble();
        
        dias = Math.floor((tiempo / 60)/24);
        horas =(tiempo / 60)%24;
        
        System.out.println("El equivalente es: " + dias + " dias, " + horas+ " horas.");
    }
    
}
