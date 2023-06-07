package Ejer2.Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    //Atributos    
    private int carga;

    //constructor vacio
    public Lavadora() {
    }

    //constructor con parametros 
    public Lavadora(int carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

//get y set de carga
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    //Crear lavadora
    @Override

    public void crearElectrodomestico() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el color: ");
        color = leer.nextLine();

        System.out.println("Ingrese el tipo de consumo entre A y F: ");
        consumo = leer.next().charAt(0);

        System.out.println("Ingrese el peso en kilos: ");
        peso = leer.nextDouble();

        System.out.println("Ingrese la carga: ");
        carga = leer.nextInt();
    }

        //Precio final heredado
    @Override
    public double precioFinal() {
        
         double monto = super.precioFinal();

        if (carga > 3) {
           monto += 500;
        }
        return monto;
    }
    
    @Override
    public void mostrar(){
        
        int precioBase = 1000;
        System.out.println("El color de la lavadora es: " + getColor());
        System.out.println("El consumo es: " + getConsumo());
        System.out.println("El peso es: " + getPeso());      
        System.out.println("Precio base: "+ precioBase);
        System.out.println("Carga: " + carga + "Kg");
        System.out.println("Precio final: " + precioFinal());
       
    }

         
  
}
