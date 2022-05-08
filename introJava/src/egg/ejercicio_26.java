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
public class ejercicio_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //int [][] matrizM=new int[10][10];//Instancia y crea una matriz en una sola linea
        int[][] matrizM = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10}, {11, 12, 13, 21, 41, 22, 67, 20, 10, 61}, {56, 78, 87, 90, 9, 90, 17, 12, 87, 67}, {41, 87, 24, 56, 97, 74, 87, 42, 64, 35}, {32, 76, 79, 01, 96, 12, 11, 67, 36, 05}, {99, 13, 54, 88, 12, 42, 76, 75, 89, 90}, {67, 78, 87, 45, 42, 56, 78, 26, 14, 22}, {98, 45, 34, 23, 32, 56, 74, 36, 36, 05}, {24, 67, 97, 46, 87, 13, 67, 89, 89, 90}, {21, 68, 78, 98, 90, 67, 12, 14, 22, 26}};
        int[][] matrizP = {{32, 76, 79}, {99, 13, 54}, {67, 78, 87}};

        mostrarMatriz(matrizM);
        mostrarMatriz(matrizP);
//        System.out.println( buscarMatrizDentroDeOtra(matrizP, matrizM,0,0));
//        buscarMatrizDentroDeOtra(matrizP, matrizM,0,0);
        busquedaCompleta(matrizM, matrizP);
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

    private static boolean buscarMatrizDentroDeOtra(int[][] matrizOriginal, int[][] matriz, int fila, int columna) {
        boolean seEncuentra = false;

        for (int i = 0, m = fila; i < matriz.length; i++, m++) {
            for (int j = 0, n = columna; j < matriz.length; j++, n++) {

                if (matrizOriginal[m][n] == matriz[i][j]) {
                    seEncuentra = true;
                } else {
                    return seEncuentra = false;

                }
            }
        }
        return seEncuentra;
    }

    private static void busquedaCompleta(int[][] matrizOriginal, int[][] matriz) {
        int i = 0, j = 0,iDeCoincidencia=0,jDeCoincidencia=0;
        for (i = 0; i <= matrizOriginal.length - matriz.length; i++) {
            for (j = 0; j <= matrizOriginal.length - matriz.length; j++) {
                if (buscarMatrizDentroDeOtra(matrizOriginal, matriz, i, j)) {
                    System.out.println("encontro igualdad");
                   iDeCoincidencia= i; jDeCoincidencia=j;
//                    mostrarMatrizCoincidente(matrizOriginal, matriz, i, j);
                    mostrarPosicionesDeLasCoincidencias(matrizOriginal, matriz, i, j);
                    System.out.println("");
                }

            }
        }
        
        if (buscarMatrizDentroDeOtra(matrizOriginal, matriz, iDeCoincidencia, jDeCoincidencia) == false) {
            System.out.println("No Hubo coincidencia");
        }
    }
    private static void mostrarMatrizCoincidente(int[][] matrizOriginal, int[][] matriz,int i, int j){
        for (int k = i; k < i + matriz.length; k++) {
                        for (int l = j; l < j + matriz.length; l++) {
                            System.out.print(matrizOriginal[k][l]);
                            if (l != (j + matriz.length) - 1) {
                                System.out.print(" | ");
                            } else {
                                System.out.println("");
                            }
                        }
                    }
    }
    private static void mostrarPosicionesDeLasCoincidencias(int[][] matrizOriginal, int[][] matriz,int i, int j){
        String msje= "Como podemos observar nuestra submatriz P se encuentra en la matriz M en los indices: "; 
        for (int k = i; k < i + matriz.length; k++) {
                        for (int l = j; l < j + matriz.length; l++) {
                            msje+= k+" , "+l ;
                           if(k!=i+matriz.length){
                               msje+=" - ";
                           }else{
                               msje+=".";
                           }
                          
                        }
                    }
        System.out.println(msje);
    }
}
