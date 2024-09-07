package com.lista.lista3;

import java.util.Scanner;

/*1) Escreva um programa que sirva como um cronômetro. O usuário deve
digitar um numero em segundos e o programa deve contabilizar os segundos
digitados. O programa deve receber somente números entre 1 e 59, do
contrário ele retornar um erro e solicitar que o usuário digite um número válido. */

public class Exercicio_1 {
    public static void resolucao() throws InterruptedException {
        
    int segundos = 0;

    Scanner scanner = new Scanner(System.in);



 do { 
    System.out.println("Digite um nº entre 1 e 59: ");
    segundos = scanner.nextInt();
       
    if (segundos < 1 || segundos > 59) {
        System.out.print("Você digitou o nº errado.\n");
    }
   
 } while (segundos < 1 || segundos > 59);

        
    System.out.println("Iniciando cronometro de " + segundos + " segundos");

        
    for (int i = 0; i <= segundos;i++) {
        System.out.println(i+" Segundos");     
        Thread.sleep(1000);
    }
    //mensagem final
    System.out.println("Tempo esgotado!");

    scanner.close(); 

   }
   

}

