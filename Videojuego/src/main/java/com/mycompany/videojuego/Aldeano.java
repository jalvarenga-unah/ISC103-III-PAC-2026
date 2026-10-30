/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videojuego;

/**
 *
 * @author juanalvarenga
 */
public class Aldeano extends Personaje {

    public Aldeano(String nombre, int puntosvida) {
        super(nombre, puntosvida);
    }

    @Override
    public void moverse() {
       System.out.printf("%s empezó a caminar", this.nombre);
    }
    
}
