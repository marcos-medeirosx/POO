package com.lista.lista4;

public class Exercicio_1 {
    public static void resolucao() {
/*1) Voce é gerente de um supermercado e sabe que os valores das
vendas do dia são gravados em um vetor. Digite um código que faça o
fechamento (soma) de vendas do dia de maneira automatizada. */        


double[] vendasDoDia = {190.50, 240.75, 323.40, 181.00, 99.30};

       
        double somaVendas = 0;

        
        for (int i = 0; i < vendasDoDia.length; i++) {
            somaVendas += vendasDoDia[i];
        }

       
        System.out.printf("O fechamento de vendas do dia é: R$ %.2f%n", somaVendas);


    }

}
