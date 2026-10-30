/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author juanalvarenga
 */
public class TarjetaCredito implements MetodoPago {

    private String numeroTarjeta;

    TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean procesarPago(double monto) {

        String cardMask = String.format("xxxxxxxxxxxx%s", numeroTarjeta.substring(numeroTarjeta.length() - 4));
        
        
        
        System.out.printf("Pagando con la tarjeta: %s la cantidad de %f", cardMask, monto);

        return true;
    }

}
