/*
 . Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package egg;

/**
 *
 * @author ASUS
 */
public class Extras_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
String cadena = "";
String str_J, str_I, str_K;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    str_I=String.valueOf(i);
                    str_J=String.valueOf(j);
                    str_K=String.valueOf(k);
                    
                    if(str_I.equals("3")){
                        str_I= "E";
                    }
                     if(str_J.equals("3")){
                        str_J= "E";
                    }
                      if(str_K.equals("3")){
                        str_K= "E";
                    }
                    System.out.println(str_I + "-" + str_J + "-" + str_K);
                }
            }
        System.out.println("jajajaa");
        }
    }
}
