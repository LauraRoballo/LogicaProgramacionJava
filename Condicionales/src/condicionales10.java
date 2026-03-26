import java.util.Scanner;

public class condicionales10 {
    public static void main(String[] args){
        double sueldo =0;
        int categoria;
        Scanner sc = new Scanner(System.in);
System.out.println("Ingrese tipo de categoria");
 categoria = sc.nextInt();

 if (categoria==1){
     sueldo = 1453000 + (1453000*0.10);
 } else if (categoria==2) {
     sueldo = 2000000;
 } else if (categoria==3) {
     sueldo = 3500000 - (3500000*0.11);
 }
    else {
        System.out.println("Ingrese categoria valida");
 }
    if(categoria==1 || categoria==2 || categoria==3){

        System.out.println("El total del suelto para la categoria "+categoria +" es igual a "+sueldo);
    }

    sc.close();

    }
}
