/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author Administrador
 */
public class Programa01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "León";
        String especie = "Felino";
        String color = "Amarillo";
        int edad = 5;
        
        Comer();
        Dormir();
        Correr();
    }
    
    static public void Comer (){
        System.out.println("Estoy Comiendo");
    }
    
    static public void Dormir (){
        System.out.println("Estoy Durmiendo");
    }
    
    static public void Correr (){
        System.out.println("Estoy Corriendo");
    }
    
}
