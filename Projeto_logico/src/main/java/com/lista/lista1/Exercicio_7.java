package com.lista.lista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {
    public static void resolucao() {
        /* 7) Escreva um programa que receba quatro notas de um
        aluno e calcule a média aritmética dessas notas.*/

        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        String nome;
        double n1, n2, n3, n4, media;

        System.out.println("Escreva o nome do estudante: ");
        nome = sc.nextLine();

        System.out.println("Escreva a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.println("Escreva a segunda nota: ");
        n2 = sc.nextDouble();
        System.out.println("Escreva a terceira nota: ");
        n3 = sc.nextDouble();
        System.out.println("Escreva a quarta nota: ");
        n4 = sc.nextDouble();

        media = (n1 + n2 + n3 + n4)/4;

        System.out.println("A media do aluno " + nome + " é:  "+ media);



        sc.close();

    }
}