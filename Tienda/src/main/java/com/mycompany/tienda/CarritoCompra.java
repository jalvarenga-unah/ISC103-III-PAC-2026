/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author juanalvarenga
 */
public class CarritoCompra {

    // [    ]
//    private ArrayList<Map> productos = new ArrayList();
    private ArrayList<Producto> productos = new ArrayList();
    private double total;

    void pagar(MetodoPago metodoPago) {

        boolean result = metodoPago.procesarPago(this.total);

        if (!result) {
            throw new Error("Error al procesar el pago");
        }

    }

//    void agregarAlCarrito(HashMap producto, int cantidad) {
//
//        if (!producto.containsKey("precio")) {
//            throw new Error("debe enviar el precio");
//        }
//
//        if (!producto.containsKey("nombre")) {
//            throw new Error("debe enviar el nombre");
//        }
//
//        //agregar el producto al carrito
//        this.productos.add(producto);
//
//        //sumarlo al total
//        double precio = Double.parseDouble(producto.get("precio").toString());
//        //   double cantidad = Double.parseDouble(producto.get("cantidad").toString());
//
//        this.total += precio * cantidad;
//    }

    void agregarAlCarrito(Producto producto, int cantidad) {

        this.productos.add(producto);

        this.total += producto.precio * cantidad;

    }

    void quitarDelCarrito(String producto) {

        this.productos.remove(producto);

    }

    List<String> listadoProductos() {
        return null; // [Manzana, Pera, Queso]
    }

}
