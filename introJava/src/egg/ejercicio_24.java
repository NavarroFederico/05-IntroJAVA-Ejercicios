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
public class ejercicio_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[3][3];
        int[][] matrizTranspuesta = new int[3][3];
       matriz[0][0]=0;
       matriz[0][1]=-2;
       matriz[0][2]=4;
       matriz[1][0]=2;
       matriz[1][1]=0;
       matriz[1][2]=2;
       matriz[2][0]=-4;
       matriz[2][1]=-2;
       matriz[2][2]=0;
        mostrarMatriz(matriz);
        generarMatrizTranspuesta(matriz, matrizTranspuesta);
        mostrarMatriz(matrizTranspuesta);
        System.out.println(validacionEsAntisimetrica(matriz, matrizTranspuesta));
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

    private static void generarMatrizTranspuesta(int[][] matriz, int[][] matrizTranspuesta) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizTranspuesta[i][j] = matriz[j][i];
            }
        }
    }
    public static boolean validacionEsAntisimetrica(int[][] matriz, int[][] matrizTRanspuesta){
       boolean esAntiSimetrica = false;
        int a=0,at=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                a=matriz[i][j];
                at=matrizTRanspuesta[i][j];
                if((a ==-at)){
                   esAntiSimetrica=true; 
                }else{
                    esAntiSimetrica=false;
                    break;
                }
                
            }         
       }
        
        return esAntiSimetrica;
        
    }
}
