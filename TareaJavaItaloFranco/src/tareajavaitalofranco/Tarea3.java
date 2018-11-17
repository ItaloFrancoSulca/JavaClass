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
public class Tarea3 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int hour = 100;
        int minute = 100;
        int second = 100;
        
        System.out.println("---Configuración de Reloj---");
        
        while (hour<0||hour>23){
            System.out.println("Inserte una hora válida en relación a 24h");
            hour = teclado.nextInt();
        }
        
        while (minute<0||minute>59){
            System.out.println("Inserte un minuto válido");
            minute = teclado.nextInt();
        }
        
        while (second<0||second>59){
            System.out.println("Inserte un segundo válido");
            second = teclado.nextInt();
        }
        
        int newsecond = second + 1;
        System.out.println("Son las "+hour+":"+minute+":"+newsecond);
    }
}
