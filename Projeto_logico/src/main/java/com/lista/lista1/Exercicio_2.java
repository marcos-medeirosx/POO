package com.lista.lista1;
import java.util.Scanner;
/*2) Escreva um programa que pergunte o nome e o
sobrenome do usuário e escreva na tela: "Olá, -usuário-". */


public class Exercicio_2 {
    public static void resolucao(){

        String nome;
        String sobrenome;
        
        System.out.println("Digite o seu nome: ");
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println("Olá, usuário: " + nome + " " + sobrenome);

        scanner.close();
    }



}
