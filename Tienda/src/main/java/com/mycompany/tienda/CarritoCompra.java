/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

import java.util.ArrayList;

/**
 *
 * @author juanalvarenga
 */
public class CarritoCompra {
    
    public ArrayList<String> productos;
    public double total;
    
    
    void Pagar(MetodoPago metodoPago){
    
       boolean result =  metodoPago.procesarPago(this.total);
       
       if(!result){
           throw new Error("Error al procesar el pago");
       }
        
    }
    
}
