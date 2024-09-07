package com.lista.lista3;

import java.util.Scanner;

/* 5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
algum deles estiver errado o programa deve retornar ao usuário quais das
opções está errada, se é o login ou a senha. O programa deve bloquear o
acesso após 3 tentativas erradas. Quando for a última tentativa ele deve emitir
um alerta: "Última tentativa, mais um erro seu acesso será bloqueado!" */

public class Exercicio_5 {
    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);

        String login_certo = "admin";
        String senha_certa = "123";
        int tentativas = 0;
        int max_tentativas = 3;

        while (tentativas < max_tentativas) {
            System.out.println("Digite o Login: ");
            String login = scanner.nextLine();

            System.out.println("Digite a Senha: ");
            String senha = scanner.nextLine();

            if (login.equals(login_certo) && senha.equals(senha_certa)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativas++;
                if (tentativas == 2) {
                    System.out.println("\nÚltima tentativa, mais um erro seu acesso será bloqueado!\n");
                }
                if (!login.equals(login_certo) && !senha.equals(senha_certa)) {
                    System.out.println("\nLogin e senha errados");
                } else if (!login.equals(login_certo)) {
                    System.out.println("\nLogin errado\n");
                } else if (!senha.equals(senha_certa)) {
                    System.out.println("\nSenha errada\n");
                }
            }
        }

        if (tentativas == max_tentativas) {
            System.out.println("Acesso bloqueado.");
        }

        scanner.close();
    }
}
