/*
 Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
descuento en todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
descuento para los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos. 
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
que represente el costo del tratamiento (previo al descuento) y determine el importe 
en efectivo a pagar por dicho socio
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Extras_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer=new Scanner (System.in);
    
        final char  tipoA='A',tipoB= 'B',tipoC='C';
        char tipoDeSocio = '\0';
        double costoDelTratamiento;
        double costoDelTratamientoConDescuento = 0;
        
        System.out.println("Ingrese el tipo de Socio");
        tipoDeSocio= leer.next().toUpperCase().charAt(0);
        System.out.println("Ingrese el costo del tratamiento (sin descuento)");
        costoDelTratamiento= leer.nextDouble();
        
        
        switch (tipoDeSocio) {
            case tipoA:
                costoDelTratamientoConDescuento= costoDelTratamiento-(costoDelTratamiento*0.50);
                break;
            case tipoB :
                 costoDelTratamientoConDescuento= costoDelTratamiento-(costoDelTratamiento*0.35);
                break;
            case tipoC:
                 costoDelTratamientoConDescuento= costoDelTratamiento;
                break;
            default:
        }
        
    mostrarCostoFinal(costoDelTratamientoConDescuento);
    }

    private static void mostrarCostoFinal(double costoDelTratamientoConDescuento) {
        System.out.println("El costo final del tratamiento " +costoDelTratamientoConDescuento);
    }
    
}
