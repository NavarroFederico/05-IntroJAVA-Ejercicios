/*
19. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos)
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        int tamanio;
        System.out.println("Ingrese el tamanio de los vectores");
        tamanio = leer.nextInt();
        int[] vectorA = new int[tamanio];
        int[] vectorB = new int[tamanio];
        llenarVector(vectorA, leer);
        llenarVector(vectorB, leer);
        
        System.out.println(""+ validarSiLosVectoresSonIguales(vectorA, vectorB));
       ;
    }

    private static boolean validarSiLosVectoresSonIguales(int[] vectorA, int[] vectorB) {
        boolean sonIguales = false;
        for (int i = 0; i < vectorA.length; i++) {
            if (vectorA[i] == vectorB[i]) {
                sonIguales = true;
            } else {
                sonIguales = false;
                break;
            }
        }
        return sonIguales;
    }
    private static void llenarVector(int[] vector, Scanner leer) {
        int valorActual =0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un valor para la posicion " + i);
            valorActual= leer.nextInt();
            vector[i]= valorActual;
        }
    }

}
