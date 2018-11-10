/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Administrador
 */
public class Repaso02 {
    
    public static void main(String[] args) {
        int [] listaN = {1,2,3,4,5};
        int [] listaZ = new int [listaN.length];
        
        for (int i = 0; i < listaN.length; i++) {
            listaZ[i]=listaN[(listaN.length-1)-i];
        }
        
        for (int i = 0; i < listaZ.length; i++) {
            System.out.println("listaZ["+i+"]= "+listaZ[i]);
        }
    }
    
}
