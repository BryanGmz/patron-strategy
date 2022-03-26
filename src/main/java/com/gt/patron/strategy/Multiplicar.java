/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gt.patron.strategy;

/**
 *
 * @author bryan
 */
public class Multiplicar extends Operacion {
    
    @Override
    public void operar() {
        super.setResultado(super.getValorA() * super.getValorB()); 
    }

    @Override
    public void impirmirResultado() {
        System.out.println("El resultado de la multiplicacion es: " + super.getResultado());
    }
    
}
