/*
13. Crear un programa que dibuje una escalera de números, donde cada línea de 
números comience en uno y termine en el número de la línea. Solicitar la altura de 
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1
12
123
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numFinalPorLinea=1;
        int alturaDeEscalera;
        
        System.out.println("Ingrese la altura de la Escalera : ");
        alturaDeEscalera = leer.nextInt();
        
        for ( numFinalPorLinea=1; numFinalPorLinea <= alturaDeEscalera; numFinalPorLinea++) {
            for (int numeroAImprimir = 1; numeroAImprimir <= numFinalPorLinea; numeroAImprimir++) {
                System.out.print(numeroAImprimir);
            }
            System.out.println("");
        }
    }
    
}
