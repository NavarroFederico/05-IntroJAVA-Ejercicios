/*
 15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada 
operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num1 , num2 ;
        
        System.out.println("Ingrese los numeros para realizar las siguientes operaciones matematicas suma,resta,multiplicacion y division");
        System.out.println("Ingrese operador 1");
        num1= leer.nextInt();
        System.out.println("Ingrese operador 2");
        num2= leer.nextInt();
        System.out.println("Operaciones Matemáticas :");
        
        System.out.println("1-suma");
        System.out.println("2-resta");
        System.out.println("3-multiplicacion");
        System.out.println("4-division");
        System.out.println("Ingrese una opción ");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                
                System.out.println("Resultado de la suma "+suma(num1,num2));
                break;
            case 2:
                ;
                System.out.println("Resultado de la resta "+resta(num1,num2));
                break;
            case 3:
                System.out.println("Resultado de la multiplicación "+multiplicacion(num1,num2));
                break;
            case 4:
                System.out.println("Resultado de la Division "+division(num1,num2) );
                ;
                break;
            default:
             
        }
        System.out.println();
    }

    private static int suma(int num1, int num2) {
        int resultado=0;
        resultado= num1+num2;
        return resultado;
    }

    private static int resta(int num1, int num2) {
        int resultado=0;
        
        resultado= num1-num2;
        return resultado;
    }

    private static double division(int num1, int num2) {
        double resultado=0;
        resultado= (double)num1/(double)num2;
        
        return resultado;
    }

    private static int multiplicacion(int num1, int num2) {
        int resultado=0;
        resultado= num1*num2;
        
        return resultado;    
    }
    
}
