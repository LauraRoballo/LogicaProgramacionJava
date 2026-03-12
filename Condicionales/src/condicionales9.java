import java.util.Scanner;
/*
Una asociación de vinicultores fija el precio del kilo de uva basándose en el tipo (A o B) y el tamaño (1 o 2).
Tipo A: Si el tamaño es 1, se suman $0.20 al precio inicial. Si el tamaño es 2, se suman $0.30.
Tipo B: Si el tamaño es 1, se rebajan $0.30 al precio inicial. Si el tamaño es 2, se rebajan $0.50.
Objetivo: Calcular el precio final por kilo.
 */
public class condicionales9 {
    public static void main(String[] args){
        System.out.println("----Precio del kilo de uvas---");
        Scanner sc= new Scanner(System.in);

        double valorUvaA = 8000;
        double valorUvaB = 5000;

        System.out.println("Ingrese el tipo de uva (A/B)");
        char tipoUva =sc.next().charAt(0);

        System.out.println("Ingrese el tamaño de la uva (1/2)");
        int tamanoUva = sc.nextInt();

        // Tipo A
        if (Character.toUpperCase(tipoUva)=='A' && tamanoUva==1){
            double valorFinA1 = valorUvaA + 0.20;
            System.out.println("El valor del kilo es: "+valorFinA1);
        }
        else if (Character.toUpperCase(tipoUva)=='A' && tamanoUva==2){
            double valorFinA2 = valorUvaA + 0.30;
            System.out.println("El valor del kilo es: "+valorFinA2);
        }
        // tipo B

        if (Character.toUpperCase(tipoUva)=='B' && tamanoUva==1){
            double valorFinB1 = valorUvaB + 0.30;
            System.out.println("El valor del kilo es: "+valorFinB1);

        } else if (Character.toUpperCase(tipoUva)=='B' && tamanoUva==2){
            double valorFinB2 = valorUvaB + 0.50;
            System.out.println("El valor del kilo es: "+valorFinB2);
        }
        else {
            System.out.println("Ingrese tamaño y datos validos");
        }
    }
}
