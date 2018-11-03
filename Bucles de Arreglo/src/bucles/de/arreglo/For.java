/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles.de.arreglo;

/**
 *
 * @author Administrador
 */
public class For {
    public static void main(String[] args) {
        /*for (int i = 0; i <= 12; i=i+2) {
            System.out.println ("5 x "+i+" = "+(5*i));
        }
        
        System.out.println("\n"); //enter
        
        for(int i=12;i>=0;i--){
            System.out.println("6 x "+i+" = "+(5*i));
        }*/
        
        for(int i=1;i<=12;i++){
            System.out.println("Tabla de multiplicar de "+i);
            for(int a=1;a<=12;a++){
                System.out.println(i+" x "+a+" = "+(i*a));
            }
            System.out.println("\n");
        }
    }
}
