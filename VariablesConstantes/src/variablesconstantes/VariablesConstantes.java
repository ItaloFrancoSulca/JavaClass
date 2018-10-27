/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesconstantes;

/**
 *
 * @author Administrador
 */


public class VariablesConstantes {

    /**
     * @param args the command line arguments
     */
    
    static String variableStaticGlobal = "";
    
    final int IGV = 18;
    
    public static void main(String[] args) {
        
        String variableTexto;
        int primeraVariable;
        boolean variableBool;
        double variableDouble;
        char varibleChar;
        
        primeraVariable = 12;
        variableTexto ="aasd";
        variableBool = false;
        variableDouble = 2.5f;
        
        variableStaticGlobal = "Estoy en metodo Main";
        
        
        MiSegundoMetodo();
    }
    
    static void MiSegundoMetodo (){
        variableStaticGlobal ="Estoy en el segundo metodo";
    }
    
}
