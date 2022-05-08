
package egg;

import java.util.Scanner;

/**
 *
 * @author Fede
 */
public class ejercicio_01 {
/*
    Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
    */

    public ejercicio_01() {
    }
    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        int operador1 , operador2;
        int resultado;
        System.out.println("Ingrese el operador uno para hacer la suma");
        operador1= leer.nextInt();
      
        System.out.println("Ingrese el operador dos para hacer la suma");
        operador2= leer.nextInt();
        
        resultado= operador1+ operador2;
                
        System.out.println(" La suma entre "+ operador1 +" + "+ operador2 +" es --> " + resultado); 
    }
    
}
