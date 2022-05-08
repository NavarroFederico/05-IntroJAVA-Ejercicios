/*
16. Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores 
de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra 
“No”
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_16 {
    public static int edadActual ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String respuesta = "SI";
        String nombre = "";

        while (respuesta.equalsIgnoreCase("SI")) {
            ingresarDatos(nombre, edadActual, leer);
            if (esMayorDeEdad(edadActual)) {
                System.out.println(nombre + "es mayor de edad");
            } else {
                System.out.println(nombre + "aún no es mayor de edad");
            }
            
            System.out.println("¿Desea ingresar otra persona? Si/No");
            respuesta=leer.next().toUpperCase();
        System.out.println("Su respuesta ha sido "+respuesta);
        }
        System.out.println("Muchas Gracias");
        System.out.println("Fin Programa");
    }

    private static void ingresarDatos(String nombreActual, int edadActual, Scanner leer) {
        System.out.println("Ingrese el nombre de la persona");
        nombreActual = leer.next();
        System.out.println("Ingrese la edad ");
        Extras_16.edadActual = leer.nextInt();

    }

    private static boolean esMayorDeEdad(int edadActual) {
        final int mayoriaDeEdad = 18;
        boolean esMayor = false;
        if(edadActual >= mayoriaDeEdad) {
            esMayor = true;
        }
        return esMayor;
    }
}
