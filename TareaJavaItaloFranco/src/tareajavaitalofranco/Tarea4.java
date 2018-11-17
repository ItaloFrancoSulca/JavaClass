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
public class Tarea4 {
    public static void main(String[] args) {
        double numInserted = 1;
        Scanner teclado = new Scanner (System.in);
     
        while (numInserted !=0){
            System.out.println("---Inserte un número---");
            numInserted = teclado.nextDouble();
            if (numInserted<0){
               System.out.println("\nEste número es negativo"); 
            } else if (numInserted>0){
               System.out.println("\nEste número es positivo");
            }
        }
        System.out.println("\nEl número insertado equivale a 0.");
    }
}
