/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraybidimensional;

/**
 *
 * @author Administrador
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] tablaMultiplicar = new int [5][3];
        
        //Bucle de Asignación
        for (int i=0;i<tablaMultiplicar.length;i++){
            for (int j=0;j<tablaMultiplicar[j].length;j++){
                if (j==2){
                    tablaMultiplicar[i][2]=tablaMultiplicar[i][0]*tablaMultiplicar[i][1];
                }else{
                int randomNumb = (int)(Math.random()*100);
                tablaMultiplicar[i][j]=randomNumb;}
            }
        }
        
        //Bucle de Lectura
        /*for (int i=0;i<tablaMultiplicar.length;i++){
            for (int j=0;j<tablaMultiplicar[j].length;j++){
                System.out.println("tabla ["+i+"]["+j+"] = "+tablaMultiplicar[i][j]);
            }
        }*/
        
        //Bucle Formateado
        for(int i =0;i<tablaMultiplicar.length;i++){
            String resultadoFormateado=null;
            resultadoFormateado = tablaMultiplicar[i][0]+" x "+tablaMultiplicar[i][1]+" = "+tablaMultiplicar[i][2];
            System.out.println(resultadoFormateado);
            
        }
    }
}
