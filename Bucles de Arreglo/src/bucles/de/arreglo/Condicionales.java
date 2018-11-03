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
public class Condicionales {
    public static void main(String[] args) {
        double sueldo = 930;
        int cantHijos =1;
        
        if(sueldo<1000 && cantHijos>0){
            System.out.println("Necesitas asignación familiar");
        }else{
            System.out.println("No necesita asignación familiar");
        }
        
        String mensaje = (sueldo<1000 && cantHijos>0)? "Necesitas asignación familiar":"No necesita asignación familiar";
        System.out.println(mensaje);
        
    }
}
