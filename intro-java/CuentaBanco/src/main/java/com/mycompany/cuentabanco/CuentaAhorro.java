/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentabanco;

/**
 *
 * @author juanalvarenga
 */
public class CuentaAhorro extends Cuenta {

    double tasaInteres;

    CuentaAhorro(String titular, double saldo, double tasaInteres) {
        //instanciando la clase Padre
        super(titular, saldo); // ➡️ Cuenta(titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    CuentaAhorro(String titular, double saldo) {
        //instanciando la clase Padre
        super(titular, saldo); // ➡️ Cuenta(titular, saldo);
        this.tasaInteres = 0.05;
    }

    void aplicarInteres() {
        
    }

}
