/*
 * EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 *
 * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
 * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
 */


public class FuncionesAlcance {
   static String miVariableGlobal ="Bienvenidos";
   // Dentro del main llamamos los metodos
    public static void main(String[] args) {
        funcionSinArgumentos();
        funcionConArgumentos("Laura");
        funcionConArgumentos("Daniela", 20);
        System.out.println(funcionConRetorno());
        System.out.println(funcionConRetorno(20));
        miFuncion();
        miFuncion("Ana");

        // Vaiable local
        System.out.println("\nLa variable global principalmente es: "+ miVariableGlobal);
        FuncionesAlcance.miVariableGlobal = "Hola a todos ";
        System.out.println("El valor de la varibale global ahora es: " + miVariableGlobal+"\n");

        // funciones del lenguaje
        // String
        System.out.println(miVariableGlobal.length()); // Cuenta número de caracteres de la cadena de texto
        System.out.println(miVariableGlobal.toLowerCase());// Pone la cadena de texto en minusculas
        System.out.println(miVariableGlobal.toUpperCase());// Pone la cadena de texto en mayucula
        System.out.println(miVariableGlobal.trim());// Quita los espacion en blanco de ambos lados

        //EXTRA
        int counter = miFuncion("Fizz", "Buzz");
        System.out.println("El número de veces que no se ha impreso texto es: " + counter);

    }
    // Fuera del main definimos los metodos

      // funcion sin argumetos ni retonos
        public static void funcionSinArgumentos(){
            System.out.println("Esta funcion esta sin paramaetros y argumentos");

        }
        public static void funcionConArgumentos(String name){
            System.out.println("Hola me llamo "+name);
        }
        public static void  funcionConArgumentos(String name, int age){
            System.out.println("Hola me llamo "+name+" y tengo "+age+" años");
        }

        public static  String funcionConRetorno(){
            return "Función con retorno sin argumentos";
        }
        public static  boolean funcionConRetorno(int age){
            return age >=18;
        }

        // función dentro función
        public static void miFuncion(){
            String miVariableLocal = "\nHola Java";
            System.out.println("La variable global contiene: "+FuncionesAlcance.miVariableGlobal+"\nLa variable local contiene: "
                    +miVariableLocal);//La variable local no se puede utilizar fuera del ámbito de la funcion
            funcionSinArgumentos();
        }
        public static void miFuncion(String name){
            funcionConArgumentos(name);
        }

        public static int miFuncion(String param1, String param2){
            int contador = 0;

            for(int i=1; i <= 100; i++){
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(param1+ " "+param2);
                }
                else if(i % 3 == 0){
                    System.out.println(param1);
                } else if (i % 5 == 0) {
                    System.out.println(param2);
                } else {
                    System.out.println(i);
                    contador++;
                }
            }
            return contador;
    }

    }





