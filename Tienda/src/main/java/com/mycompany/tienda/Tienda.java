/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tienda;

import java.util.ArrayList;

/**
 *
 * @author juanalvarenga
 */
public class Tienda {

    public static void main(String[] args) {

        CarritoCompra miLista = new CarritoCompra();
        
        ArrayList<MetodoPago> metodosDisponibles = new ArrayList();

        miLista.agregarAlCarrito("Manzana");
        miLista.agregarAlCarrito("Pera");
        miLista.agregarAlCarrito("Quesito");
        
        miLista.total = 400.0;

        System.out.println(miLista.listadoProductos());

        TarjetaCredito miTarjeta = new TarjetaCredito("4041-0000-1009-8099");
        
        metodosDisponibles.add(miTarjeta);

        miLista.pagar(miTarjeta);

    }
}
