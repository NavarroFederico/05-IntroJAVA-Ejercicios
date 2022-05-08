/*
11. Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, el 
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo entero 
truncan los números o resultados
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        
        int numDeDigitos=0 , numIngresado;
        
        System.out.println("Ingrese un número ");
        numIngresado= leer.nextInt();
while (numIngresado!= 0){
        numIngresado/= 10;
        numDeDigitos++;
}
        System.out.println("El número ingresado tiene "+ numDeDigitos + " digitos.");
    }
   
}
