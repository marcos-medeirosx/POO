package com.lista.lista1;

import java.util.Scanner;

public class Exercicio_6 {
    public static void resolucao() {
        /* 6) Construa um algoritmo que leia 1- a distância percorrida
        por um veículo em km 2- o total gasto em combustível em
        litros. No final deverá ser respondido o consumo médio deste
        veículo em km/l. */

        Scanner scanner = new Scanner(System.in);
        int distanciaKM;
        int combustivelGasto;

        int consumoMedio;

        System.out.println("Digite a distância percorrida em KM: ");
        distanciaKM = scanner.nextInt();

        System.out.println("Digite o total de combustivel gasto: ");
        combustivelGasto = scanner.nextInt();

        consumoMedio = distanciaKM/combustivelGasto;

        System.out.println("O consumo médio do veiculo é: " + consumoMedio + " km/l");

        scanner.close();
    }
}