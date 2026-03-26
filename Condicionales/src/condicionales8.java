import java.util.Scanner;

/**
 * Escribe un programa que:

 * Pida tres números que representen los lados de un triángulo.

 * Determine qué tipo de triángulo es:

 * Los tres lados iguales	Equilátero
 * Dos lados iguales	Isósceles
 * Todos diferentes	Escaleno
 */
public class condicionales8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la medida del primer lado (entero): ");
        int ladoUno = sc.nextInt();

        System.out.println("Ingrese la medida del segundo lado (entero): ");
        int ladoDos = sc.nextInt();

        System.out.println("Ingrese la medida del tercer lado (entero): ");
        int ladoTres = sc.nextInt();

        if (ladoUno == ladoDos && ladoDos==ladoTres) {
            System.out.println("El triangulo es Equilatero");
        } else if (ladoUno == ladoDos || ladoUno == ladoTres || ladoDos == ladoTres) {
            System.out.println("El triangulo es Isósceles");
        } else {
            System.out.println("El triangulo es Escaleno");
        }
    }

}
