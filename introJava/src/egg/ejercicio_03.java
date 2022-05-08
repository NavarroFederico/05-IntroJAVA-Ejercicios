/*
 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase() en Java
*/
package egg;


import java.util.Scanner;

/**
 *
 * @author Fede
 */
public class ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner leer = new Scanner (System.in);
        
        String palabraIngresada = " ";
        System.out.println("Ingrese una palabra ");
        
       palabraIngresada = leer.nextLine();
       
        System.out.println("La palabra ingresada en mayusculas es : "+ palabraIngresada.toUpperCase());
        System.out.println("La palabra ingresada en minusculas es : "+ palabraIngresada.toLowerCase());
        
        
       
    }
    
}
