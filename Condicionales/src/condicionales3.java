/**
 * Escribir un programa que pida al usuario un número entero y
 * muestre por pantalla si es par o impar.

 */

import java.util.Scanner;

public class condicionales3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numero = sc.nextInt();

        if (numero % 2==0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        sc.close();
    }
}
