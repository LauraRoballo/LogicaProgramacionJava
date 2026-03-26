import java.util.Scanner;

/*
Crea un programa que calcule el total a pagar de un cliente.
Entrada: Pide al usuario el tipo de producto ("bebida" o "comida") y el precio total de su compra.

Condición 1 (Comida): Si la comida supera los $50.000, aplica un 10% de descuento. Si no, no hay descuento.

Condición 2 (Bebida): Si la bebida es fría (pregunta al usuario) y cuesta más de $20.000, aplica un 5% de descuento.

Salida: Muestra el precio final.
💡
 */

public class condicional11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int bebida;
        double precio;

        System.out.println("----CAFETERIA----");

        do {
            System.out.println("\nElija un producto");
            System.out.println("1. Bebida");
            System.out.println("2. Comida");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Ingrese el precio de la bebida:");
                    precio = sc.nextDouble();

                    do {
                        System.out.println("1. Bebida fría");
                        System.out.println("2. Bebida caliente");
                        bebida = sc.nextInt();

                        if (bebida == 1 && precio > 20000){
                            precio = precio * 0.95;
                            System.out.println("Tiene 5% de descuento");
                        }

                        System.out.println("Total a pagar: " + precio);

                    } while (bebida != 1 && bebida != 2);

                    break;

                case 2:
                    System.out.println("Ingrese el precio de la comida:");
                    precio = sc.nextDouble();

                    if (precio > 50000){
                        precio = precio * 0.90;
                        System.out.println("Tiene 10% de descuento");
                    }

                    System.out.println("Total a pagar: " + precio);
                    break;
            }

        } while (opcion != 3);
    }
}