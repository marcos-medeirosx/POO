package com.lista.lista2;

import java.util.Scanner;

public class Exercicio_7 {
    public static void resolucao() {
            /*7) Escreva um programa Identificador de Divisibilidade, isto é, que identifique se
            um determinado número informado pelo usuário é divisível por X (Que também
            deve ser informado pelo usuário) */

        int divisor, numero;

        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();

        System.out.println("Digite um número: ");
        divisor = scanner.nextInt();

        if (divisor==0) {
            System.out.println("Divisor não pode ser zero");
            
        } else {

            if (numero % divisor==0) {
                System.out.println(numero + " é divisível por " + divisor);
                
            } else {
                System.out.println(numero + " não é divisível por " + divisor);
                
            }
            
        }
        
        scanner.close();
    }

}