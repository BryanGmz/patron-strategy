/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gt.patron.strategy;

/**
 *
 * @author bryan
 */
public class Ejecutor {
    
    public void ejecutarOperacion(Operacion operacion) {
        operacion.operar();
    }
    
    public void imprimirResultado(Operacion operacion) {
        operacion.impirmirResultado();
    }
}
