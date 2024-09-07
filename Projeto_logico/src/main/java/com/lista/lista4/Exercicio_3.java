package com.lista.lista4;

public class Exercicio_3 {
    public static void resolucao() {
/*3) Ainda utilizando o exercício do mercado, calcule o ticket médio de
vendas do dia */        

        double[] vendasDoDia = {190.50, 240.75, 323.40, 181.00, 99.30};

      
        double somaVendas = 0;
        for (int i = 0; i < vendasDoDia.length; i++) {
            somaVendas += vendasDoDia[i];
        }

        
        double ticketMedio = somaVendas / vendasDoDia.length;

       
        System.out.printf("O ticket médio das vendas do dia é: R$ %.2f%n", ticketMedio);
    }
}
