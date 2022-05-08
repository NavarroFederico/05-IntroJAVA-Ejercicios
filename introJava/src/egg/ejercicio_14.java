/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author Fede
 */
public class ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);

         int notaIngresada,suma=0;
         
        for (int i = 0; i <= 20; i++) {
            System.out.println("ingrese un numero ");
            notaIngresada= leer.nextInt();
            
            if ((notaIngresada == 0)){
                System.out.println("Se capturó el numero cero ");
                break;
                
            }
            if (notaIngresada>=0){
                suma= suma+ notaIngresada;
            }
                
        }
        System.out.println("El resultado de la suma es "+ suma);
    System.out.println("fin de programa");
    }
    }
    

