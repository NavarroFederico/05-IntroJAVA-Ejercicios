package egg;

import java.util.Scanner;

/*
 20. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.

 */

/**
 *
 * @author ASUS
 */
public class ejercicio_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int [] vector= new int [100];
         
       llenarVector(vector);
        mostrarVector(vector);
        }
        

    
    
    
        public static void llenarVector(int[] vector){
        
            Scanner leer =new Scanner (System.in);
            System.out.println("Ingrese el punto de partida para llenar 100 numeros");
            int nroIngresado = leer.nextInt();
            for (int i = 0; i < vector.length; i++) {
                 vector[i]= nroIngresado++;
                
            }
}
        public static void mostrarVector(int[] vector){
            
            for (int i = 0; i < vector.length; i++) {
                int j = vector[i];
                System.out.println(j);
            }
        }
             
}
    

