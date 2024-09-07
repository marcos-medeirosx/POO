package com.lista.lista3;

import java.util.Scanner;

public class Exercicio_6 {
    public static void resolucao(){

        /*6) Escreva um programa que seja capaz de desenhar uma pirâmide de
        asteriscos. O usuário deverá informar quantos andares ele deseja que a
        pirâmide tenha. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura da pirâmide:");
        int altura = scanner.nextInt();
        //              i=1  for menor ou igual a altura, supondo que seja 4..
        //               1 <= 4
        for (int i = 1; i <= altura; i++) {
           // vazio = 0        0 < 4     
            for (int vazio = 0; vazio < altura - i; vazio++) {
                System.out.print(" ");
            }
           
            for (int ast = 0; ast < 2 * i - 1; ast++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        scanner.close();
    }
}
