/*
Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int cantidadDePersonas = 3;

        double[] almacenamientoDeAlturas = new double[cantidadDePersonas];

        ingresarAlturas(almacenamientoDeAlturas, leer);
        
        System.out.println("Procesando promedios...");
        System.out.println("Promedio de alturas por debajo "+ promedioDeAlturasPorDebajo(almacenamientoDeAlturas));
        System.out.println("Promedio de alturas por arriba "+ promedioDeAlturasPorArriba(almacenamientoDeAlturas));
        
    }

    private static void ingresarAlturas(double[] almacenamientoDeAlturas, Scanner leer) {

        for (int i = 0; i < almacenamientoDeAlturas.length; i++) {
            System.out.println("Ingrese la altura de la persona " + i);
            almacenamientoDeAlturas[i] = leer.nextDouble();

        }
        System.out.println("Las alturas han sido Ingresadas correctamente ");
    }

    private static double promedioDeAlturasPorDebajo(double[] almacenamientoDeAlturas) {
        final double PARAMETRO_DE_ALTURA = 1.60;
        double promedio = 0, sumatoriaPorDebajoDelParametro = 0;
        int cantidadDePersonasPorDebajo = 0;
        for (int i = 0; i < almacenamientoDeAlturas.length; i++) {
            if (almacenamientoDeAlturas[i] < PARAMETRO_DE_ALTURA) {
                sumatoriaPorDebajoDelParametro += almacenamientoDeAlturas[i];
                cantidadDePersonasPorDebajo++;
            }
        }
        promedio = sumatoriaPorDebajoDelParametro / cantidadDePersonasPorDebajo;
        return promedio;
    }
    
     private static double promedioDeAlturasPorArriba(double[] almacenamientoDeAlturas) {
        final double PARAMETRO_DE_ALTURA = 1.60;
        double promedio = 0, sumatoriaPorArribaDelParametro = 0;
        int cantidadDePersonasPorArriba = 0;
        for (int i = 0; i < almacenamientoDeAlturas.length; i++) {
            if (almacenamientoDeAlturas[i] > PARAMETRO_DE_ALTURA) {
                sumatoriaPorArribaDelParametro += almacenamientoDeAlturas[i];
                cantidadDePersonasPorArriba++;
            }
        }
        promedio = sumatoriaPorArribaDelParametro / cantidadDePersonasPorArriba;
        return promedio;
    }
}
