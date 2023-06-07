
package Ejer1.Entidades;


public class Animal {
    
    //Atributos
    
   protected String nombre;
   protected String alimento;
   protected int edad;
   protected String raza;

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
   
   public void Alimentarse(){
   
       System.out.println("El Animal "+nombre+" se alimenta de "+alimento);
   
   }

  
   
    
   
}
