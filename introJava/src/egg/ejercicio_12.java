/*
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author Fede
 */
public class ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);

         int notaIngresada;
        do{
         System.out.println("Ingrese nota ");
         notaIngresada= leer.nextInt();
        
        }while((notaIngresada>10 || notaIngresada<0));
    System.out.println("fin de programa");
    }
    
}
