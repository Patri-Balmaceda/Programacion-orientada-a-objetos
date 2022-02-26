
package pooej9;

public class Main9 {

    public static void main(String[] args) {
               
        Matematica mate1 = new Matematica();
        mate1.setNro1(Math.random()*10);  //para números aleatorios hasta 10
        System.out.println(mate1.getNro1());
        
        mate1.setNro2(Math.random()*10);
        System.out.println(mate1.getNro2());
        
        System.out.println(mate1.devolverMayor());
        mate1.calcularPotencia();
        mate1.calculaRaiz();
    }    
}