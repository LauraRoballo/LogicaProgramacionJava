
import java.util.ArrayList;
import java.util.Scanner;

/*
 * EJERCICIO:
 * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto
 *   en tu lenguaje.
 * - Utiliza operaciones de inserción, borrado, actualización y ordenación.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una agenda de contactos por terminal.
 * - Debes implementar funcionalidades de búsqueda, inserción, actualización
 *   y eliminación de contactos.
 * - Cada contacto debe tener un nombre y un número de teléfono.
 * - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
 *   y a continuación los datos necesarios para llevarla a cabo.
 * - El programa no puede dejar introducir números de teléfono no numéricos y con más
 *   de 11 dígitos (o el número de dígitos que quieras).
 * - También se debe proponer una operación de finalización del programa.
 */
public class EstructurasDeDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Estructuras soportadas---");
        // if: Pide un número y muestra si es positivo

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("El número es negativo");

        }
        // if else: Pide un número y muestra si es par o impar
        System.out.println("\nIngrese un número");
        int numero2 = sc.nextInt();

        if (numero2 % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    /* if -else if: Pide una nota (0 a 5) y muestra:
        //Mayor o igual a 4 → "Excelente"
        //Entre 3 y 3.9 → "Aprobado"
        //Menor a 3 → "Reprobado"

     */
        System.out.println("\nIngrese una nota de 0 a 5");
        double nota = sc.nextDouble();


        if (nota >= 4 && nota <= 5) {
            System.out.println("Excelente");
        } else if (nota >= 3 && nota <= 3.9) {
            System.out.println("Aprobado");

        } else {
            System.out.println("Reprobado");
        }

        /* Switch:
        Crea un menú:
        Sumar
        Restar
        Multiplicar

        Pide dos números y ejecuta la opción elegida.
         */
        System.out.println("\n--CALULADORA---");
        System.out.println("\nIngrese un número: ");
        int num1 = sc.nextInt();
        System.out.println("\nIngrese un número: ");
        int num2 = sc.nextInt();

        System.out.println("-----Elija una operación-----\n");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                int resultado = num1 + num2;
                System.out.println("El resultado de su suma es: " + resultado);
                break;
            case 2:
                int resultadoResta = num1 - num2;
                System.out.println("El resultado de su resta es: " + resultadoResta);
                break;
            case 3:
                int resultadoMulti = num1 * num2;
                System.out.println("El resultado de la multuplicación es" + resultadoMulti);
                break;
            default:
                System.out.println("La opción no es valida");
        }

        // for: Imprime los números del 1 al 10.
        System.out.println("\n---Números del 1 al 100 con for---");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        // While: Imprime los números del 10 al 1.
        System.out.println("\n---Números del 10 al 1 con while---");
        int cont = 10;
        while (cont >= 1) {
            System.out.println(cont);
            cont--;
        }
        // do while: Pide un número hasta que el usuario escriba 0.
        System.out.println("---Do-While---");
        int numero1;
        do {
            System.out.println("\nEscriba un número");
            numero1 = sc.nextInt();
        } while (numero1 != 0);

// Metodos

        System.out.println("\n---Metodo SIN retorno---");
        saludar();

        System.out.println("\n---Metodo CON retorno---");
        int resul = sumar(8, 2);
        System.out.println(resul);

        // Arreglos: Crea un arreglo con 5 nombres e imprímelos con un for
        System.out.println("\n--Arreglos--");
        String[] nombres = {"Laura", "Milena", "Juan", "Ana", "Sofia"};

        System.out.println("--- Lista de Nombres ---");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre " + (i + 1) + ": " + nombres[i]);
        }

        System.out.println("\n--Mezcla--");
        int[] arreglos = new int[5];
        for (int i = 0; i < arreglos.length; i++) {
            System.out.println("Ingrese un número: ");
            arreglos[i] = sc.nextInt();

        }
        int mayor = arreglos[0];
        for (int i = 1; i < arreglos.length; i++) {
            if (arreglos[i] > mayor) {
                mayor = arreglos[i]; // Actualizar la variable mayor
            }
        }
        System.out.println("El número mayor es: " + mayor);

        // ArrayList
        //crear lista
        ArrayList<Integer> numeros = new ArrayList<>();
        //Agregar
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        //Actualizacion NOTA: Recordar que el orden de la lista es 0,1,2

        numeros.set(2, 702);

        // acceder a un elemento que esta en la posicion del numero dentro del ()
        System.out.println(numeros.get(2));
        System.out.println(numeros);

        numeros.remove(1);
        System.out.println("Final "+ numeros);


    }

// Definir metodos

    public static void saludar(){
            System.out.println("Bienvenido al sistema");
        }
    public static int sumar (int a,int b){
        return a+b;
    }


}

