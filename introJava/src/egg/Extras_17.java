/*
 17. Crea una aplicación que nos pida un número por teclado y con una función se lo 
pasamos por parámetro para que nos indique si es o no un número primo, debe 
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
¿Qué son los números primos?
 */
package egg;

/**
 *
 * @author ASUS
 */
public class Extras_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(validarSiEsPrimo(25)){
            System.out.println("El número ingresado es primo");
        }else{
            System.out.println("El número ingresado no es primo");
            
        }
        
        
    }
    private static boolean validarSiEsPrimo(int numeroIngresado){
        boolean esPrimo =true;
        for (int i = 1; i < numeroIngresado; i++) {
                 if((i == 1 || i == numeroIngresado) || numeroIngresado%i != 0){
                 } else {
                     esPrimo =false;
            }   
        }
        
        
        return esPrimo;
    
}
}
