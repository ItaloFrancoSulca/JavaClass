/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import Classes.Animal;

/**
 *
 * @author Administrador
 */
public class Programa02 {
    public static void main(String[] args) {
        Animal leon = new Animal();
        /*leon.setNombre("Leon");
        leon.setEspecie("Felino");
        leon.setEdad(5);
        leon.setColor("Amarillo");
        leon.Comer("carne");
        leon.Dormir();
        leon.Correr();*/
        leon.Animal("Leon", "naranja", "felino", 5);
        leon.Resumen();
        
        /*Animal tortuga = new Animal();
        tortuga.setNombre("Tortuga");
        tortuga.setEspecie("no se");
        tortuga.setEdad(2);
        tortuga.setColor("Verde");
        tortuga.Comer();
        tortuga.Dormir();
        tortuga.Correr();*/
        leon.Animal("Tortuga", "verde", "no se", 2);
        leon.Resumen();
        
        Animal perro = new Animal();
        perro.Animal("Fido","Marrón","no se",1);
        perro.Resumen();
        
        
    }
    
}
