/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareajavaitalofranco;

/**
 *
 * @author Usuario
 */
public class Tarea7 {
    public static void main(String[] args) {
        int[][] matriz1 = {{1,4,6},{3,8,4},{5,7,2}};
        int[][] matriz2 = {{4,6,2},{7,4,3},{3,9,3}};
        
        System.out.println(matriz1[0][0]+"  "+matriz1[0][1]+"  "+matriz1[0][2]+
                            "       "+matriz2[0][0]+"  "+matriz2[0][1]+"  "+matriz2[0][2]);
        
        System.out.println(matriz1[1][0]+"  "+matriz1[1][1]+"  "+matriz1[1][2]+
                            "   +   "+matriz2[1][0]+"  "+matriz2[1][1]+"  "+matriz2[1][2]);
        
        System.out.println(matriz1[2][0]+"  "+matriz1[2][1]+"  "+matriz1[2][2]+
                            "       "+matriz2[2][0]+"  "+matriz2[2][1]+"  "+matriz2[2][2]);
        
        System.out.println("\n          |\n          V\n");
        
        
        for (int i=0;i<3;i++){
            System.out.println("       "+(matriz1[i][0]+matriz2[i][0])+"  "+
                               (matriz1[i][1]+matriz2[i][1])+"  "+
                               (matriz1[i][2]+matriz2[i][2]));
        }
        }
    }

