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
public class IDATEducacion extends IntercorpEducacion{

    @Override
    public void CobrarPension() {
        super.CobrarPension(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Aplicar DSCT PRONTO PAGO");
        System.out.println("Aplicar DSCT ALUMNOS BECADOS");
    }
    
    
    
}
