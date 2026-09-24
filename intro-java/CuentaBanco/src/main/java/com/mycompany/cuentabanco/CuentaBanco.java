/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cuentabanco;

/**
 *
 * @author juanalvarenga
 */
public class CuentaBanco {

    // El metodo principal / punto de entrada (ejecución)
    public static void main(String[] args) {

        //crear una instancia de la clase Cuenta
        Cuenta miCuenta = new Cuenta("Juan", 100.0);
        Cuenta miCuenta2 = new Cuenta("Juan",60.45);

        System.out.println("=========miCuenta=========");
        System.out.println(miCuenta.titular);
        System.out.println(miCuenta.saldo);

        System.out.println("=========miCuenta2=========");
        System.out.println(miCuenta2.titular);
        System.out.println(miCuenta2.saldo);

    }
}
