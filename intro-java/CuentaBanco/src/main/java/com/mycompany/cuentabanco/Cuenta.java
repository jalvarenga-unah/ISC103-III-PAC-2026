/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentabanco;

/**
 *
 * @author juanalvarenga
 */
public class Cuenta {

    public String titular;
    public double saldo;

    //solicitar los parametros para realizar la inicializacion de las propiedades
    //argumentos posicionales
    
    //Constructor "Firma 1"
    public Cuenta(String titular, double saldo) {
        // String titular="test";
        //asignar el valor que viene en el argumento
        this.titular = titular;
        this.saldo = saldo;

    }

    //Constructor "Firma 2"
    Cuenta(String titular) {

        //this == Cuenta
        this(titular, 0.0);

//        this.titular = titular;
//        this.saldo = 0.0;
    }

}
