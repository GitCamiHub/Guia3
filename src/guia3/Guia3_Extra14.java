/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una
M cantidad de hijos. Escriba un programa que pida la cantidad de familias
y para cada familia la cantidad de hijos para averiguar la media de edad 
de los hijos de todas las familias.*/
package guia3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia3_Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familia, hijos, contador, edad, sumaEdad=0;
        double promedio=0;
        double promFinal;
        System.out.println("Ingrese cantidad de familias.");
        familia = leer.nextInt();
        System.out.println("Ingrese la cantidad de hijos por familia.");
        
        for (int i = 0; i < familia; i++) {
            sumaEdad=0;
            System.out.println("Cantidad de hijos familia " + (i+1));
            hijos = leer.nextInt();
            
            for (int j = 0; j < hijos; j++) {
               
                System.out.println("Edad hijo " + (j+1));
                edad = leer.nextInt();
                sumaEdad += edad;
            }
             promedio += (sumaEdad / hijos);
        }
        
       
       promFinal = promedio/familia;
        
        System.out.println("Promedio de edades de los hijos de todas las familias: " + promFinal);
        
    }
    
}
