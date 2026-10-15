/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animals;

/**
 *
 * @author juanalvarenga
 */
public class Animals {

    public static void main(String[] args) {
        
        
        Animal firu = new Perro("Firulais");
        Animal mishi = new Gato("Mishi");
        
        
        
        firu.hacerSonido();
        mishi.hacerSonido();
        
        System.out.println(mishi.toString());
        
        
    }
}
