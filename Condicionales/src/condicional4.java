import java.util.Scanner;

/**
 * Para tributar un determinado impuesto se debe ser mayor de 14 años y
 * tener unos ingresos iguales o superiores a 65.891.000 COP al año. Escribir un programa que pregunte al
 * usuario su edad y sus ingresos mensuales y muestre por pantalla si el usuario tiene que tributar o no.
 */
public class condicional4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("Digite sus ingresos anuales: ");
        double ingresos = sc.nextDouble();

        if (edad >=14 && ingresos >=65891000){
            System.out.println("Usted debe declarar renta");
        } else {
            System.out.println("Usted no debe declarar renta");
        }
        sc.close();
    }
}
