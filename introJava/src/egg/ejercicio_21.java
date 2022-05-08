package egg;

import java.util.Scanner;

/*
21. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido
 */
public class ejercicio_21 {

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
        
        System.out.println("Ingrese un número para buscar en el vector ");
        int numero=leer.nextInt();
        buscarNumero(vector, numero);
        
    }

    public static void llenarVectorAleatorio(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);

        }
    }

    public static void mostrarVectorAleatorio(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if( i!= (vector.length-1)) {
                System.out.print(" | ");
            }
        }
        System.out.println("");
       
    }

    public static void buscarNumero(int[] vector, int numeroBuscado) {
        int repeticiones=0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numeroBuscado) {
                System.out.println("El número buscado : " + numeroBuscado + " se encuentra en la posición " + i
                        + " del vector.\n");
                repeticiones++;
            }
        }
        System.out.println("El número "+ numeroBuscado + " se encuentra repetido "+ repeticiones + " veces. ");
    }
}
