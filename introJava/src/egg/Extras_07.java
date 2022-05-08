/*
 realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
promedio de n números (n>0). El valor de n se solicitará al principio del programa y 
los números serán introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”
 */
package egg;

import java.util.Scanner;

public class Extras_07 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        int valorMax,valorMin;
        double valorPromedio;
        int numeroIngresado ;
        int cantDeNumeros ;
        System.out.println("Ingrese la cantidad de numeros ");
      cantDeNumeros = leer.nextInt();
        int[] vectorNumeros = new int [cantDeNumeros];
        int i=0;
        while(i < cantDeNumeros){
            System.out.println("Ingrese un numero para la posicion "+ i + " del vector.");
            numeroIngresado= leer.nextInt();
            vectorNumeros[i]=numeroIngresado;
            i++;
        }
        
        System.out.println(vectorNumeros);
        calcularMax(vectorNumeros);
        calcularMin(vectorNumeros);
        calcularElPromedio(vectorNumeros);
        
    }

    private static void calcularMax(int[] vectorNumeros) {
        int mayor = 0;
        for (int i = 0; i < vectorNumeros.length; i++) {
            if (vectorNumeros[i]>mayor){
                mayor= vectorNumeros[i];
            }
        }
        System.out.println("El mayor de los numeros ingresados es : "+ mayor);
    }

    private static void calcularMin(int[] vectorNumeros) {
          int menor = vectorNumeros[0];
        for (int i = 0; i < vectorNumeros.length; i++) {
            if (vectorNumeros[i]<menor){
                menor= vectorNumeros[i];
            }
        }
        System.out.println("El menor de los numeros ingresados es : "+ menor);
    }
    

    private static void calcularElPromedio(int[] vectorNumeros) {
        double promedio;
        int suma= 0 ;
 for (int i = 0; i < vectorNumeros.length; i++) {
            suma +=vectorNumeros[i];
            
        }
 promedio=suma/vectorNumeros.length;
        System.out.println("El promedio"+ promedio );
    }
}
