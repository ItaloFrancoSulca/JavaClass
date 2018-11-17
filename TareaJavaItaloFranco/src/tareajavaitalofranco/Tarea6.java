/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareajavaitalofranco;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tarea6 {
    public static void main(String[] args) {
        int numero = 0;
        int numMulti = 1;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Inserte un número");
        numero = teclado.nextInt();
        
        if (numero!=0){
            
            for (int i=1;i<=Math.abs(numero);){

                numMulti=numMulti*i;
                i = i+2;
                
            }
            
        } else if (numero==0){
            
            System.out.println("El número insertado fue 0.");
            
        } 
        
        System.out.println("El promedio del numero impar de cifras que contiene el número es "+numMulti);
    }
}
