/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una 
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la 
clase String
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String letraIngresada;
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese una letra por favor ");
        letraIngresada= leer.next();
        detectarVocal(letraIngresada);
    }

    private static void detectarVocal(String letraIngresada) {
        
        if (letraIngresada.equalsIgnoreCase("A")|| letraIngresada.equalsIgnoreCase("E")||letraIngresada.equalsIgnoreCase("I")||letraIngresada.equalsIgnoreCase("O")||letraIngresada.equalsIgnoreCase("U")){
            System.out.println("La letra ingresada es una vocal");
        }else{
            System.out.println("La letra ingresada no es una vocal ");
        }
            }
    }
    

