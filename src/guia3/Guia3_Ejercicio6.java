/*Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción
y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.*/

package guia3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia3_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       Scanner leer = new Scanner(System.in);
       int num1, num2, opcion=0;
       double resultado;
       String salir="";
        System.out.println("Ingrese dos numeros enteros positivos.");
        System.out.println("Primer numero: ");
        num1 = leer.nextInt();
        System.out.println("Segundo numero: ");
        num2 = leer. nextInt();
     
        do{
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elegir opcion: ");
        opcion = leer.nextInt();  
        switch(opcion){
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado es: " + resultado);
                continue;
               
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado es: " + resultado);
               continue;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado es: " + resultado);
              continue;
            case 4:
                resultado = num1 / num2;
                System.out.println("El resultado es: " + resultado);
               continue;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                salir = leer.next();
                if(salir.equals("S")){
                    System.out.println("Saliendo.");
                }else if(salir.equals("N")){
                    System.out.println("Elija una opcion del menu");
                    opcion = leer.nextInt();
                }
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
                opcion = leer.nextInt();
                
        }
       
        }while (opcion!=5);
    }
}

