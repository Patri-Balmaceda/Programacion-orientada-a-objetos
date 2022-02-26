/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales()
• Método invertirFrase()
• Método vecesRepetido(String letra)
• Método compararLongitud(String frase)
• Método unirFrases(String frase)
• Método reemplazar(String letra)
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package pooej8;

public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
    frase ingresada.  */
    public void mostrarVocales() {
        int contVocales = 0;
        for (int i = 0; i < this.longitud; i++) {
            if ((this.frase.toLowerCase().charAt(i)) == 'a' || this.frase.toLowerCase().charAt(i) == 'e' || this.frase.toLowerCase().charAt(i) == 'i'
                    || this.frase.toLowerCase().charAt(i) == 'o' || this.frase.toLowerCase().charAt(i) == 'u' || this.frase.toLowerCase().charAt(i) == 'á'
                    || this.frase.toLowerCase().charAt(i) == 'é' || this.frase.toLowerCase().charAt(i) == 'í' || this.frase.toLowerCase().charAt(i) == 'ó'
                    || this.frase.toLowerCase().charAt(i) == 'ú') {
                contVocales++;
            }
        }
        System.out.printf("Se encontraron %d vocales\n", contVocales);
    }

    /*  Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". */
    public void invertirFrase() {
        String nuevaFrase = "";
        for (int i = 0; i < this.longitud; i++) {
            char letra = frase.charAt(i);
            nuevaFrase = letra + nuevaFrase;
        }
        System.out.println("la frase invertida es: " + nuevaFrase);
    }

    /* Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
    y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.  */
    public void vecesRepetido(String letra) {
        int contRepeticiones = 0;
        for (int i = 0; i < this.longitud; i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                contRepeticiones++;
            }
        }
        System.out.printf("El caracter buscado se encontró %d veces \n", contRepeticiones);
    }

    /* Método compararLongitud(String frase2), deberá comparar la longitud de la frase
    que compone la clase con otra nueva frase ingresada por el usuario.  */
    public void compararLongitud(String frase2) {

        if (frase2.length() == this.longitud) {
            System.out.println("Ambas frases tienen la misma longitud.");
        } else {
            System.out.println("Las frases no tienen la misma longitud.");
        }
    }
        // CONCAT
    /* Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    con una nueva frase ingresada por el usuario y mostrar la frase resultante. */
    public void unirFrases(String frase3) {
        String unidas;
        unidas = this.frase.concat(frase3);
        System.out.println("Frases unidas: " + unidas);
    }
        // REPLACE
    /* Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro caracter seleccionado por el usuario y
    mostrar la frase resultante.  */
   public void reemplazarA(String caracter){
       String nueva;
       nueva= this.frase.replace("a", caracter);
       System.out.println("Ahora la frase es: " + nueva);
   }
        // CONTAINS
    /* Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.  */
    
    public boolean contieneLetra(String letra){
       return this.frase.contains(letra);
    }
}

