/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author Fede
 */
public class ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        String palabraIngresada;
        System.out.println("Ingrese una palabra ");

        palabraIngresada = leer.next();

        if (palabraIngresada.length()==8) {
            System.out.println("Correcto");

        } else {
            System.out.println("Incorrecto");
        }
    }
}
