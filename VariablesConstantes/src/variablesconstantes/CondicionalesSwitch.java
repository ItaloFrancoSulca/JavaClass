/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesconstantes;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class CondicionalesSwitch {
    
    public static void main(String[] args) {
        String diaSemanaTxt =null;
        
        Scanner teclado = new Scanner (System.in); //codigo de teclado (java.until)
        
        System.out.println("Ingrese día de la semana");
        
        int diaDeLaSemana = teclado.nextInt(); //leer tecla
                
        switch (diaDeLaSemana){
        case 1:
            diaSemanaTxt = "Lunes";
            break;
        case 2:
            diaSemanaTxt = "Martes";
            break;
        case 3:
            diaSemanaTxt = "Miercoles";
            break;
        case 4:
            diaSemanaTxt = "Jueves";
            break;
        case 5:
            diaSemanaTxt = "Viernes";
            break;
        case 6:
            diaSemanaTxt = "Sabado";
            break;
        case 7:
            diaSemanaTxt = "Domingo";
            break;
        default:
            diaSemanaTxt = "Error";
            break;
        }
        
        System.out.println("El día "+diaDeLaSemana+" es "+diaSemanaTxt);
    }
}
