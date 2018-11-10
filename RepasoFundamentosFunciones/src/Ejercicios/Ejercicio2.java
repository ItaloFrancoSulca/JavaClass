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
public class Ejercicio2 {
    public static void main(String[] args) {
        
        int n1 = 20;
        int n2 = 18;
        int n3 = 11;
        
        
        
        Operacion(n1, n2, n3);
        
        
    }
    
    static void Operacion (int n1,int n2, int n3){
        
        double resultado = 0;
        resultado = (n1+n2+n3)/3;
        MostrarResultado(resultado);
    }
    
    static void MostrarResultado (double resultado){
       System.out.println("El resultado es "+resultado);
    }
}
