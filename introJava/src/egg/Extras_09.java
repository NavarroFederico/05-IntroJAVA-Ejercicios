/*
 Simular la división usando solamente restas. Dados dos números enteros mayores 
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor 
que el divisor, este resultado es el residuo, y el número de restas realizadas es el 
cociente. Por ejemplo: 50 / 13: 
50 – 13 = 37 una resta realizada 
37 – 13 = 24 dos restas realizadas 
24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int dividendo, divisor;
        System.out.println("Ingrese los números para realizar la división");
        System.out.println(" dividendo / divisor = cociente");
        System.out.println("Ingrese el dividendo :");
        dividendo= leer.nextInt();
        System.out.println(dividendo+ " /divisor = cociente ");
        System.out.println("Ingrese el divisor :");
        divisor= leer.nextInt();
        
        System.out.println("Resultado de la División por restas: " +dividendo+ " / "+ divisor +" = " +dividirConRestas(dividendo, divisor));;
                
    }
    private static int dividirConRestas(int dividendo, int divisor){
       int residuo = 0;
       int cociente =0;
       int dividendoActual= dividendo;
      
       
        do { 
            
           residuo = (dividendoActual- divisor);
            dividendoActual=residuo;
            cociente++;
            
        } while (residuo>divisor);
        return cociente;
    }
}
