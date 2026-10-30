/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.estructuras;

import java.util.HashMap;

/**
 *
 * @author juanalvarenga
 */
public class Estructuras {

    public static void main(String[] args) {

        //una instancia
        Operaciones op = new Operaciones();
        op.tipo = "suma";
//        op.pi = 5.5; // ❌ es una constante

        System.out.println(Operaciones.tipo);
        System.out.println(Operaciones.PI);
        System.out.println(Operaciones.sumar(3, 6));

        //ArrayList, List
        // [5,3,8,9,0]
        //objeto con elementos mde tipo: clave - valor
        HashMap<String, Object> mascota = new HashMap();
        HashMap<String, Object> user = new HashMap();

        user.put("id", 1);
        user.put("name", "Juan");

        HashMap<String, Object> address = new HashMap();

        address.put("city", "SPS");

        user.put("address", address);

//        mascota.put(true, false);
//        mascota.put(3, 10);
        mascota.put("nombre", "Apolo");
        mascota.put("edad", 4);
//        mascota.put("op",o); // es válido

        System.out.println(mascota.get("edad"));

    }
}
