/*

Eres el programador de una agencia de viajes espacial en el año 2150. Debes crear un programa
que calcule el costo de un seguro médico para turistas espaciales basándote en múltiples factores de riesgo.

** Reglas de Negocio (Tus condicionales) ***
El costo base del seguro es de $1000 créditos. Debes aplicar las siguientes reglas en orden:

Destino (Multiplicador de Riesgo):

Luna: Costo base ×1.2.

Marte: Costo base ×1.5.

Cinturón de Asteroides: Costo base ×2.5.

Edad del Pasajero:

Si tiene menos de 18 años, se aplica un descuento del 10% sobre el total acumulado hasta ese momento.

Si tiene más de 60 años, se aplica un recargo del 20% por riesgo de salud en gravedad cero.

Condición Médica Preexistente:

Si el pasajero tiene condiciones previas (ej. diabetes, asma), se suma un recargo fijo de $500 créditos.

Duración del Viaje:

Si el viaje dura más de 30 días, suma $10 créditos extra por cada día adicional (a partir del día 31).

Regla Especial de Seguridad:

IMPORTANTE: Si el pasajero es mayor de 80 años Y el destino es el Cinturón de Asteroides,
el seguro debe ser DENEGADO (imprime un mensaje de error y no calcules el precio).
 */

import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        System.out.println("---Seguro espacial---");
        Scanner sc = new Scanner(System.in);

        // Valor fijo del seguro
        double valorFijo = 1000;

// Preguntar destino

        System.out.println("¿Cúal es su destino? (Ingrese el número de la opción) ");
        System.out.println("\n1. Luna");
        System.out.println("\n2. Marte");
        System.out.println("\n3. Cinturon de Asteroides");
        int destino = sc.nextInt();
// Condiciones destino
        if (destino == 1) {
            valorFijo *= 1.2;
        } else if (destino == 2) {
            valorFijo *= 1.5;
        } else if (destino == 3) {
            valorFijo *= 2.5;
        } else{
            System.out.println("Ingrese un destino valido");
            return;
        }
// edad
        System.out.println("\nIngrese su edad: ");
        int edad = sc.nextInt();

        //condicion de seguridad
        if(edad>80 && destino==3){
            System.out.println("El seguro fue DENEGADO");
            return;
        }
        // condiciones de edad, se toma el valor que se calculo en condiciones de destino
        if(edad<18){
            valorFijo = valorFijo - (valorFijo*0.10);
        } else if (edad >60){
            valorFijo = valorFijo + (valorFijo*0.20);
        }else {
            System.out.println("\nSu edad está en el rango. No hay cambios en el costo.");
        }


        // condiciones especiales (Diabetes, asma, hipertensión y vertigo)

        System.out.println("¿Tiene alguna de las siguientes condiciones especiales? (true/false)");
        System.out.println("\nDiabetes - Asma - Hipertensión - Vertigo");
        boolean condicionEspecial = sc.nextBoolean();
        // condiciones de alguna condición medica especial
        if(condicionEspecial){
            valorFijo +=500;
        } else {
            System.out.println("No presenta ninguna condición no se le suma algún valor adicional a su seguro");
        }

// duración del viaje
        System.out.println("\n ¿Cuántos días durará el viaje?");
        int dias = sc.nextInt();
        // duración de viaje
        if(dias > 30){
            int  diasExtras = dias - 30;
            diasExtras *=10;
            valorFijo +=diasExtras;

        } else{
            System.out.println("\nSu viaje no supera los 30 días por lo que no se agrega un valor adicional");
        }


        System.out.println("\nEl valor de su viaje con destino "+ destino +" duración de "+dias +" días, tiene un valor de "+valorFijo);

        sc.close();
    }
}