
package EjerExtra1.Entidades;

import java.util.Date;
import java.util.Scanner;

/**
 Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.

 */
public class Barco {
    
    //atributos
    
    Scanner leer = new Scanner (System.in);
    protected String matricula;
    protected double eslora;
    protected int aniofabricacion;

    public Barco() {
    }

    public Barco(String matricula, double eslora, int aniofabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.aniofabricacion = aniofabricacion;
    }

    
   
    
    
    
}
