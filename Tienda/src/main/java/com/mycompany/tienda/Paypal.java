/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author juanalvarenga
 */
public class Paypal implements MetodoPago {
    
    private String correo;

    public Paypal(String correo) {
        this.correo = correo;
    }
    
    
    

    @Override
    public boolean procesarPago(double monto) {

        return true;
    }

}
