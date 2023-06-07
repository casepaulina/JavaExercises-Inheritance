/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer1.Entidades;

public class Gato extends Animal {
    
    private String nombre;
    private String alimento;
    private int edad;
    private String raza;

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

}
