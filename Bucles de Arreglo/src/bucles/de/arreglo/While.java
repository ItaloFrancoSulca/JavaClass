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
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador = 0;
        while (contador <=12){
            
            if (contador ==5){
                break;
            }
            
            int resultado = contador*3;
            System.out.println("3 x "+contador +" = "+ resultado);
            contador++;  // contador = contador + 1;
        }
        
        
        
    }
    
}
