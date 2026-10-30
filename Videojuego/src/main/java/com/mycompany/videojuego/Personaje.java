/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videojuego;

/**
 *
 * @author juanalvarenga
 */
//clase padre
public abstract class Personaje {

    public String nombre;
    public int puntosvida;

    public Personaje(String nombre, int puntosvida) {
        this.nombre = nombre;
        this.puntosvida = puntosvida;
    }

    //sea sobreescrito
    public abstract void moverse();

}
