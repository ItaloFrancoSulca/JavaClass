/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import Classes.Promedio;
import Classes.Persona;
import Classes.Animal;
import Classes.SerVivo;

/**
 *
 * @author Administrador
 */
public class Programa03 {
    public static void main(String[] args) {
        Promedio _promedio = new Promedio();
        _promedio.setNota1(13);
        _promedio.setNota2(15);
        _promedio.setNota3(16);
        
        _promedio.Resumen();
        
        
        Persona persona = new Persona();
        Animal animal = new Animal();
        //SerVivo serVivo  = new SerVivo();
        
        
    }
}
