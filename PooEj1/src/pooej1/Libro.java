/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas
 */
package pooej1;

import java.util.Locale;
import java.util.Scanner;

public class Libro {
    //atributos de instancia o del objeto
    private int Isbn;
    private String titulo;
    private String autor;
    private int nroDePaginas;
    
    //constructor parametrizado
    public Libro (int Isbn, String titulo, String autor, int nroDePaginas){
        this.Isbn = Isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroDePaginas = nroDePaginas;
    }
    
    //constructor vacío
    public Libro (){           
    }
    
    //SET para asignar un valor al atributo del objeto
    public void setIsbn(int Isbn){
        this.Isbn = Isbn;
    }
    
    //GET para obtener el valor del atributo
    public int getIsbn (){
        return Isbn;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo (){
        return titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getAutor(){
        return autor;
    }
    public void setNroDePaginas (int nroDePaginas){
        this.nroDePaginas = nroDePaginas;
    }
    
    public int getNroDePaginas (){
        return nroDePaginas;
    }
    
    //cada método realiza 1 sola acción
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el número de ISBN");
        Isbn = leer.nextInt();
        System.out.println("Ingrese el título del libro");
        titulo = leer.next();
        System.out.println("Ingrese el autor");
        autor = leer.next();
        System.out.println("Ingrese la cantidad de páginas");
        nroDePaginas= leer.nextInt();
    }
    //método para informar los datos del libro
    public void mostrarLibro(){
        System.out.printf("El número de ISBN del libro es: %d\n", Isbn);
        System.out.printf("El título del libro es: %s\n", titulo);
        System.out.printf("El autor es: %s\n", autor);
        System.out.printf("El libro tiene %d paginas \n", nroDePaginas);
    }
}
