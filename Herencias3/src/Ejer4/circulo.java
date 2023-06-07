package Ejer4;

import static java.lang.Math.PI;

public class circulo implements calculosFormas {
    
    
    public circulo(){};

    @Override
    public void calcularArea() {

        double radio = 5;
        double area = PI * Math.pow(radio, 2);
        
        System.out.println("El area del circulo es: "+ area);

    }

    @Override
    public void calcularPerimetro() {
        
       double diametro = 4; 
       double perimetro= PI * diametro;
       
       System.out.println("El perimetro del circulo es: "+perimetro);
       

    }

   
}
