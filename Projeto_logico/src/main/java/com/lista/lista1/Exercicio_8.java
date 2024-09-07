package com.lista.lista1;

import java.util.Scanner;

public class Exercicio_8 {
    public static void resolucao() {
        /* 8)Suponha que voce trabalhe em um laboratório e seu
             colega mediu a temperatura de um objeto em Fahrenheit.
                Escreva um programa capaz de converter em Celsius */

        Scanner sc = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.println("Leia os graus celsius: ");
        fahrenheit = sc.nextDouble();

        celsius = ((fahrenheit - 32)/1.8);

        System.out.printf("Celsius: %.2f", celsius);
        sc.close();
    }
}
