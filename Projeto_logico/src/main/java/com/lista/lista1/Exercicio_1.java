package com.lista.lista1;
import java.util.Scanner;
/*1) Escreva um programa que faça a soma entre 2 números. */

public class Exercicio_1 {
        public static void resolucao(){

            int num_1;
            int num_2;

            System.out.print("Digite o primeiro número: ");
            Scanner scanner = new Scanner (System.in);
            num_1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            num_2 = scanner.nextInt();


            System.out.println("A soma de "+ num_1 + " + " + num_2 + " é: " + (num_1+num_2));

            scanner.close();
        }

}
