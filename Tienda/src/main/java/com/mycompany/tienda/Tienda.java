/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tienda;

/**
 *
 * @author juanalvarenga
 */
public class Tienda {

    public static void main(String[] args) {
     
        
        CarritoCompra miLista = new CarritoCompra();
        
        
        miLista.agregarAlCarrito("Manzana");
        miLista.agregarAlCarrito("Pera");
        miLista.agregarAlCarrito("Quesito");
        
        
        System.out.println(miLista.listadoProductos());
        
    }
}
