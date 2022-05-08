/*
1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si 
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 
horas.
 */
package egg;

/**
 *
 * @author ASUS
 */
public class Extras_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calcularEquivalenteEnDiasYHoras(3200);
    }

    private static void calcularEquivalenteEnDiasYHoras(int minutos) {
        //un dia es 1400 min o 24hs
        //1 hs es 60 min
        //x min es 1600 min= 26.6 horas
        //
        int horasDeUnDia = 24, minutosEnUnaHora = 60;
        //convertir minutos a horas
        int convertidoAHoras = (minutos / minutosEnUnaHora);
        System.out.println(convertidoAHoras);

        //cantidad de dias
        int cantDeDias = (int) (convertidoAHoras / horasDeUnDia);

        int horas = convertidoAHoras % 24;

        if (cantDeDias > 0) {
            System.out.println("El equivalente en dias y horas " + cantDeDias + " dias " + horas + " horas ");
        } else {

        }
    }
}
