package com.lista.lista2;

import java.util.Scanner;

/*8) Crie um joguinho de perguntas e respostas múltipla escolha. O programa
deverá fazer 5 perguntas (Uma por vez). Se ele errar 3 vezes ele perde o jogo. Se
o usuário chegar até o final o programa deve exibir o número de acertos. */

public class Exercicio_8 {
    public static void resolucao(){

       
        int acertos = 0;
        int erros =0 ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Quiz Nerd \nAperte enter para continuar");
      
        
        // Pergunta número 1
        System.out.println("1. Em \"Naruto\", qual é o nome da besta de nove caudas selada dentro de Naruto?");
        System.out.println("a) Shukaku");
        System.out.println("b) Matatabi");
        System.out.println("c) Gyuki");
        System.out.println("d) Kurama");
        System.out.println("e) Isobu");
        
        String pergunta = scanner.nextLine();

        if (pergunta.equals("d") || pergunta.equals("D")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
        }

        //Pergunta 2
        System.out.println("2. Em \"Toy Story\", qual é o nome do cowboy de brinquedo?");
        System.out.println("a) Buzz Lightyear");
        System.out.println("b) Woody");
        System.out.println("c) Jessie");
        System.out.println("d) Slinky Dog");
        System.out.println("e) Sr. Cabeça de Batata");

        pergunta = scanner.nextLine();

        if (pergunta.equals("b") || pergunta.equals("B")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
        }

        //Pergunta 3
        System.out.println("3. Qual é o nome do personagem principal da série \"The Legend of Zelda\"?");
        System.out.println("a) Zelda");
        System.out.println("b) Link");
        System.out.println("c) Ganon");
        System.out.println("d) Sheik");
        System.out.println("e) Midna");

        pergunta = scanner.nextLine();

        if (pergunta.equals("b") || pergunta.equals("B")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
            if (erros >= 3) {
                System.out.println("Você perdeu! Acertou: " + acertos + " e errou: " + erros);
                return;
            }
        }


        //Pergunta 4
        System.out.println("4. Qual é o nome da cidade principal em \"Grand Theft Auto V\" ?");
        System.out.println("a) Liberty City");
        System.out.println("b) Vice City");
        System.out.println("c) San Andreas");
        System.out.println("d) Los Santos");
        System.out.println("e) Las Venturas");
      
        pergunta = scanner.nextLine();

        if (pergunta.equals("d") || pergunta.equals("D")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
            if (erros >= 3) {
                System.out.println("Você perdeu! Acertou: " + acertos + " e errou: " + erros);
                return;
            }
        }


        //Pergunta 5

        System.out.println("Em \"Jurassic Park\", qual é o nome do parque onde os dinossauros são recriados?");
        System.out.println("a) Dinoworld");
        System.out.println("b) Dino Island");
        System.out.println("c) Jurassic Land");
        System.out.println("d) Jurassic World");
        System.out.println("e) Jurassic Park");

        pergunta = scanner.nextLine();

        if (pergunta.equals("e") || pergunta.equals("E")) {
            System.out.println("\nResposta correta!\n\n\n");
            acertos ++;
        } else {
            System.out.println("\nErrou!\n\n\n");
            erros++;
            if (erros >= 3) {
                System.out.println("Você perdeu! Acertou: " + acertos + " e errou: " + erros);
                return;
            }
        }

        if (acertos >= 3) {
            System.out.println("\nParabéns!!!");
            System.out.println("\nVocê ganhou");
            System.out.println("\nVocê acertou: " + acertos + " e errou: "+ erros);
        }
   
         scanner.close();
        
    }

    
}
