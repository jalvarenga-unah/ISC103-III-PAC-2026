/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica01;

/**
 *
 * @author juanalvarenga
 */
public class Practica01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //String marca, String modelo, double cantidadCombustible, double capacidadCarga
        Camioneta prado = new Camioneta("Toyota","Land cruiser Prado", 120, 2500);
        
        System.out.println(prado.cargarVehiculo(1500));
        
        System.out.println(prado.getCargaDisponible());
        
        System.out.println(prado.cargarVehiculo(1000));
        
        System.out.println(prado.getCargaDisponible());
        
        System.out.println("======= zona de descarga ============");
        
        prado.bajarCarga(1500);
//        prado.bajarCarga(1100);
//        prado.bajarCarga(1500);
//        prado.bajarCarga(1500);
        System.out.println(prado.getCargaDisponible()); 
        
        prado.cargarVehiculo(500);
        
        System.out.println(prado.getCargaDisponible()); 
        
    }
}
