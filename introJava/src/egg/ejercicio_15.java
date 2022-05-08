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
public class ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         
         int operador1, operador2,resultado,opcion;
         char confirmacion= ' ';
         System.out.println("Ingrese un numero");
         operador1= leer.nextInt();
         System.out.println("Ingrese un numero");
         operador2= leer.nextInt();

//menu
while(confirmacion!='s'){
do{
        System.out.println("MENU");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Salir");
        System.out.println("Elija una Opción");
        
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                resultado = (operador1+operador2);
                System.out.println("El resultado es " + resultado);
                break;
            case 2:
                 resultado = (operador1-operador2);
                 System.out.println("El resultado es " +  resultado);
                break;
            case 3:
                resultado = (operador1*operador2);
                 System.out.println("El resultado es " +  resultado);
                break;
            case 4:
                resultado = (operador1/operador2);
                 System.out.println("El resultado es " +  resultado);
                break;
            case 5:
                System.out.println("Está seguro que desea salir?");
                confirmacion= leer.next().charAt(0);
                break;
            default:

        }
}while(opcion !=5);
    }
        System.out.println("Ha salido Exitosamente");
    }
}
