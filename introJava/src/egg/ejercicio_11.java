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
public class ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);

         int tipoDeMotor;
         System.out.println("Ingrese un tipo de Bomba");
         tipoDeMotor= leer.nextInt();
        
         switch (tipoDeMotor) {
            case 1:
                System.out.println("“La bomba es una bomba de agua”");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                 System.out.println("La bomba es una bomba de hrmigon");
                break;
            case 4:
                 System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                 System.out.println("No existe un valor valido para tipo de Bomba");;
        }
    }
    
}
