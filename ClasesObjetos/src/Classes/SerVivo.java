/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Administrador
 */
public abstract class SerVivo {

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    private int edad;
    private String nombre;
    
    public void Correr(){
        
    }
    public void Dormir(){
        
    }
    public void Comer(){
        
    }
    
    public void Comer(String platillo){
        System.out.println("Comiendo "+platillo);
    }
}

