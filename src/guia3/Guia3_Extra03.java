/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte 
si se trata de una vocal. Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String. */
package guia3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia3_Extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Escriba una letra para ver si se trata de una vocal.");
        letra = leer.next();
        
        if(letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")){
            System.out.println("La letra " + letra + " es una vocal.");
        }else{
            System.out.println("La letra " + letra + " no es una vocal.");
        }
    }
    
}
