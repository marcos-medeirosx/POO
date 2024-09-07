package com.lista.lista3;

import java.util.Scanner;

public class Lista3Application {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n\nSelecione a lista de exercícios que você deseja executar:");
            System.out.println("1 - Exercício 1");
            System.out.println("2 - Exercício 2");
            System.out.println("3 - Exercício 3");
            System.out.println("4 - Exercício 4");
            System.out.println("5 - Exercício 5");
            System.out.println("6 - Exercício 6");
            System.out.println("7 - Exercício 7");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Exercicio_1.resolucao();
                    break;
                case 2:
                    Exercicio_2.resolucao();
                    break;
                case 3:
                    Exercicio_3.resolucao();
                    break;
                case 4:
                    Exercicio_4.resolucao();
                    break;
                case 5:
                    Exercicio_5.resolucao();
                    break;
                case 6:
                    Exercicio_6.resolucao();
                    break;
                case 7:
                    Exercicio_7.resolucao();
                    break;    
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
