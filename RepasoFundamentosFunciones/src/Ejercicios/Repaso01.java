/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Administrador
 */
public class Repaso01 {
    
    static final double dsct = 0.15;
    
    public static void main(String[] args) {
        double precioP1 = 500;
        double precioP2 = 700.50;
        double precioP3 = 50.25;
        
        int cantidadDeCompra=12;
        
        double totalP1 = precioP1 * cantidadDeCompra;
        double totalP2 = precioP2 * cantidadDeCompra;
        double totalP3 = precioP3 * cantidadDeCompra;
        
        double totalProductos = totalP1 + totalP2 + totalP3;
        
        double totalDsct = totalProductos * dsct;
        double precioTotal = totalProductos - totalDsct;
        
        System.out.println("El total del producto 1 es "+totalP1);
        System.out.println("El total del producto 2 es "+totalP2);
        System.out.println("El total del producto 3 es "+totalP3);
        
        System.out.println("El costo total es "+totalProductos);
        System.out.println("Con el descuento se ahorra "+totalDsct);
        System.out.println("El precio final es "+precioTotal);
    }
    
}
