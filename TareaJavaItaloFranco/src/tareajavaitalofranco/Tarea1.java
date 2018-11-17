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
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int nota = 100;
        
        while (nota<0||nota>20){
        
            System.out.println("Inserte una nota");
            nota = teclado.nextInt();
            
            if (nota>=0 && nota<=12){
                System.out.println("Puntaje Insuficiente");
            }else if (nota>=13 && nota<=16){
                System.out.println("Puntaje Suficiente");
            }else if (nota>=17 && nota<=20){
                System.out.println("Puntaje Excelente");
            }else {
                System.out.println("Nota no válida");
            }
        
        }
        
    }
    
}
