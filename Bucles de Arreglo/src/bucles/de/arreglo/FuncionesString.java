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
public class FuncionesString {
    public static void main(String[] args) {
        String valor1 = "texto en minuscula";
        String valor2 = "TEXTO EN MAYUSCULA";
        
        String compara1 = "ABC";
        String compara2 = "AbC";
        
        String textoBusqueda = "Busca el punto . en este texto";
        String mensajeFacebook = "Este es mi primer mensaje";
        String nuevoMensaje = "";
        
        System.out.println(valor1.toUpperCase());
        System.out.println(valor2.toLowerCase());
        
        if(compara1.equals(compara2)){
          System.out.println("las cadenas son iguales");  
        }
        if(compara1.compareToIgnoreCase(compara2)==0){
            System.out.println("las cadenas son iguales");
    }
        
        for(int i = 0 ; i<textoBusqueda.length();i++){
            char character = textoBusqueda.charAt(i);
            if(character=='.')//usar '' cuando es char
            {
                System.out.println("el . está en la posición "+i);
            }
        }
        
        System.out.println("El punto está en la posición "+textoBusqueda.indexOf("."));
        
        for (int i = 0;i<mensajeFacebook.length();i++){
            char character = mensajeFacebook.charAt(i);
            String a ="";
            if(i%2==0){
                a = String.valueOf(character).toUpperCase();
                }else{
                a = String.valueOf(character).toLowerCase();
                }
            
            nuevoMensaje = nuevoMensaje+a;
            
        }
        System.out.println(nuevoMensaje);
        
    }
}
