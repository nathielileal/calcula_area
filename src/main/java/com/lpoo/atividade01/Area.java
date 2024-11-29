package com.lpoo.atividade01;

public class Area {

    public static double calculaAreaRetangulo(double lado1, double lado2) {
        if (lado1 < 0 || lado2 < 0) {
            throw new RuntimeException("Os lados não podem ser negativos.");
        }
        
        return lado1 * lado2;
    }

    public static double calculaAreaCircunferencia(double raio) {
        if (raio < 0) {
            throw new RuntimeException("O raio não pode ser negativo.");
        }
        
        return Math.PI * Math.pow(raio, 2);
    }

    public static double calculaAreaTriangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            throw new RuntimeException("A base e a altura não podem ser negativas.");
        }
        
        return (base * altura) / 2;
    }

}
