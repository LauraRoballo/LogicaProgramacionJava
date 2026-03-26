/*
  EJERCICIO:
 - Crea un comentario en el código y coloca la URL del sitio web oficial del
   lenguaje de programación que has seleccionado.
 - Representa las diferentes sintaxis que existen de crear comentarios
   en el lenguaje (en una línea, varias...).
 - Crea una variable (y una constante si el lenguaje lo soporta).
 - Crea variables representando todos los tipos de datos primitivos
   del lenguaje (cadenas de texto, enteros, booleanos...).
 - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 */

public class VariablesSintaxis {
    /**
     * de esta forma podemos comentar clases, metodos
     */
    public static void main (String[] args){
        // https://www.java.com/es/

        /*
        esto es un comentario
        de varias lineas
         */

 // variables
        int ejVariable = 8;
  // constante
    final double VALOR_PI = 3.14;

    // tipo de datos primitivos

        int entero = 10;
        double decimal = 1.59;
        char caracter = 'A';
        String texto = "Hola";
        boolean verdaFal = true;

        System.out.println("Hola, estoy usando Java :)");

    }
}