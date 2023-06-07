package Ejer2.Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    //Atributos
    private int resolucion;
    private boolean sintonizador;

    //Constructores
    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }


    //Metodos
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    //Crear televisor
    @Override

    public void crearElectrodomestico() {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el color: ");
        color = leer.nextLine();

        System.out.println("Ingrese el tipo de consumo entre A y F: ");
        consumo = leer.next().charAt(0);

        System.out.println("Ingrese el peso en kilos: ");
        peso = leer.nextDouble();

        System.out.println("Ingrese la resolucion del televisor");
        resolucion = leer.nextInt();

        System.out.println("Tiene sintonizador?");
        sintonizador = leer.hasNextBoolean();
    }

    //Precio final heredado
    @Override
    public double precioFinal() {
        double porcen = (precio / 100) / precio;
        double monto = super.precioFinal();
   
        if (resolucion > 40) {
            monto += porcen;
        }

        if (sintonizador = true) {
            monto +=  500;
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
        System.out.println("La resolucion es: "+getResolucion());
        System.out.println("Tiene sintonizador: "+isSintonizador());
        System.out.println("Precio final: " + precioFinal());
       
    }
      

}
