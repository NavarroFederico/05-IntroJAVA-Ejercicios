/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. El programa debe 
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea 
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para 
realizar este ejercicio investigue como utilizar la función Math.random() de Java
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        int numAleatorioMin = 0, numAleatorioMax = 3;
        int operadorUno, operadorDos, resultado,respuesta;
        operadorUno = generarNumeroAleatorio(numAleatorioMin, numAleatorioMax);
        operadorDos = generarNumeroAleatorio(numAleatorioMin, numAleatorioMax);

       resultado= multiplicacion(operadorUno, operadorDos);
       
        System.out.println("Adivine el resultado de dos numeros aleatorios " );
        
      
        do {  
            System.out.println("Ingrese su respuesta:");
        respuesta= leer.nextInt();         
            
        } while (!adivinarResultado(resultado,respuesta));
        System.out.println("Bien Hecho \n Los numeros multiplicados fueron "+operadorUno +" * "+ operadorDos + " = "+ resultado );
    }
          

    public static int generarNumeroAleatorio(int numMin, int numMax) {
        int numAleatorio = 0;

        numAleatorio = (int) (Math.random() * (numMax - numMin));

        return numAleatorio;
    }

    public static int multiplicacion(int numUno, int numDos) {
        int resultadoMultiplicacion = 0;

        resultadoMultiplicacion = numUno * numDos;

        return resultadoMultiplicacion;

    }

    public static void empezarElJuego(int numAleatorioMin, int numAleatorioMax) {
        int operadorUno, operadorDos;
        operadorUno = generarNumeroAleatorio(numAleatorioMin, numAleatorioMax);
        operadorDos = generarNumeroAleatorio(numAleatorioMin, numAleatorioMax);

        multiplicacion(operadorUno, operadorDos);

    }

    private static boolean adivinarResultado(int resultado, int resultadoIngresado) {
        boolean adivino=false;
        
        if (resultado==resultadoIngresado){
            adivino= true;
        }
        return adivino;
    }
}
