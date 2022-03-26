/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gt.patron.strategy;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Calculadora {
    
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        
        // Ejecutor 
        Ejecutor ejecutor = new Ejecutor();
        
        // Operaciones
        Operacion suma = new Suma();
        Operacion resta = new Restar();
        Operacion multiplicacion = new Multiplicar();
        
        int operacion, valorA, valorB;
        while (continuar) {
            System.out.println("\n----------- Calculadora -----------");
            System.out.println("Ingrese el numero de operacion a realizar: \n1. Sumar \n2. Restar \n3. Multiplicar \nCualquier otro numero para salir.");
            operacion = scanner.nextInt();
            if (operacion > 3 || operacion < 1) break;
            System.out.println ("");
            System.out.println("Ingrese el primer numero: ");
            valorA = scanner.nextInt();
            
            System.out.println("Ingrese el segundo numero: ");
            valorB = scanner.nextInt();
            
            switch(operacion){
                case 1:
                    suma.setValorA(valorA);
                    suma.setValorB(valorB);
                    ejecutor.ejecutarOperacion(suma);
                    ejecutor.imprimirResultado(suma);
                    break;
                case 2:
                    resta.setValorA(valorA);
                    resta.setValorB(valorB);
                    ejecutor.ejecutarOperacion(resta);
                    ejecutor.imprimirResultado(resta);
                    break;
                case 3:
                    multiplicacion.setValorA(valorA);
                    multiplicacion.setValorB(valorB);
                    ejecutor.ejecutarOperacion(multiplicacion);
                    ejecutor.imprimirResultado(multiplicacion);
                    break;
            }
        }
    }
    
}
