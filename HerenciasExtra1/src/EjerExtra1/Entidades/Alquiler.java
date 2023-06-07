package EjerExtra1.Entidades;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha de
 * alquiler, fecha de devolución, la posición del amarre y el barco que lo
 * ocupará.
 */
public final class Alquiler {
    
     Scanner leer = new Scanner (System.in);
    //Atributos

    private String nombre;
    private int documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre = 0;
    private Barco barco;

    public Alquiler() {
    }
    
    public Alquiler(String nombre, int documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.barco = barco;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "leer=" + leer 
                + ", nombre=" + nombre 
                + ", documento=" + documento 
                + ", fechaAlquiler=" + fechaAlquiler 
                + ", fechaDevolucion=" + fechaDevolucion
                + ", posicionAmarre=" + posicionAmarre
                + ", barco=" + barco + '}';
    }
    

    //Metodos
    /*Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).*/
    public void crearCliente() {

        System.out.println("Ingrese su nombre ");
        setNombre(leer.next());
        
        System.out.println("Ingrese su DNI ");
        setDocumento(leer.nextInt());
           }
    
    
    public void crearFecha(){
        
       String fechaAlquilerAux;
       String fechaDevolucionAux;
        
        do {            
        System.out.println("Indique desde que fecha quiere alquilar. Usar formato aaaa-mm-dd");
        fechaAlquilerAux = leer.next();
        } while (!fechaAlquilerAux.contains("-"));
        setFechaAlquiler(LocalDate.parse(fechaAlquilerAux));
        
        do {
            System.out.println("Indique hasta cuando quiere alquilar. Usar formato aaaa-mm-dd");
            fechaDevolucionAux = leer.next();
        } while (!fechaDevolucionAux.contains("-"));
        
        setFechaDevolucion(LocalDate.parse(fechaDevolucionAux));    
    }

     public int calcularDiasAlquilado(LocalDate fechaAlq, LocalDate fechaDev){
         
        int diasAlquiler = 0;
        
        Duration dd = Duration.between(fechaAlq.atStartOfDay(), fechaDev.atStartOfDay());
        diasAlquiler = (int) dd.toDays();
        System.out.println("Estuvo alquilado " + diasAlquiler + " dias.");
        return diasAlquiler;
    }
    
}
