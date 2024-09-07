package com.lista.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_5 {
    public static void resolucao() {
/*5) Escreva um programa que sirva como uma lista de compras de
mercado. Você irá criar um menu que pergunte se o usuário quer inserir
um item ou ver a lista.  */

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();
        int opcao;

        do {
            
            System.out.println("\n--- Lista de Compras ---");
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                  
                    System.out.print("Digite o nome do item: ");
                    String item = scanner.nextLine();
                    listaDeCompras.add(item);
                    System.out.println(item + " foi adicionado à lista.");
                    break;

                case 2:
                  
                    System.out.println("\nItens na lista de compras:");
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                        }
                    }
                    break;

                case 3:
                 
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
