/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere el 
límite inicial.
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author Fede
 */
public class ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner leer = new Scanner(System.in);

         int numeroActual, limiteIngresado, suma =0;
         System.out.println("Ingrese un límite ");
         
         limiteIngresado = leer.nextInt();
         System.out.println("ingrese un Numero para empezar la suma ");
        while (suma<limiteIngresado){
            System.out.println("ingrese un Numero");
            numeroActual= leer.nextInt();
            suma= suma+ numeroActual;
        }
        
    System.out.println("fin de programa");
    }
    
}
