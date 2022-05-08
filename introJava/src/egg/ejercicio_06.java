/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author Fede
 */
public class ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        double numero1, numero2, mayor;
        
        System.out.println("Ingrese un numero ");
        numero1= leer.nextDouble();
        System.out.println("Ingrese otro numero ");
        numero2= leer.nextDouble();
        
        if (numero1>numero2) {
            mayor= numero1;
            System.out.println("El numero mayor es: "+ mayor);
        }else{
            System.out.println("El numero mayor es: " + numero2);
        }
    }
    
}
