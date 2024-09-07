package com.lista.lista2;

import java.util.Scanner;

public class Exercicio_1 {
    public static void resolucao(){

        /* 1) Escreva um programa que recebe um número digitado pelo usuário e responda se o número inserido é par ou ímpar ou 0.*/

 int n;

 System.out.println("Digite um número: ");
 Scanner scanner = new Scanner(System.in);
 n = scanner.nextInt();

 if ( n == 0 ) {
     System.out.println("Esse número é zero.");

 } else if (n % 2 == 0 ) {
    System.out.println("Esse número é par.");
}
else {
    System.out.println("Esse número é ímpar.");

}

    scanner.close();

    }
}