package Ejer2;

import Ejer2.Entidades.Electrodomestico;
import Ejer2.Entidades.Lavadora;
import Ejer2.Entidades.Televisor;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

      
        Electrodomestico lavadora = new Lavadora();
        System.out.println("LAVADORA");
        lavadora.crearElectrodomestico();
        lavadora.comprobarColor(lavadora.getColor());
        lavadora.comprobarConsumo(lavadora.getConsumo());
        lavadora.precioFinal();
        lavadora.mostrar();

        Electrodomestico televisor = new Televisor();
        System.out.println("TELEVISOR");
        televisor.crearElectrodomestico();
        televisor.comprobarColor(televisor.getColor());
        televisor.comprobarConsumo(televisor.getConsumo());
        televisor.precioFinal();
        televisor.mostrar();
    }

}
