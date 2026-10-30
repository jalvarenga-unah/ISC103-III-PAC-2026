/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.videojuego;

/**
 *
 * @author juanalvarenga
 */
public interface Atacante {
    
    // no se pueden definir atributos que cambien su estado
    
    //se pueden definir porpiedades estaticas
    public static int cantidadDanio = 100; // como getter
    
    public void atacar(int danio);
    
    
}
