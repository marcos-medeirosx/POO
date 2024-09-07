package com.lista.lista3;

import java.util.Scanner;

/*2) Desenvolva um programa que receba um número do usuário e escreva a
tabuada dele.  */

public class Exercicio_2 {
    public static void resolucao() {
        
        int numero = 0;

        System.out.println("Digite um número:");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();

        for (int i = 1;  i <= 10 ; i++) {
            System.out.println(i + " * " + numero +" = " + (i*numero) );
        }

        scanner.close();
    }
}
