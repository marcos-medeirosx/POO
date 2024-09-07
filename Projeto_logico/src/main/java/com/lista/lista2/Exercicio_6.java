package com.lista.lista2;

import java.util.Scanner;

public class Exercicio_6 {
    public static void resolucao() {
        /*6) Crie um programa que receba as notas de um aluno e informe se ele foi
        aprovado ou reprovado. Se o aluno ficar com média acima de 6 nas 2 primeiras
        provas ele passou. Senão o programa deverá perguntar a nota de recuperação
        que irá substituir a menor nota. A pergunta de recuperação deverá aparecer
        somente para os alunos que precisarem */

        
        double nota1, nota2, notaRecuperacao, media, novaMedia;

        System.out.println("Digite a primeira nota: ");
        Scanner scanner = new Scanner(System.in);
        nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextInt();

        media = (nota1+nota2)/2;

        if (media > 6) {
            System.out.println("Aprovado com média: " + media);
            
        } else { System.out.println("Digite a nota da recuperação: ");
                 notaRecuperacao = scanner.nextInt();   
        
           if (nota1 < nota2) {
            nota1 = notaRecuperacao;
           } else {nota2 = notaRecuperacao;
            
           }

           novaMedia = (nota1 + nota2)/2;

           if (novaMedia > 6) {
            System.out.println("Aprovado com média da recuperação: " + novaMedia);
            
           } else { System.out.println("Reprovado após recuperação: " + novaMedia);
            
           }



        }

        scanner.close();

    }

}