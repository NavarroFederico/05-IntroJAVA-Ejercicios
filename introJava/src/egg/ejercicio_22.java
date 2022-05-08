/*

 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ejercicio_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int tamanio = leer.nextInt();

        int[] vector = new int[tamanio];

        llenarVectorAleatorio(vector);
        mostrarVectorAleatorio(vector);
        contabilizarPorDigitos(vector);
    }

    public static void llenarVectorAleatorio(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
    }

    public static void mostrarVectorAleatorio(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i != (vector.length - 1)) {
                System.out.print(" | ");
            }
        }
        System.out.println("");

    }
    public static void contabilizarPorDigitos(int[]vector){
                int cantidadDeUnDigito=0;
                int cantidadDeDosDigitos=0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]<10){
                cantidadDeUnDigito++;
            }else{
                cantidadDeDosDigitos++;
            }
            }
           System.out.println("La cantidad de numeros con un digito es: "+ cantidadDeUnDigito);
           System.out.println("La cantidad de numeros con dos digito es: "+ cantidadDeDosDigitos);
    }
}
