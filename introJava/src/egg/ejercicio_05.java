/*
 5. Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt()
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author Fede
 */
public class ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
       double numeroIngresado ;
       double dobleDelNum;
       double tripleDelNum;
       double raizCuadrada;
       
        System.out.println("Ingrese un numero ");
       
       numeroIngresado= leer.nextInt();
       
       dobleDelNum= numeroIngresado*2;
       tripleDelNum = numeroIngresado*3;
       raizCuadrada =Math.sqrt(numeroIngresado);
       
        System.out.println("el doble es-->"+dobleDelNum);
        System.out.println("el triple es-->"+ tripleDelNum);
        System.out.println("La raiz cuadrada es-->"+ raizCuadrada);
    }
    
}
