/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesconstantes;

/**
 *
 * @author Administrador
 */
public class Condicionales {
    public static void main(String[] args) {
        
        double nota1 = 11;
        double nota2 = 15;
        double nota3 = 17.5;
        
        double promedio = (nota1 + nota2 + nota3)/3;
        
        System.out.println("tu promedio es: "+promedio);
        
        if (promedio>15){
            System.out.println("Aprobaste");
        } else if (promedio<=15 && promedio>=11){
            System.out.println("Aprobaste con baja nota");
        } else if (promedio <11){
            System.out.println("Desaprobaste");
        }else{
            System.out.println("Error");
        }
        
    
    }
}
