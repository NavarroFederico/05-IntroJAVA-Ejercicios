/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg;

/**
 *
 * @author ASUS
 */
public class ejercicio_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[4][4];
        int[][] matrizTranspuesta = new int [4][4];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        generarMatrizTranspuesta(matriz,matrizTranspuesta);
        mostrarMatriz(matrizTranspuesta);
    }

    private static void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);

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
    private static void generarMatrizTranspuesta(int [][] matriz, int [][] matrizTranspuesta){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               matrizTranspuesta[i][j]=matriz[j][i];
            }
        }
    }}
