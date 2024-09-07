package com.lista.lista1;
import java.util.Scanner;

public class Exercicio_4 {
    public static void resolucao(){
        Scanner scanner = new Scanner(System.in);

        int num1;

        System.out.println("Escreva o número: ");
        num1 = scanner.nextInt();

        System.out.println("Seu sucessor é: "+(num1 + 1));
        System.out.println("Seu antecessor é: "+(num1 - 1));

        scanner.close();

    }

}
