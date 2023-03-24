/*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento
en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos 
sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, 
y luego un valor real que represente el costo del tratamiento 
(previo al descuento) y determine el importe en efectivo a pagar por dicho socio. */
package guia3;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Guia3_Extra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion, costo;
        System.out.println("Ingrese el costo del tratamiento");
        costo = leer.nextInt();
        System.out.println("Ingrese una opcion.");
        System.out.println("1. Socio tipo A");
        System.out.println("2. Socio tipo B");
        System.out.println("3. Socio tipo C");
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Importe a pagar: $" + costo*0.5);
                break;
            case 2:
                System.out.println("Importe a pagar: $" + costo*0.35);
                break;
            case 3:
                System.out.println("El importe a pagar es el mismo: $" + costo);
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
        }
    }

}
