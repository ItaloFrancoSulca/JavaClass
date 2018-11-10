/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Inserte Nombre:");
        String nombre= Teclado.next();
        SaludoSinNombre();
        SaludoConNombre(nombre);
    }
    
    public static void SaludoSinNombre(){
        System.out.println("Hola");
    }
    
    public static void SaludoConNombre(String nombre){
        System.out.println("Hola " + nombre);
    }
}
