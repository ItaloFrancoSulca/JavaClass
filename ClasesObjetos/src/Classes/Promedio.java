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
public class Promedio {

    public void Resumen(){
        System.out.println("Nota 1: "+this.nota1);
        System.out.println("Nota 1: "+this.nota1);
        System.out.println("Nota 1: "+this.nota1);
        System.out.println("\nPromedio: "+this.getPromedio());
    }
    
    
    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }
    
    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getPromedio() {
        return  (nota1+nota2+nota3)/3;
    }

    private void setPromedio(int promedio) {
        this.promedio = promedio;
    }
    
    private int nota1;
    private int nota2;
    private int nota3;
    private int promedio;
    
}
