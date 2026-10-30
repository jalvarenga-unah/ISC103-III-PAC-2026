/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.videojuego;

/**
 *
 * @author juanalvarenga
 */
public class Videojuego {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
//        Personaje t = new Personaje();
        
        //Una clase abstract no se peude instaciar
        Personaje gandalf = new Mago("Gandalf", 150);
        
        gandalf.moverse();
    }
}
