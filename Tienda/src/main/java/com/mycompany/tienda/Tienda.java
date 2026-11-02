/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tienda;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author juanalvarenga
 */
public class Tienda {

    public static void main(String[] args) {

        CarritoCompra carritoCompra = new CarritoCompra();

        ArrayList<MetodoPago> metodosDisponibles = new ArrayList();

        HashMap p1 = new HashMap();
        p1.put("nombre", "Manzana");
        p1.put("precio", 40);
        
        
        p1.put("cantidad", 3);

        HashMap p2 = new HashMap();
        p2.put("nombre", "Pera");
        p2.put("precio", 30);
        
        

        carritoCompra.agregarAlCarrito(p1,4);
        carritoCompra.agregarAlCarrito(p2, 5);

      

        System.out.println(carritoCompra.listadoProductos());

        TarjetaCredito miTarjeta = new TarjetaCredito("4041-0000-1009-8099");

        metodosDisponibles.add(miTarjeta);

        carritoCompra.pagar(miTarjeta);

    }
}
