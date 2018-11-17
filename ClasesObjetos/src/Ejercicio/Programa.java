/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Administrador
 */
public class Programa {
    public static void main(String[] args) {
        
        
        Cuenta cuenta = new Cuenta();;
        cuenta.Cuenta("Italo", 150);
        cuenta.Ingresar(50);
        cuenta.Retirar(500);
    }
}
