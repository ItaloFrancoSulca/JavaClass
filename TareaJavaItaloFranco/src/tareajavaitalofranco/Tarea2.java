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
public class Tarea2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        String monthTxt = null;
        
        System.out.println("---Configuración de Calendario---");
        
        while (day<1||day>30){
            System.out.println("Inserte un día válido");
            day = teclado.nextInt();
        }
        
        while (month<1||month>12){
            System.out.println("Inserte un número de mes válido");
            month = teclado.nextInt();
        }
        
        while (year<1900||year>2018){
            System.out.println("Inserte un año válido");
            year = teclado.nextInt();
        }
        
        //IdentificarMes
        switch (month){
            case 1:
                monthTxt = "Enero";
                break;
            case 2:
                monthTxt = "Febrero";
                break;
            case 3:
                monthTxt = "Marzo";
                break;
            case 4:
                monthTxt = "Abril";
                break;
            case 5:
                monthTxt = "Mayo";
                break;
            case 6:
                monthTxt = "Junio";
                break;
            case 7:
                monthTxt = "Julio";
                break;
            case 8:
                monthTxt = "Agosto";
                break;
            case 9:
                monthTxt = "Septiembre";
                break;
            case 10:
                monthTxt = "Octubre";
                break;
            case 11:
                monthTxt = "Noviembre";
                break;
            case 12:
                monthTxt = "Diciembre";
                break;
            default:
                System.out.println("Número de mes no válido");
                break;
        }
        
        //Final
        System.out.println("Es el día "+day+" del mes de "+monthTxt+" del año "+year);
    }
    
}
