/*
 8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break.
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

//        int numeroIngresado = 0, cantNumLeidos = 0, cantNumPares = 0, cantNumImpares = 0;
//        int i = 0;
//        System.out.println("Ingrese un numero ");
//        numeroIngresado = leer.nextInt();
//        cantNumLeidos++;
//        while (!(numeroIngresado % 5 == 0)) {
//            System.out.println("Ingrese un numero");
//            if (numeroIngresado % 2 == 0) {
//                cantNumPares++;
//            } else {
//                cantNumImpares++;
//
//            }
//            cantNumLeidos++;
//
//        }
//       
//            
//        }
//        System.out.println("Cantidad de numeros pares " + cantNumPares + " \nTotal de numeros leidos " + cantNumLeidos+ "Cantidad de numeros impares " + cantNumImpares);
        procesoConFor(leer);

    }

   


    private static void procesoConFor(Scanner leer) {
        int numeroIngresado = 0, cantNumLeidos = 0, cantNumPares = 0, cantNumImpares = 0;

        String numerosMultiplosDeCinco = "";

        for (int i = 0;; i++) {

            System.out.println("Ingrese un numero ");
            numeroIngresado = leer.nextInt();
            cantNumLeidos++;
            if (numeroIngresado % 5 == 0) {
                numerosMultiplosDeCinco += numeroIngresado;
                System.out.println("El Numero Multiplo de cinco Ingresado es: " + numerosMultiplosDeCinco);
                break;
            } else {
                if (numeroIngresado % 2 == 0) {
                    cantNumPares++;
                } else {
                    cantNumImpares++;

                }

            }
        }
         System.out.println("Cantidad de numeros pares " + cantNumPares +"\nCantidad de numeros impares " + cantNumImpares+ " \nTotal de numeros leidos " + cantNumLeidos );
    }
}
