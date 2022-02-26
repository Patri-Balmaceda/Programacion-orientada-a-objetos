/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardarán en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 
package pooej9;

public class Matematica {
    
    private double num1;
    private double num2;
    
    public Matematica (){
        
    }
    
    public Matematica(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public  void setNumero1(double num1){
        this.num1= num1;
    }
    
    public double getNumero1(){
        return num1;
    }
    
    public void sertNumero2(double num2){
        this.num2= num2;
    }
    
    public double getNumero2(){
        return num2;
    }
    
    public double devolverMayor(){
        return Math.max(this.num1, this.num2);
    }
    
    public void calcularPotencia(){
        double redondeo1=Math.round(num1);
        double redondeo2=Math.round(num2);
        System.out.println(Math.pow(Math.max(redondeo1, redondeo2), Math.min(redondeo1, redondeo2)));
    }
    
    public void calculaRaiz(){
        Math.sqrt(Math.abs(num1));
    }*/
    
    package ej9;

public class Matematica {

    private double nro1;
    private double nro2;

    public Matematica() {
    }

    public Matematica(double nro1, double nro2) {
        this.nro1 = nro1;
        this.nro2 = nro2;
    }

    public double getNro1() {
        return nro1;
    }

    public void setNro1(double nro1) {
        this.nro1 = nro1;
    }

    public double getNro2() {
        return nro2;
    }

    public void setNro2(double nro2) {
        this.nro2 = nro2;
    }

    public double devolverMayor() {
        return Math.max(this.nro1, this.nro2);
    }

    public void calcularPotencia() {
        double redondeo1 = Math.round(nro1);
        double redondeo2 = Math.round(nro2);
        System.out.printf("La potencia del mayor valor de la clase elevado al menor número es: %.2f\n", Math.pow(Math.max(redondeo1, redondeo2), Math.min(redondeo1, redondeo2)));
    }

    public void calculaRaiz(){
        System.out.printf("La raíz cuadrada del menor de los dos valores es: %.2f ", Math.sqrt(Math.abs((Math.min(nro1, nro2))))); 
    }
}
