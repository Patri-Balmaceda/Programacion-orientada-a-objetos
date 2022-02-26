package pooej2;

public class Main2 {

    
    public static void main(String[] args) {
        //creamos el objeto u instancia circunferencia inicializado en cero porque no tengo el constructor vacío
        Circunferencia circunferencia = new Circunferencia(0);
        circunferencia.crearCircunferencia();
        circunferencia.calcularArea();
        circunferencia.calcularPerimetro();   
        
    }
    
}
