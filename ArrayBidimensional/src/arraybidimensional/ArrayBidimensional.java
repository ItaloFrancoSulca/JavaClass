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
public class ArrayBidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //DECLARACIÓN MANUAL
        String [][] meses1 = new String [2][6];
        meses1 [0][0]="Enero";
        meses1 [0][1]="Febrero";
        meses1 [0][2]="Marzo";
        meses1 [0][3]="Abril";
        meses1 [0][4]="Mayo";
        meses1 [0][5]="Junio";
        meses1 [1][0]="Julio";
        meses1 [1][1]="Agosto";
        meses1 [1][2]="Septiembre";
        meses1 [1][3]="Octubre";
        meses1 [1][4]="Noviembre";
        meses1 [1][5]="Diciembre";
        
        //DECLARACIÓN FORMATO 2
        String [][] meses2 = {{"Enero","Febrero","Marzo","Abril","Mayo","Junio"},
                             {"Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"}};
        
        //Ver la medida del array
        System.out.println("La longitud es: " + meses2.length +":"+ meses2[0].length);
        
        
       //Print en columnas y filas
        for (int i = 0;i<meses1.length;i++){
            String mesesFormateado = null;
            for (int j = 0;j<meses1[i].length;j++){
                if (mesesFormateado == null){
                mesesFormateado = meses1[i][j];
                }else{mesesFormateado = mesesFormateado + ", "+meses1[i][j];}
                //System.out.println(meses1[i][j]);
            }
            System.out.println(mesesFormateado);
        }
        
         
    }
    
}
