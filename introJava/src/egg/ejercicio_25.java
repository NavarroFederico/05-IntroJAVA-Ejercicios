/*
 25. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un 
programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ejercicio_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
       
        llenarMatriz(matriz, leer);
        mostrarMatriz(matriz);
        System.out.println(sumarVerticales(matriz)+" "+sumarHorizontales(matriz)+" "+sumarDiagonalInversa(matriz)+" "+sumarDiagonalPrincipal(matriz));
       
        mostrarSiEsmagica(validarSiEsMagica(matriz));
    }

    private static void llenarMatriz(int[][] matriz, Scanner leer) {
        int numeroIngresado;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese el número para la posición [" + i + "] [" + j + "]");
                numeroIngresado = leer.nextInt();
                while (numeroIngresado > 9 || numeroIngresado <= 0) {
                    System.out.println("Por Favor ReIngrese el número para la posición [" + i + "] [" + j + "]");
                    System.out.println("Recuerde que debe ser un número entre 0-9");
                    numeroIngresado = leer.nextInt();
                }
                matriz[i][j] = numeroIngresado;

            }
        }
    }

    private static void mostrarMatriz(int[][] matriz) {
        System.out.println("_____Mostrar Matriz____");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
                if (j != matriz.length - 1) {
                    System.out.print(" | ");
                } else {
                    System.out.println("");
                }
            }
        }
    }

    private static boolean validarSiEsMagica(int[][] matriz) {
        boolean esMagica= false;
        int variableDeControl = sumarHorizontales(matriz);
        if(variableDeControl==sumarVerticales(matriz) && variableDeControl==sumarDiagonalPrincipal(matriz)&& variableDeControl == sumarDiagonalInversa(matriz) ){
            esMagica = true;
            
        }
        return esMagica;
    }
    
    private static void mostrarSiEsmagica(boolean resultadoDeValidacion){
        if( resultadoDeValidacion){
            System.out.println("LA MATRIZ INGRESADA ES MÁGICA ");
        }else {
            System.out.println("LA MATRIZ INGRESADA NO ES MÁGICA ");
        }
    }
    private static int sumarHorizontales(int[][] matriz){
        
        int sumaHorizontales = 0;
            
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                       sumaHorizontales += matriz[i][j];
                    }
        }
             sumaHorizontales/= 3;   
        return sumaHorizontales;
    }
      private static int sumarVerticales(int[][] matriz){
        
        int sumaVerticales = 0;
            
                for (int j = 0; j < matriz.length; j++) {
                    for (int i = 0; i < matriz.length; i++) {
                       sumaVerticales += matriz[i][j];
                    }
                    
        }
                sumaVerticales/= 3;
                
        return sumaVerticales;
    }
      private static int sumarDiagonalPrincipal(int[][] matriz){
        
        int sumaDiagonalPpal = 0;
            
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        if(i==j){
                       sumaDiagonalPpal += matriz[i][j];
                    }
                    }
        }
                
        return sumaDiagonalPpal;
    }
      private static int sumarDiagonalInversa(int[][] matriz){
        
        int sumaDiagonalInversa = 0;
        int nroDeOrdenDelVector = matriz.length-1;
        
                for (int i = 0,j=nroDeOrdenDelVector; i < matriz.length; i++,j--) {
                   
                       sumaDiagonalInversa += matriz[j][i];
                     
                    }
        return sumaDiagonalInversa;
      }
    
}
