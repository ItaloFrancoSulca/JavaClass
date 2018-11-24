/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author Administrador
 */
import Classes.IDATEducacion;
import Classes.IntercorpEducacion;
import Classes.UTPEducacion;

public class Programa01 {
    public static void main(String[] args) {
        IntercorpEducacion Idat = new IDATEducacion();
        IntercorpEducacion Utp = new UTPEducacion();
        
        
        System.out.println("PENSION");
        Idat.CobrarPension();
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        Utp.CobrarPension();
    }
}
