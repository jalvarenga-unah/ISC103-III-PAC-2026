/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videojuego;

/**
 *
 * @author juanalvarenga
 */
public class Mago extends Personaje implements Atacante,Volador {
    
    public Mago(String nombre, int puntosvida) {
        super(nombre, puntosvida);
    }

    @Override
    public void moverse() {
        System.out.printf("%s empezó a volar", this.nombre);
        
    }

    @Override
    public void atacar(int danio) {
        
    }

    @Override
    public void volar() {
       
    }
    
}
