import java.util.Scanner;

public class AreaPerimetroVolumen {
    public static final double PI = 3.14159;
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);

        int opcion;
        double radio, area, base, altura, perimetro, largo, ancho, profundidad, volumen,
                vol_inicial, vol_final, vol_solido;


do {
    System.out.println("--- MENÚ DE CÁLCULOS GEOMÉTRICOS ---");
    System.out.println("1. Área de Círculo (Jardín de Eventos)");
    System.out.println("2. Perímetro de Rectángulo (Cerramiento Granja)");
    System.out.println("3. Volumen de Prisma (Alberca de Natación)");
    System.out.println( "4. Volumen de Sólido Irregular (Piedra - Arquímedes)");
    System.out.println("5. Salir");
    opcion = sc.nextInt();

    switch (opcion){
        case 1:
            System.out.println("Problema: Una empresa de eventos necesita calcular cuánto césped sintético debe comprar para cubrir" +
                    "un salón circular que tiene un diámetro de 12 metros.");

            System.out.println("\nIngrese el radio del circulo");
            radio = sc.nextDouble();
            double elevado = Math.pow(radio, 2);
            area = PI * (elevado);

            System.out.println("El área total de césped sintético es: "+ area + " metros cuadrados.");
            break;

        case 2:
            System.out.println("Problema: Un granjero quiere rodear un terreno rectangular con una" +
                            " malla de seguridad. El terreno mide 25 metros de largo y 15 metros de ancho. " +
                            "¿Cuántos metros de malla debe comprar?");

            System.out.println("\n Ingrese el largo de la base");
            base=sc.nextDouble();

            System.out.println("\nIngrese la altura de la base");
            altura=sc.nextDouble();

            perimetro=2*(base+altura);

            System.out.println("La cantidad de malla de seguridad necesaria es: "+ perimetro + " metros lineales.");
            break;

        case 3:
            System.out.println("Problema: Se desea construir una piscina con forma de prisma rectangular (ortoedro). " +
                    "Las dimensiones son 10 metros de largo, 5 metros de ancho y 2 metros de profundidad. " +
                    "¿Cuántos metros cúbicos de agua se necesitan para llenarla?");

            System.out.println("Ingrese el largo");
            largo = sc.nextDouble();

            System.out.println("Ingrese el ancho");
            ancho = sc.nextDouble();

            System.out.println("Ingrese la produndidad");
            profundidad = sc.nextDouble();

            volumen= largo*ancho*profundidad;
            System.out.println("El volumen total de agua necesario es: "+ volumen + " metros cúbicos.");

            break;

        case 4:
            System.out.println("Un estudiante de geología quiere hallar el volumen de una piedra de forma caprichosa. " +
                            "Para ello, utiliza una probeta graduada con 500 ml de agua. Al introducir la piedra, " +
                            "el nivel del agua sube hasta los 635 ml. ¿Cuál es el volumen de la piedra?");

            System.out.println("\nIngrese el volumen inicial de agua en la probeta (ml):");
            vol_inicial = sc.nextDouble();

            System.out.println("\nIngrese el volumen final tras introducir el objeto (ml):");
            vol_final = sc.nextDouble();

            vol_solido = vol_final - vol_inicial;

            System.out.println("El volumen del sólido (piedra) es: " + vol_solido +" ml (o cm³).");
    }
} while (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4 &&opcion!=5);





    }
}
