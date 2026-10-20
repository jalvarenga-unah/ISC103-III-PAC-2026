/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanalvarenga
 */
public class CarritoCompra {
    
    // [    ]
    private ArrayList<String> productos = new ArrayList();
    public double total;
    
    
    void pagar(MetodoPago metodoPago){
        
       boolean result =  metodoPago.procesarPago(this.total);
       
       if(!result){
           throw new Error("Error al procesar el pago");
       }
        
    }
    
    
    void agregarAlCarrito( String producto ){
   
        this.productos.add(producto);
    }
    
    
    void quitarDelCarrito(String producto){
        
        this.productos.remove(producto);

    }
    
    
    List<String>  listadoProductos(){
        return this.productos;
    }
    
}
