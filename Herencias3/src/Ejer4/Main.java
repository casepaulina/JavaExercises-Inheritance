/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este calculo se va a repetir en las dos 
formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los dos métodos para calcular
el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y 
se calcule el área y el perímetro de los dos.
En el main se crearán las formas y se mostrará el resultado final.

Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package Ejer4;

public class Main {

    public static void main(String[] args) {
        
        circulo c1 = new circulo();
        
        c1.calcularArea();
        c1.calcularPerimetro();
            
        rectangulo r1 = new rectangulo();
        
        r1.calcularArea();
        r1.calcularPerimetro();
      
        
        
    }
    
}
