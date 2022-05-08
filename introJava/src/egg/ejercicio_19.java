package egg;


import java.util.Scanner;

/*
 *9. Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */

/**
 *
 * @author ASUS
 */
public class ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cantidadDeEuros;
        char unidadAConvertir='\0'; 
        
        System.out.println("Ingrese la cantidad de Euro ");
        cantidadDeEuros = leer.nextInt();
        System.out.println("Ingrese la unidad que desea convertir ");
        System.out.println("d- A dolares");
        System.out.println("l- A libras");
        System.out.println("");
        
        unidadAConvertir=leer.next().charAt(0);
        
        mostrarTiposDeCambios(cantidadDeEuros, unidadAConvertir);
    }
    public static void mostrarTiposDeCambios(int cantidadDeEuros,char unidadAConvertir){
        
        switch (unidadAConvertir) {
            case 'd':
                System.out.println("El cambio de divisas de"+ cantidadDeEuros+ " € a USS es " + cantidadDeEuros*1.13  );
                break;
                
            case 'l':
                 System.out.println("El cambio de divisas de"+ cantidadDeEuros+ " € a Libras es " + cantidadDeEuros*0.83  );
                break;
            default:
                
        }
        
    }
}
