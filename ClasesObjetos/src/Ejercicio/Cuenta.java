/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Cuenta {
    
    public void Cuenta (String titular, int montoActual){
        this.setTitular(titular);
        this.setMontoActual(montoActual);
        
        System.out.println("Bienvenido "+titular+", su monto actual es de "+montoActual+".");
    }
            
    
    public void Ingresar(double monto){
        if (monto>=0){
        this.setMontoActual(montoActual+monto);
        System.out.println("Usted ha ingresado "+monto+
                            " por lo cual ahora tiene "+montoActual);
        return; //esto remplaza al else
        }
        System.out.println("El monto ingresado es inválido");
        
        
    }
    
    public void Retirar (double monto){
        this.setMontoActual(montoActual-monto);
        
        if (montoActual<0){
                montoActual=0;
                }
        System.out.println("Usted ha retirado "+monto+
                            " por lo cual ahora tiene "+montoActual);
    }
    
    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public double getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }
    private String Titular;
    private double montoActual;
}
