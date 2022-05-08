/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg;

/**
 *
 * @author ASUS
 */
public class Extras_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int variableA=1, variableB=2, variableC=3, variableD=4;
        
     
        mostrarVariablesIntercambiadas(variableA, variableB, variableC, variableD);
        mostrarValoresOriginales(variableA, variableB, variableC, variableD);
    }
    private static void mostrarVariablesIntercambiadas(int varA, int varB,int varC, int varD){
        int auxiliar;
        
        //B <-C ,C<-A, A<-D, D<-B,
        auxiliar= varB;
        varB = varC;
        varC = varA;
        varA = varD;
        varD = auxiliar;
       
        System.out.println("Valor Actual de las variables : \n"+ "VariableA "+varA+ "\nVariableB "+varB+ "\nVariableC "+ varC + "\nVariableD "+varD);
    }
     private static void mostrarValoresOriginales(int varA, int varB,int varC, int varD){
          System.out.println("Valor Originales de las variables : \n"+ "VariableA "+varA+ "\nVariableB "+varB+ "\nVariableC "+ varC + "\nVariableD "+varD);
     }
}
