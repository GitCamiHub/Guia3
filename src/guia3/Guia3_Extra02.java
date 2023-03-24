/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D 
y D tome el valor de B. Mostrar los valores iniciales y los valores finales
de cada variable. Utilizar sólo una variable auxiliar.*/
package guia3;

/**
 *
 * @author BANGHO
 */
public class Guia3_Extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 4;
        int B = 7;
        int C = 2;
        int D = 11;
        System.out.println("Valores iniciales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
        int aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
        
        System.out.println("Valores finales:");
        System.out.println("A = D = " + A);
        System.out.println("B = C = " + B);
        System.out.println("C = A = " + C);
        System.out.println("D = B = " + D);   
        
    }
    
}
