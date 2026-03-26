import java.util.Scanner;

/**
 * La pizzería Bella Napoli ofrece pizzas vegetarianas y no vegetarianas a sus clientes.
 * Los ingredientes para cada tipo de pizza aparecen a continuación.

 * Ingredientes vegetarianos: Pimiento y tofu.

 * Ingredientes no vegetarianos: Peperoni, Jamón y Salmón.

 * Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no,
 * y en función de su respuesta le muestre un menú con los ingredientes disponibles para que elija.
 *Solo se puede eligir un ingrediente además de la mozzarella y el tomate que están en todas la pizzas.
 * Al final se debe mostrar por pantalla si la pizza elegida es vegetariana o no y todos los ingredientes
 * que lleva.
 */

public class condicionales7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Desea una pizza vegetariana (1. Si o 2. No) : ");
        int respuesta = sc.nextInt();


        if (respuesta ==1 ) {
            System.out.println("Los ingredientes dispinibles son: ");
            System.out.println("\n1. Pimiento");
            System.out.println("2. Tofu ");

            System.out.println("Elija un ingrediente: ");
            int ingrediente = sc.nextInt();

            if (ingrediente == 1) {
                System.out.println("Pizza vegetariana con mozzarella, tomate y pimiento");
            } else {
                System.out.println("Pizza vegetariana con mozzarella, tomate y tofu");
            }

        } else {
            System.out.println("Ingredientes no vegetarianos ");
            System.out.println("\n1. Peperoni");
            System.out.println("2. Jamón");
            System.out.println("3. Salmón");

            System.out.println("Elija un ingrediente: ");
            int ingrediente =sc.nextInt();

            if (ingrediente == 1) {
                System.out.println("Pizza no vegetariana con mozzarella, tomate y peperoni");
            } else if (ingrediente == 2) {
                System.out.println("Pizza no vegetariana con mozzarella, tomate y jamón");
            } else {
                System.out.println("Pizza no vegetariana con mozzarella, tomate y salmón");
            }
        }

        sc.close();
    }
}
