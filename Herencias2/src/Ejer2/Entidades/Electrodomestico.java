package Ejer2.Entidades;

import java.util.Scanner;

public class Electrodomestico {
//Atributos    

    protected double precio = 1000;
    protected String color;
    protected char consumo;
    protected double peso;

    //Constructores
    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }
   
    
     //Metodos
    //Get y Set

    public double getPrecio() { 
        return precio;
    }
    public void setPrecio(double precio) {   
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Comprobar consumo electrico
    public void comprobarConsumo(char letra) {

        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i = 0; i < letras.length; i++) {
            if (letra == letras[i]) {
                this.consumo = letra;
            } else {
               
            }
        }
    }

    //Comprobar color    
    public void comprobarColor(String color) {

        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};

        for (int i = 0; i < colores.length; i++) {
            if (color == colores[i]) {
                this.color = color;
            } else {
                this.color = "blanco";
            }
        }
    }

    //Crear electrodomestico
    public void crearElectrodomestico() {

        Scanner leer = new Scanner(System.in);
        
        Electrodomestico e = new Electrodomestico();          
              
        System.out.println("Ingrese el color: ");
        color=leer.nextLine();
        
        e.comprobarColor(e.getColor());
        
        System.out.println("Ingrese el tipo de consumo entre A y F: ");
        consumo= leer.next().charAt(0);
        
        e.comprobarConsumo(e.getConsumo());
        
        System.out.println("Ingrese el peso en kilos: ");
        peso=leer.nextDouble();    
        
    }

    //Precio final
    public double precioFinal() {
       double monto =0;
//precio por peso
        if (peso >= 1 && peso  <= 19) {
           monto += 100;

        } else if (peso >= 20 && peso <= 49) {
            monto +=500;

        } else if (peso  >= 50 &&peso  <= 79) {
            monto += 800;

        } else if (peso  > 80) {
          monto += 1000;
        }

        //precio por letra        
        switch (consumo) {
            case 'A':
                monto += 1000;
                break;
            case 'B':
                monto += 800;
                break;
            case 'C':
                monto+= 600;
                break;
            case 'D':
                monto +=500;
                break;
            case 'E':
                monto +=300;
                break;
            case 'F':
                monto +=100;
                break;
        }
        return precio+monto;
    }
    
    public void mostrar() {
        
        System.out.println("El color de la lavadora es: " + getColor());
        System.out.println("El consumo es: " + getConsumo());
        System.out.println("El peso es: " + getPeso());      
        System.out.println("Precio base: "+ getPrecio());

    }
    
}
