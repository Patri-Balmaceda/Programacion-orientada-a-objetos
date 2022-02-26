/*
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main.
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la división y se devuelve el resultado al main.
 */
package pooej3;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {
    //atributos de instancia
    private double numero1;
    private double numero2;
    
    //a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion (double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //b) Metodo constructor sin los atributos pasados por parámetro.
    public Operacion(){    
    }
    
    //c) Métodos get y set.
    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }
    
    public double getNumero1(){
        return numero1;
    }
    
    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }
    
    public double getNumero2(){
        return numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese dos números para realizar la operación");
        this.numero1= leer.nextDouble();
        this.numero2= leer.nextDouble();
    }
    
    //e) Método sumar(): calcular la suma de los números y "devolver" (o sea return) el resultado al main.
    public double sumar(){
        return numero1 + numero2;
    }
    
    public double restar(){
        return numero1 - numero2;
    }
    
    public double multiplicar(){
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Toda multiplicación por 0 es igual a 0");
            return 0; //el return funciona como el break saliendo del if por eso se pone por último
        }else{
            System.out.println("El resultado de la multiplicación es:");
            return numero1 * numero2;
        }
    }
    
    public double dividir(){
        if (numero1 == 0) {
            System.out.println("¡ERROR! Si el dividendo es 0 el resultado de la división siempre será 0");
            return 0;
        }else if (numero2 == 0) {
            System.out.println("¡ERROR! Si el divisor es 0 no se puede hacer la operación");
            return 0;
        }else{
            System.out.println("El resultado de la división es:");
            return numero1 / numero2;
        }
    }
}
