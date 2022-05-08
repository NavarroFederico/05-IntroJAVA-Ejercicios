/*
 18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de 
tamaño N, con los valores ingresados por el usuario
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese tamanio del vector");
        int tamanio= leer.nextInt();
        int[] vector = new int[tamanio];
        
        llenarVector(vector, leer);
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
            if(i!= vector.length){
            System.out.print(vector[i]);
                
            }else{
                System.out.print(" | ");
            }
        }
    }
    private static int sumarElementosDelVector(int[] vector){
        int sumatoria=0;
        for (int i = 0; i < vector.length; i++) {
        sumatoria+=vector[i];
            
        }
        return sumatoria;
    }
}
