/*Ya que este calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz, 
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el perímetro y 
el valor de PI como constante.
 */
package Ejer4;


public interface calculosFormas {
    
    public double PI = 3.1416;
    
    public void calcularArea() ;
    
    public void calcularPerimetro();    
 
    
}
