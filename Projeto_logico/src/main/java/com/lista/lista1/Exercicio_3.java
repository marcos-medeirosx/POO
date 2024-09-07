package com.lista.lista1;

import java.util.Scanner;

/*3) Escreva uma calculadora que receba um valor em reais e
converta para dólar. Considere o valor do dólar a R$5,25. */

public class Exercicio_3 {
    public static void resolucao() {
    
        double real;
        double dolar = 5.25;
        double conversor;

        System.out.println("Digete o valor em Real: ");
        Scanner scanner = new Scanner(System.in);
        real = scanner.nextDouble();


                       conversor = (real/dolar);
        System.out.println("O valor de R$ " + real + " em dolar é de $ " + conversor);

        scanner.close();

    }

}
