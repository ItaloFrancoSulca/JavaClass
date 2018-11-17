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
public class Animal extends SerVivo {

    
    public void Animal(){
        //Constructor
        this.color="SinColor";
        
    }
    
    public void Animal(String nombre, String color, String especie, int edad){
        //Constructor
        this.setNombre(nombre);
        this.setColor(color);
        this.setEspecie(especie);
        this.setEdad(edad);;
        
    }
    
    public void Resumen (){
        System.out.println("nombre: "+getNombre());
        System.out.println("color: "+getColor());
        System.out.println("especie: "+getEspecie());
        System.out.println("edad: "+getEdad());
    }
    
   /* public void Comer(){
        System.out.println("Comer "+this.nombre);
    };
    
    public void Dormir(){
        System.out.println("Dormir "+this.nombre);
    };
    
    public void Correr(){
        System.out.println("Correr "+this.nombre);
    };
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    private String nombre;
    private String especie;
    private String color;
    private int edad;*/
    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    private String especie;
    private String color;
}
