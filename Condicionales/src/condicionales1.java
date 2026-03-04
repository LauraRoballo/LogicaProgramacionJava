import java.util.Scanner;

public class condicionales1 {

        public static void main( String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("******* Condicionales *******");

            System.out.println("Digite un número");
            int numero = sc.nextInt();

            if (numero >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Usted no es mayor de edad");
            }

        }
    }

