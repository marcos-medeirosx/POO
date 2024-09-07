package com.lista.lista1;

import java.util.Scanner;

public class Exercicio_5 {
    public static void resolucao() {
       /*  5) Construa um algoritmo que calcule o valor de um 
       terreno baseado na sua área e valor por m2.
       area = comprimento x largura
       preco = precoMetroQuadrado * area*/

        Scanner scanner = new Scanner(System.in);
        double comprimento;
        double largura;
        double area;
        double precoMetroQuadrado;
        double preco;

        System.out.println("Escreva o comprimento: ");
        comprimento = scanner.nextDouble();

        System.out.println("Escreva a largura: ");
        largura = scanner.nextDouble();

        area = largura * comprimento;

        System.out.println("Escreva o preço por metro quadrado: ");
        precoMetroQuadrado = scanner.nextDouble();

        preco = precoMetroQuadrado * area;
        System.out.println("O valor do terreno é: R$ " + preco);

        scanner.close();

    }
}