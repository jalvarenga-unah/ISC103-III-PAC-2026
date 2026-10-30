/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videojuego;

/**
 *
 * @author juanalvarenga
 */
public class Gerrero extends Personaje implements Atacante {

    public Gerrero(String nombre, int puntosvida) {
        super(nombre, puntosvida);
    }

    @Override
    public void moverse() {
        System.out.printf("%s empezó a correr", this.nombre);
    }

    @Override
    public void atacar(int danio) {
        
//        Atacante.cantidadDanio = 500;// ❌ No es permitido
        
        System.out.println(Atacante.cantidadDanio);

    }

}
