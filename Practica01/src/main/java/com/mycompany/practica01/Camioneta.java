/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica01;

/**
 *
 * @author juanalvarenga
 */
public class Camioneta extends Vehiculo {

    //atributos
    String modelo;
    private double capacidadCarga;
    final private double capacidadMaxima;

    Camioneta(String marca, String modelo, double cantidadCombustible, double capacidadCarga) {
        super(marca, cantidadCombustible);

        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
        this.capacidadMaxima = capacidadCarga;
    }

    String getModelo() {
        return this.modelo;
    }

    double getCargaDisponible() {
        return this.capacidadCarga;
    }

    // no puede ser carga negativa ❌
    // no puede exceder los 2500 ❌
    // vehicula cargado, capacidad libre: XXX ✅
    double cargarVehiculo(double carga) {

        if (carga > this.capacidadCarga) {

            throw new Error("la cantidad supera la capacidad de carga");
        }

        if (carga < 0) {
            throw new Error("la cantidad tiene un valor incorrecto");
        }

        //actualizar la carga
        this.capacidadCarga = this.capacidadCarga - carga;

        return this.capacidadCarga;

        // la capacidad restante
//        return this.capacidadCarga -= carga; // 2500 - 1000 = 1500
    }

    double bajarCarga(double carga) {
        
        if(carga > (this.capacidadMaxima - this.capacidadCarga)){
            throw new Error("la cantidad supera la capacidad de carga");
        }

        if (carga < 0) {
            throw new Error("la cantidad tiene un valor incorrecto");
        }

        return this.capacidadCarga += carga;
    }

}
