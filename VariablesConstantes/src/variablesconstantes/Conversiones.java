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
public class Conversiones {
     
    public static void main(String[] args) {
        String numero01 ="50";
        int numero02 = 20;
        int resultado = 0;
        
        resultado = Integer.parseInt(numero01) +numero02; //convertir de string a int
        
        String numeroConDecimales = "10.5";
        double numeroReal = Double.parseDouble(numeroConDecimales);
        
        int numeroPreliminar = 10;
        String deNumeroAString = String.valueOf(numeroReal);
        //or
        String deNumeroAString2 = ""+numeroPreliminar;
    }
}
