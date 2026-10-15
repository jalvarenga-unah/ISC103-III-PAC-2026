/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animals;

/**
 *
 * @author juanalvarenga
 */
public class Gato extends Animal {

    String nombre;

    Gato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hacerSonido() {
        //se pude llamar al metodo desde el constructor super
        //para ejecutar el funcionamiento original ademas de
        //las funciones de la sobreescritura
        super.hacerSonido();
        
        System.out.println("Miauuuu");
    }
    
    
    @Override
    public String toString(){
        
        String textoFormateado = String.format("La mascota se llama %s", this.nombre);
        
        
        return textoFormateado;
    }

}
