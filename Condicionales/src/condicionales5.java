
import java.util.Scanner;

/**
 * Los alumnos de un curso se han dividido en dos grupos A y B
 * de acuerdo al sexo y el nombre. El grupo A esta formado por las mujeres
 * con un nombre anterior a la M y los hombres con un nombre posterior a la N
 * y el grupo B por el resto. Escribir un programa que pregunte al usuario su nombre y sexo,
 * y muestre por pantalla el grupo que le corresponde.
 */
public class condicionales5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su sexo (F/M): ");
        String sexo = sc.nextLine();

char inicial =nombre.toUpperCase().charAt(0);

if ((sexo.equalsIgnoreCase("M") && inicial < 'M') ||
    (sexo.equalsIgnoreCase("F")&& inicial > 'N')) {
    System.out.println("Usted pertenece al grupo A");
} else {
    System.out.println("Usted pertecede al grupo B ");
}

sc.close();
    }
}
