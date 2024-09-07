package com.lista.lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_8 {
    public static void resolucao() {
/*8) Aproveite os códigos anteriores e implemente a função de impressão
por ordem de preço (crescente). */

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> listaDePrecos = new ArrayList<>();
        int opcao;

        do {
            
            System.out.println("\n--- Lista de Compras ---");
            System.out.println("1. Inserir item e preço");
            System.out.println("2. Ver lista");
            System.out.println("3. Remover item");
            System.out.println("4. Ver lista em ordem de preço (crescente)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    
                    System.out.print("Digite o nome do item: ");
                    String item = scanner.nextLine();
                    System.out.print("Digite o preço do item: R$ ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();  

                    listaDeCompras.add(item);
                    listaDePrecos.add(preco);

                    System.out.println(item + " foi adicionado à lista com o preço de R$ " + String.format("%.2f", preco));
                    break;

                case 2:
                   
                    System.out.println("\nItens na lista de compras:");
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.printf("%d. %s - R$ %.2f%n", (i + 1), listaDeCompras.get(i), listaDePrecos.get(i));
                        }
                    }
                    break;

                case 3:
                    
                    System.out.println("\nItens na lista de compras:");
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.printf("%d. %s - R$ %.2f%n", (i + 1), listaDeCompras.get(i), listaDePrecos.get(i));
                        }
                        System.out.print("Digite o número do item que deseja remover: ");
                        int indice = scanner.nextInt();
                        scanner.nextLine();  

                        if (indice > 0 && indice <= listaDeCompras.size()) {
                            String itemRemovido = listaDeCompras.remove(indice - 1);
                            double precoRemovido = listaDePrecos.remove(indice - 1);
                            System.out.printf("%s foi removido da lista (Preço: R$ %.2f).%n", itemRemovido, precoRemovido);
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;

                case 4:
                    
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                      
                        ArrayList<Double> precosOrdenados = new ArrayList<>(listaDePrecos);
                        ArrayList<String> itensOrdenados = new ArrayList<>(listaDeCompras);

                        
                        for (int i = 0; i < precosOrdenados.size(); i++) {
                            for (int j = i + 1; j < precosOrdenados.size(); j++) {
                                if (precosOrdenados.get(i) > precosOrdenados.get(j)) {
                                     
                                    double tempPreco = precosOrdenados.get(i);
                                    precosOrdenados.set(i, precosOrdenados.get(j));
                                    precosOrdenados.set(j, tempPreco);

                                     
                                    String tempItem = itensOrdenados.get(i);
                                    itensOrdenados.set(i, itensOrdenados.get(j));
                                    itensOrdenados.set(j, tempItem);
                                }
                            }
                        }

                        
                        System.out.println("\nItens na lista de compras (ordem crescente de preço):");
                        for (int i = 0; i < itensOrdenados.size(); i++) {
                            System.out.printf("%d. %s - R$ %.2f%n", (i + 1), itensOrdenados.get(i), precosOrdenados.get(i));
                        }
                    }
                    break;

                case 5:
                  
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
