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

    private String titular;
    private double saldo;

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

    //getters y setters
    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }
//
//    void setSaldo(double saldo) {
//        this.saldo = saldo;
//    }

    void retiro(double monto) {

        if (monto < 0) {
            throw new ArithmeticException("El monto ingresado debe ser mayor a cero");
        }

        if (monto > this.saldo) {
            throw new Error("Fondos insuficientes");
        }

        if (monto > 5000) {
            throw new NullPointerException("Operación no permitida");
        }

        this.saldo = this.saldo - monto;

//        if (this.saldo >= monto) {
//
//            this.saldo = this.saldo - monto;
//        } else {
//            //no se pudo
//        }
    }

    void deposito(double monto) {

//        if (monto < 0) {
//            //No se puede
//            return;
//        }
//
//        if (monto > 5000) {
//            //tampoco se puede
//            return;
//        }
        if (monto < 0 || monto > 5000) {
            throw new Error("El monto ingresado no es válido");
        }

        this.saldo = this.saldo + monto;
    }

}
