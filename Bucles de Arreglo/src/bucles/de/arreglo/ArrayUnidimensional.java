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
public class ArrayUnidimensional {
    public static void main(String[] args) {
        Ejercicio1();
        Ejercicio2();
    }
    
    static void Ejercicio1 (){
        String[] diasLaborales = new String [5];
        diasLaborales [0]="Lunes";
        diasLaborales [1]="Martes";
        diasLaborales [2]="Miercoles";
        diasLaborales [3]="Jueves";
        diasLaborales [4]="Viernes";
        
        String Miercoles = diasLaborales [2];
        
        for(int i=0;i<diasLaborales.length;i++){
            System.out.println(diasLaborales[i]);
        }
        
    }
    
    static void Ejercicio2 (){
        int[] notas = {20,15,13,18};
        
        int promedio=0;
        for (int i =0;i<notas.length;i++){
            promedio = promedio + notas[i];
        }
        promedio = promedio / notas.length;
        
        System.out.println("Promedio = "+promedio
        );
    }
}
