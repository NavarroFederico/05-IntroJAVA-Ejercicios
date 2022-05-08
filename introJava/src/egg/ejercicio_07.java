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
public class ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in);
        
        int numero1;
        
        System.out.println("Ingrese un numero ");
        numero1=  leer.nextInt();
       

        if (numero1 %2==0){
            System.out.println("el numero ingresado es par "+ numero1);
        }else{
            System.out.println("El número ingresado es impar "+ numero1);
        }
            
    }
    
}
