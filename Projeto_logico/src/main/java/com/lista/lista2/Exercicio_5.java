package com.lista.lista2;

import java.util.Scanner;

/*5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
algum deles estiver errado o programa deve retornar ao usuário quais das opções
está errada, se é o login ou a senha. */

public class Exercicio_5 {
    public static void resolucao(){

        String login_certo = "admin";
        String senha_certo = "123";

        System.out.println("Login: ");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();

        System.out.println("Senha: ");
        String senha = scanner.nextLine();

        if (login.equals(login_certo) && senha.equals(senha_certo)) {
            System.out.println("Bem vindo");
           }

        else if (!login.equals(login_certo) && !senha.equals(senha_certo)) {
            System.out.println("Senha e login errados");

        } 

        else if (!login.equals(login_certo)) {
            System.out.println("Login errado");
           }

        else if (!senha.equals(senha_certo)){
            System.out.println("Senha errada");

        }  

        scanner.close();
    
    }

}
