/*

*/
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_20 {

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
        llenarVectorConAleatorios(vectorA, leer);
        mostrarVector(vectorA);
    }

    private static void llenarVectorConAleatorios(int[] vectorA,Scanner leer) {
int limMenor =0, limMayor=0;
        System.out.println("Ingrese los limites del vector");
        System.out.println("Limite Inferior");
        limMenor = leer.nextInt();
        System.out.println("Limite mayor");
        limMayor= leer.nextInt();
        
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i]= (int)(Math.random()*(limMayor-limMenor));
            
        }
    }
     private static void llenarVector(int[] vector, Scanner leer) {
        int valorActual =0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un valor para la posicion " + i);
            valorActual= leer.nextInt();
            vector[i]= valorActual;
        }
    }
     private static void mostrarVector(int[] vector){
        System.out.println("Vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if(i!= vector.length){
                System.out.print(" | ");
            }
        }
    }
    
}
