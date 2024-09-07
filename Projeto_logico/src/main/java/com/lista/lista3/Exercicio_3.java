package com.lista.lista3;

import java.util.Scanner;

/*) Escreva um código que receba dois números inteiros e escreva todos os
números pares entre eles. */

public class Exercicio_3 {
    public static void resolucao(){

        int numero_1;
        int numero_2;
        int maior;
        int menor;

        System.out.println("Digite um numero:");
        Scanner scanner = new Scanner(System.in);
        numero_1 = scanner.nextInt();

        System.out.println("Digite um segundo numero");
        numero_2 = scanner.nextInt();

        maior = Math.max(numero_1, numero_2);
        menor = Math.min(numero_1, numero_2);

        System.out.println("O intervalo entre " + menor + " e " + maior + " :");

        for (int i = menor; i <= maior; i++) {
            if (i % 2 ==0 ) {
                System.out.println(i);
            }
        }
      
        scanner.close();
     
    }

}