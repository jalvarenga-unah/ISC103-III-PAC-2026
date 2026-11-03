/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author juanalvarenga
 */
public class Cripto implements MetodoPago {

    private String idWallet;

    @Override
    public boolean procesarPago(double monto, double descuento) {
        return true;
    }

    public Cripto(String idWallet) {
        this.idWallet = idWallet;
    }

}
