/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentabanco;

/**
 *
 * @author juanalvarenga
 */
public class CuentaCheque extends Cuenta {

    double limiteSobregiro;

    //constantes (final) en otros lenguajes es "const"
    final double tasaInteres = 0.01; // propiedad a nivel de Clase

    CuentaCheque(String titular, double saldo, double limiteSobregiro) {
        super(titular, saldo);
        this.limiteSobregiro = limiteSobregiro;

//        tasaInteres = 10;// ❌ no se puede reasignar el valor
    }

    void emitirCheque() {

    }

}
