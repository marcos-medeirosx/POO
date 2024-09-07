package com.lista.lista2;

import java.util.Scanner;

public class Exercicio_2 {
    public static void resolucao(){

/* 2) Desenvolva um algoritmo que seja capaz de receber dois 
números digitados pelo usuário e diga qual deles é maior. */


        int n1, n2;

    System.out.println("Digite um Nº: ");
    Scanner scanner = new Scanner(System.in);
    n1 = scanner.nextInt();

    System.out.println("Digite o segundo Nº: ");
    n2 = scanner.nextInt();

    if (n1 > n2) {
        System.out.println("O " +n1+" é maior que: "+n2);

    } else if (n1 < n2){
        System.out.println("O " +n1+" é menor que: "+n2);
    }

    else{
        System.out.println("Os Nº são iguais.");
    }

    scanner.close();

    }

    
}