import java.util.Scanner;

/**
 * Escribir un programa para una empresa que tiene salas de juegos para todas
 * las edades y quiere calcular de forma automática el precio que debe cobrar a sus clientes por entrar.
 * El programa debe preguntar al usuario la edad del cliente y mostrar el precio de la entrada.
 * Si el cliente es menor de 4 años puede entrar gratis, si tiene entre 4
 * y 18 años debe pagar 10.000 COP y si es mayor de 18 años, 20.000 COP.
 */
public class condicionales6 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        if (edad <4){
            System.out.println("Usted puede ingresar gratis");
        } else if (edad >= 4 && edad <=18) {
            System.out.println("Usted debe pagar $10.000");

        } else {
            System.out.println("Usted debe pagar $20.000");
        }
        sc.close();
    }
}
