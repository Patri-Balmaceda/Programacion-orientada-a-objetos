/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package pooej4;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {
   
    private int base;
    private int altura;
    
    public Rectangulo(){    
    }
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    } 
      
    public void setBase(int base){
        this.base = base;
    }
    
    public int getBase(){
        return base;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la base y la altura del rectángulo");
        base = leer.nextInt();
        altura = leer.nextInt();
    }
    
    public void calcularSuperficie(){ //void porque solo pide calcular la sup, no pide devolver/retornar el resultado
        System.out.println("La superficie del rectángulo es: " + this.base * this.altura);
    }
    
    public void calcularPerimetro(){
        System.out.println("El perímetro es: " + (this.base + this.altura) *2);
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i < this.base; i++) {
            for (int j = 0; j < this.altura; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }    
    }
}
