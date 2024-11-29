package com.lpoo.atividade01;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o cálculo de área:");
        System.out.println("1 - Retângulo");
        System.out.println("2 - Circunferência");
        System.out.println("3 - Triângulo");
        
        int escolha = scanner.nextInt();

        try {
            switch (escolha) {
                case 1:
                    System.out.println("Digite o lado 1:");
                    
                    double lado1 = scanner.nextDouble();
                    
                    System.out.println("Digite o lado 2:");
                    
                    double lado2 = scanner.nextDouble();
                    
                    System.out.println("Área do Retângulo: " + Area.calculaAreaRetangulo(lado1, lado2));
                    break;

                case 2:
                    System.out.println("Digite o raio:");
                    
                    double raio = scanner.nextDouble();
                    
                    System.out.println("Área da Circunferência: " + Area.calculaAreaCircunferencia(raio));
                    break;

                case 3:
                    System.out.println("Digite a base:");
                    
                    double base = scanner.nextDouble();
                    
                    System.out.println("Digite a altura:");
                    
                    double altura = scanner.nextDouble();
                    
                    System.out.println("Área do Triângulo: " + Area.calculaAreaTriangulo(base, altura));
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
