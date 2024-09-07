package com.lista.lista2;


import java.util.Scanner;

public class Exercicio_4 {
    public static void resolucao() {
        /*4) Um cliente que promove eventos e solicitou um programa que seja capaz de
         identificar se uma pessoa é maior de idade. Pessoas com menos de 16 anos não
        podem entrar nos eventos. Entre 16 e 18 anos somente acompanhado pelos
        responsáveis. Maiores de 18 podem entrar normalmente. */



        int idade;

        System.out.println("Quantos anos você tem? ");
        Scanner scanner = new Scanner(System.in);
        idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não pode entrar no evento.");

        } else if(idade >= 16 && idade <= 18) { 
            System.out.println("Somente acompanhado pelos responsáveus.");
            
        }else { System.out.println("Entrada liberada.");

            
        }
        
        scanner.close();
    }

}