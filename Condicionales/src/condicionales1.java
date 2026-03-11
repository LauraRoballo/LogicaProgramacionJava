/**
 * Escribir un programa que almacene la cadena de caracteres contraseña en una variable, pregunte al
 * usuario por la contraseña e imprima por pantalla si la contraseña introducida
 * por el usuario coincide con la guardada en la variable sin tener en cuenta mayúsculas y minúsculas.
 */

import java.util.Scanner;

public class condicionales1 {

        public static void main( String[] args){
            Scanner sc = new Scanner(System.in);

            String definida = "Hola123";
            System.out.println("Ingrese una contraseña: ");
            String contrasena = sc.nextLine();

            if (contrasena.equalsIgnoreCase(definida)){
                System.out.println("La contraseña es correcta");
            } else {
                System.out.println("La contraseña no es correcta");
            }

        }
    }

