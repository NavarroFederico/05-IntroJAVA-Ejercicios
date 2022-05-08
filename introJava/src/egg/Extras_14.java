/*
14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M 
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para 
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de 
todas las familias.
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cantFlia,cantDeHijos, sumatoriaDeEdades=0 ;
        double promedioDeEdades=0;
        int edadActual;
        int cantDeHijosTotal=0;
        
        System.out.println("Ingrese la cantidad de Familias a Ingresar datos");
        cantFlia= leer.nextInt();
        
        for (int i = 1; i <= cantFlia; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia "+ i);
            cantDeHijos= leer.nextInt();
            for (int j = 1; j <= cantDeHijos; j++) {
                System.out.println("Ingrese la edad de su hijo/a "+ j);
                edadActual= leer.nextInt();
                sumatoriaDeEdades+= edadActual;
                cantDeHijosTotal++;
            }
        }
        promedioDeEdades= sumatoriaDeEdades/cantDeHijosTotal;
        System.out.println("Promedio de Edades total " + promedioDeEdades);
    }
    
}
