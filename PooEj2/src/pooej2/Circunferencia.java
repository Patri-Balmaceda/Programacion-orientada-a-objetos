/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2)
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package pooej2;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {
    
    //atributo de instancia
    private double radio;
    
    //constructor parametrizado
    public Circunferencia(double radio){
        this.radio = radio;
    }
    
    //b) Métodos get y set para el atributo radio de la clase Circunferencia.
    public void setradio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el radio para hacer el cálculo");
        this.radio = leer.nextDouble();
    }
    
    public void calcularArea() { //void porque no pide que retorne el resultado de la fórmula
        System.out.printf("el área del círculo es: %.2f\n", Math.PI * Math.pow(radio, 2));
    }
    
    public void calcularPerimetro(){
        System.out.printf("el perímetro del círculo es: %.2f\n", 2*Math.PI*radio);
    }

}
