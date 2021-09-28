/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.test;

import com.ceep.domain.Vehiculo;

/**
 *
 * @author jaime
 */
public class PruebaGestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo ("3354FJH","Seat","FR","Negro",80000,true);
        v1.mostrar();
    }
    
}
