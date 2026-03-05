/*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 */

public class EstructuraOperadores {

    public static void main(String[] args) {

        int numeroUno = 40, numeroDos = 30;

        System.out.println("\n---Operadores de aritmeticos---\n");
        //aritmeticas
        System.out.println("El resultado de la suma es: " + (numeroUno + numeroDos));
        System.out.println("El resultado de la resta es: " + (numeroUno - numeroDos));
        System.out.println("El resultado de la multiplicación es: " + (numeroUno * numeroDos));
        System.out.println("El resultado de la división es: " + (numeroUno / numeroDos));
        System.out.println("El resultado del modulo es: " + (numeroUno % numeroDos));

        System.out.println("\n---Operadores de logicos---\n");
        // operadores logicos
        boolean T = true, F = false;

        System.out.println("Operador logico && Y " + (T && F));
        System.out.println("Operador logico || O " + (T || F));
        System.out.println("Operador logico !NOT " + (!T));

        int numUno = 15, numDos = 28;

        System.out.println("\n---Operadores de relación ---\n");
        // operadores relacionales
        System.out.println("El resultado de 40 > (mayor) 30 es: " + (numUno > numDos));
        System.out.println("El resultado de 40 < (menor) 30 es: " + (numUno < numDos));
        System.out.println("El resultado de 40 == (igual) 30 es: " + (numUno == numDos));
        System.out.println("El resultado de 40 != (desigualdad) 30 es: " + (numUno != numDos));
        System.out.println("El resultado de 40 >= (mayor igual) 30 es: " + (numUno >= numDos));
        System.out.println("El resultado de 40 <= (menor igual) 30 es: " + (numUno <= numDos));

        //asignacion simple
        System.out.println("\n---Operadores de asignación ---\n");
        int a = 10;
        System.out.println("Asignación Simple: " + a);
        System.out.println("Asignación de suma +5: " + (a += 5));
        System.out.println("Asignación de resta -3: " + (a -= 3));
        System.out.println("Asignación de multiplicación *8: " + (a *= 8));
        System.out.println("Asignación de división /2: " + (a /= 2));
        System.out.println("Asignación de modulo % 5: " + (a %= 7));

        // unarios
        System.out.println("\n---Operadores unarios---\n");
        int unario = 15;
        System.out.println("Valor inicial: " + unario);
        System.out.println("Despues del incremento (++): " + unario++);
        System.out.println("Despues del decremento (--): " + unario--);
        System.out.println("Negación de valor: " + (-unario)); // se espera que imprima -15

        // bits
/*
Trabajan con número convertido a binario (0 y 1)
& (AND): Solo da 1 si ambos son 1.

| (OR): Da 1 si cualquiera es 1.

^ (XOR): Da 1 si son diferentes.

~ (NOT): Invierte todos los bits.
 */
        System.out.println("\n---Operadores de con BITS---\n");
        int bit1 = 5;
        int bit2 = 3;

        System.out.println("Bitwise AND (5 & 3): " + (bit1 & bit2));
        System.out.println("Bitwise OR (5 | 3): " + (bit1 | bit2));
        System.out.println("Bitwise XOR (5 ^ 3): " + (bit1 ^ bit2));
        System.out.println("Bitwise NOT (): " + (~bit1));

// usando integer.toBinaryString
        System.out.println("\nBinario de 5: " + Integer.toBinaryString(bit1));
        System.out.println("Binario de 3: " + Integer.toBinaryString(bit2));
        System.out.println("Resultado de XOR 5 ^ 3: " + (bit1 ^ bit2) + " |Binario: " + Integer.toBinaryString(bit1 ^ bit2));
        System.out.println("Resultado de ~ 5: " + (~bit1) + " |Binario: " + Integer.toBinaryString(~bit1));

        int resultadoAnd = bit1 & bit2, resultadoOR = bit1 | bit2;
        System.out.println("\nResultado de 5 & 3: " + resultadoAnd);
        System.out.println("Resultado de 5 | 3: " + resultadoOR);

// desplazamiento

        /*
        << Izquierda: Desplaza a la izquierda, equivale multiplicar por 2 cada
        posicion.

        >> Derecha: Desplaza a la derecha con signo. Equivale dividir por 2 hacia abajo
        >>> Derecha SIN signo: Desplaza a la derecha pero siempre llena con ceros a la izquierda. Se usa mucho
        para números negativos cuando no se quiere mantener el signo

         */
        System.out.println("\n---Operadores de desplazamiento (Bits)---\n");
        int n = 8;

        System.out.println("Número 8 convertido a binario: " + Integer.toBinaryString(n));

        int izquierda = n << 1;
        System.out.println("8 << 1: "+izquierda + "| Binario: "+Integer.toBinaryString(izquierda));

        int derecha = n >> 1;
        System.out.println("8 >> 1: "+derecha + "| Binario: "+Integer.toBinaryString(derecha));

        // Caso especial: Desplazamiento sin signo con negativo
        int neg = -8;
        System.out.println("-8 en binario: "+Integer.toBinaryString(neg));
        System.out.println("-8 >>> 1: "+ (neg >>> 1)+ " | Binario: "+Integer.toBinaryString(neg >>>1));

        // Operador de identidad

        /*
        Comparadores de identidad == y !=

        En objetos == compara la direccion de memoria, es decir compara si
        dos nombres etiquetas son para el mimso y unico objeto
         */
        System.out.println("\n---Operadores de identidad---\n");

        String nombre1 =  "Java";
        String nombre2 =  "Java";

        System.out.println(nombre1 == nombre2); //false (son objetos distintos en memoria)
        System.out.println(nombre1.equals(nombre2)); // equals s un detector de ¿Qué información tienes dentro?

        System.out.println("\n---Operadores de pertenencia (instanceof)---\n");

        Object miVaria = "Operadores de pertenencia";
        if (miVaria instanceof String){
            System.out.println("Es un texto");
        }
        if (miVaria instanceof  Integer){ // no se ejecuta ya que miVaria es texto
            System.out.println("Es un numero entero");
        }

        Object valor = 100;
        System.out.println("\n¿valor es un numero? " + (valor instanceof Integer)); // true
        System.out.println("¿valor es un texto? " + (valor instanceof String));  // false

        // Condicionales, iterativas, excepciones

        //  * DIFICULTAD EXTRA

        System.out.println("\n---Ejercicio extra---\n");

        for (int i =10; i<=50; i++){
            if(i%2==0 && i!=16 && i%3!=0){
                System.out.println(i);
            }
        }



    }

}
