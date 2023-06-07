
package Ejer4;


public class rectangulo implements calculosFormas {

        public rectangulo(){};
    
    
    @Override
    public void calcularArea() {
        
        double base = 10;
        double altura = 20;
        double area ;
        
        area = base * altura;
        
        System.out.println("El area del rectangulo es: "+area);
        
    }

    @Override
    public void calcularPerimetro() {
        double base = 10;
        double altura = 20;
        double perimetro;
        
        perimetro = (base + altura) * 2;
        
        System.out.println("El perimetro del rectangulo es: "+perimetro);
        
    }

  
    
}
