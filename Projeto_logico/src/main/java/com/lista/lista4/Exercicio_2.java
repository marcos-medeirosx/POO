package com.lista.lista4;

public class Exercicio_2 {
    public static void resolucao() {
/*2) Agora que voce sabe o fechamento do dia, monte um código que
identifique a compra de menor valor e a compra de maior valor */        


        double[] vendasDoDia = {190.50, 240.75, 323.40, 181.00, 99.30};

       
        double maiorVenda = vendasDoDia[0];
        double menorVenda = vendasDoDia[0];

     
        for (int i = 1; i < vendasDoDia.length; i++) {
            if (vendasDoDia[i] > maiorVenda) {
                maiorVenda = vendasDoDia[i];
            }
            if (vendasDoDia[i] < menorVenda) {
                menorVenda = vendasDoDia[i];
            }
        }

       
        System.out.printf("A maior venda do dia é: R$ %.2f%n", maiorVenda);
        System.out.printf("A menor venda do dia é: R$ %.2f%n", menorVenda);
    }
}
