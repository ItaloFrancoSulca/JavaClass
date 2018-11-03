/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles.de.arreglo;

/**
 *
 * @author Administrador
 */
public class Ejercicio {
    public static void main(String[] args) {
        int notaMayor = 0;
        int [] notas = {13,16,18,20,11,16};
        for (int i =0;i<notas.length;i++){
            int actualNumb = notas[i];
            if (actualNumb>notaMayor){
                notaMayor=actualNumb;
            }
        }
        System.out.println("Nota Mayor es "+notaMayor);
    }
}
