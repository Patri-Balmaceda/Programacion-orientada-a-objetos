
package pooej3;

public class Main3 {

    public static void main(String[] args) {
        
        //creamos el objeto u instancia
        Operacion operacion = new Operacion();
        
        operacion.crearOperacion();
        
        
        System.out.printf("La suma de %.2f y %.2f es igual a: %.2f\n", operacion.getNumero1(), operacion.getNumero2(), operacion.sumar());
        System.out.printf("La diferencia entre %.2f y %.2f es igual a : %.2f\n", operacion.getNumero1(), operacion.getNumero2(), operacion.restar());
        System.out.println(operacion.multiplicar());
        System.out.println(operacion.dividir());
    }  
}
