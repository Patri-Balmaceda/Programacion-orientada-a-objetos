/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
 */
package pooej5;

import java.util.Locale;
import java.util.Scanner;


public class Cuenta {
    
    private int numeroCuenta;
    private long dni;
    private double saldoActual;
    
    public Cuenta(){
    }
    
    public Cuenta(int numeroCuenta, long dni, double saldoActual){
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }
    
    public void setNumeroDeCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    
    public int getNumeroDeCuenta(){
        return numeroCuenta;
    }
    
    public void setDni(long dni){
        this.dni = dni;
    }
    
    public long getDni(){
        return dni;
    }
    
    public void setSaldoActual(double saldoActual){
        this.saldoActual = saldoActual;
    }
    
    public double getSaldoActual(){
        return saldoActual;
    }
    
    public void crearCuenta(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el número de cuenta");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI");
        dni = leer.nextLong();
        System.out.println("Ingrese su saldo actual");
        saldoActual = leer.nextDouble();
    }
    
    /*
    • Método ingresar(double ingreso): el método recibe (del main) una cantidad de dinero a
ingresar y se la sumará a saldo actual.    
    */
    public void ingresarDinero(double ingreso){
        this.saldoActual += ingreso;
        System.out.println("Su saldo actual es $ " + this.saldoActual);
    }
    /*
    • Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
    */
    public void retirarDinero(double retiro){
        if (retiro>this.saldoActual) {
            this.saldoActual = 0;
            System.out.println("Su saldo es $0,00");
        }else{
            this.saldoActual -= retiro;
            System.out.println("Su saldo es $ " + this.saldoActual);
        }
    }
    
    /*
    Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
    */
    public void estraccionRapida() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese el importe que desea extraer");
        double extraccion = leer.nextDouble();
        
        if (extraccion <= 0.2*this.saldoActual) {
            this.saldoActual -= extraccion;
            System.out.println("El saldo de su cuenta es " + this.saldoActual);
        }
        
        while (extraccion > 0.2*this.saldoActual) {
            System.out.println("Error; extraiga un importe menor");
            extraccion = leer.nextDouble();
        }
        System.out.println("Su saldo es " + (this.saldoActual-extraccion));
    }
    
    public void consultarSaldo() {
        System.out.println("El saldo es $ " + this.saldoActual);
    }
    
    public void consultarDatos() {
        System.out.println("Datos de la cuenta bancaria:");
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("DNI. " + this.dni);
        System.out.println("Saldo actual: " + this.saldoActual);
    }
}
