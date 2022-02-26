package pooej8;

import java.util.Locale;
import java.util.Scanner;

public class Main8 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena cadena = new Cadena();
        
        System.out.println("Ingrese una frase:");
        cadena.setFrase(leer.next()); //set para asignarle la frase que se ingrese por teclado
        cadena.setLongitud(cadena.getFrase().length());
        /* A través de los métodos set se guardará la frase y la longitud de manera
                                                            automática según la longitud de la frase ingresada*/
        cadena.mostrarVocales();
        cadena.invertirFrase();
        
        System.out.println("Ingrese una letra que quiera buscar en la frase:");
        String letra = leer.next();
        cadena.vecesRepetido(letra);
        
        System.out.println("Ingrese otra frase para comparar las longitudes:");
        String frase2 = leer.next();
        cadena.compararLongitud(frase2);
        
        System.out.println("Ingrese una nueva frase para unirla");
        String frase3 = leer.next();
        cadena.unirFrases(frase3);
        
        System.out.println("Ingrese un caracter que reemplace las letras 'a' de la frase");
        char caracter = leer.next().charAt(0);
        cadena.reemplazarA(frase3);
        
        System.out.println("Ingrese una letra para comprobar si está en la frase");
        cadena.contieneLetra(letra);
        
    }
    
}
