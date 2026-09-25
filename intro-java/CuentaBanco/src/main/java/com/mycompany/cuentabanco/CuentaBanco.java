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
        Cuenta miCuenta2 = new Cuenta("Enrique",400);
        
        System.out.println("=========miCuenta=========");
        System.out.println(miCuenta.getTitular());
        System.out.println(miCuenta.getSaldo());

//        miCuenta2. saldo = 100000;
        miCuenta2.retiro(100);
        
        System.out.println("=========miCuenta2=========");
        System.out.println(miCuenta2.getTitular());
        System.out.println(miCuenta2.getSaldo());
        
    }
}
