/**
 * Escribir un programa que pida al usuario dos
 * números y muestre por pantalla su división.
 * Si el divisor es cero el programa debe mostrar un error.
 */
import java.util.Scanner;
public class condicionales2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un número");
        int numberOne = sc.nextInt();

        System.out.println("Escriba un número");
        int numberTwo = sc.nextInt();

        int result = numberOne/numberTwo;

        if (numberTwo == 0) {

         System.out.println("No se puede dividir en 0");

        } else {
         System.out.println("El resultado de la division es: "+result);
     }



    }
}
