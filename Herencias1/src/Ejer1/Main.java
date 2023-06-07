/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta.
 */
package Ejer1;

import Ejer1.Entidades.Animal;
import Ejer1.Entidades.Caballo;
import Ejer1.Entidades.Gato;
import Ejer1.Entidades.Perro;


public class Main {

    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich", "Carnivora", 15, "Doberman");
        perro1.Alimentarse();
       
        Animal gato1= new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
        
       
    }
    
}
