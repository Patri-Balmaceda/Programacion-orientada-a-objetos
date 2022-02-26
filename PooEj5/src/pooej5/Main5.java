package pooej5;

import java.util.Locale;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Cuenta cuentaBancaria = new Cuenta();
        
        cuentaBancaria.crearCuenta();
        
        System.out.println("Ingrese el importe a depositar");
        cuentaBancaria.ingresarDinero(leer.nextDouble());
        
        System.out.println("Ingrese el importe a retirar");
        cuentaBancaria.retirarDinero(leer.nextDouble());
        
        cuentaBancaria.estraccionRapida();
        
        cuentaBancaria.consultarSaldo();
        
        cuentaBancaria.consultarDatos();
    }
    
}
