package com.lista.lista3;

import java.util.Scanner;

/*4) Jogo da adivinhação. Peça para alguém escolher um número. Depois peça
para outra pessoa tentar adivinhar. O programa deverá retornar dicas como:
"Muito baixo, muito alto ou quase lá" ou "tá quente, tá frio". */

public class Exercicio_4 {
    public static void resolucao() {

        int numero;
        int numero_adivinhar;

        System.out.println("Jogo da advinhação");
        System.out.println("Digite um numero para que outra pessoa tente advinhar:");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();

        for (int i = 1;  i <= 50 ; i++) {
            System.out.println();
        }

      
       do {  
        System.out.println("Tente advinhar o numero que alguém escolheu");
       numero_adivinhar = scanner.nextInt();
        
        if (numero_adivinhar == numero) {
            System.out.println("Acertou! Parabéns!");
        } 
        else if (Math.abs(numero - numero_adivinhar) <=2) {
            System.out.println("Quase, ta muito perto");
        }
        else if (Math.abs(numero - numero_adivinhar) <=5) {
            System.out.println("ta perto já");
        }
        else if (Math.abs(numero - numero_adivinhar) <=10) {
            System.out.println("perto mas nem tanto ");
        }
        else if (numero > numero_adivinhar) {
            System.out.println("Ixi, tá muito baixo");
        }
        else  {
            System.out.println("Eita, tá muito alto");
        }
    

       } while (numero_adivinhar != numero);

       scanner.close();
       
    }

}
