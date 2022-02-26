package pooej6;

import java.util.Locale;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Cafetera cafetera = new Cafetera(1000,250);  //ver el constructor para saber el orden de los atributos
        
        int alternativa;
        do {
            System.out.println("");
            System.out.println("Elija una opción:");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café");
            System.out.println("5. Salir del menú");
            alternativa = leer.nextInt();

            switch (alternativa) {
                case 1:
                    cafetera.llenarCafetera();
                    break;
                case 2:
                    System.out.println("Elija el tamaño de la taza:");
                    System.out.println("1. 200 c.c.");
                    System.out.println("2. 350 c.c.");
                    int opcion = leer.nextInt();
                    cafetera.servirTaza(opcion);
                    break;
                case 3:
                    cafetera.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("¿Cuánto café quiere agregar a la cafetera (en c.c.)?");
                    int masCafe = leer.nextInt();
                    cafetera.agregarCafe(masCafe);
                case 5:
                    break;
            }
        } while (alternativa != 5);
    }   
}
