package com.sistemascola.menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

public class Professor extends Pessoa implements Login {

    private String usuario;
    private String senha;
    private List<Disciplina> disciplinas;

    public static List<Professor> professores = new ArrayList<>();

    public Professor(int id, String cpf, String nome, String telefone, String email, Endereco endereco, String matricula) {
        super(id, cpf, nome, telefone, email, endereco, matricula);
        this.disciplinas = new ArrayList<>();
    }

    public static void menuProfessor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- MENU PROFESSOR ---\n");

        if (Aluno.listaDeAlunos.isEmpty()) {
            System.out.println("Nenhum aluno matriculado.");
            System.out.println("Digite 0 para retornar ao menu anterior.");
            int opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 0) {
                return;
            }
        } else {
            System.out.println("Selecione o aluno para atribuir notas:");

            for (int i = 0; i < Aluno.listaDeAlunos.size(); i++) {
                System.out.println((i + 1) + " - " + Aluno.listaDeAlunos.get(i).getNome());
            }

            int opcao = -1;
            boolean entradaValida = false;

            while (!entradaValida) {
                System.out.print("Escolha um número: ");
                try {
                    opcao = sc.nextInt();
                    if (opcao < 1 || opcao > Aluno.listaDeAlunos.size()) {
                        System.out.println("Opção inválida. Por favor, escolha um número válido.");
                    } else {
                        entradaValida = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Digite um número.");
                    sc.next();
                }
            }
            sc.nextLine();

            Aluno alunoSelecionado = Aluno.listaDeAlunos.get(opcao - 1);
            System.out.println("Adicione uma nova disciplina:");
            System.out.println("Escolha uma disciplina:");
            for (int i = 0; i < Disciplina.values().length; i++) {
                System.out.println((i + 1) + " - " + Disciplina.values()[i].getNome());
            }

            int disciplinaEscolhida = -1;
            while (disciplinaEscolhida < 1 || disciplinaEscolhida > Disciplina.values().length) {
                System.out.print("Escolha o número da disciplina: ");
                try {
                    disciplinaEscolhida = sc.nextInt();
                    if (disciplinaEscolhida < 1 || disciplinaEscolhida > Disciplina.values().length) {
                        System.out.println("Opção inválida. Por favor, escolha uma disciplina válida.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Digite um número.");
                    sc.next();
                }
            }

            Disciplina disciplinaSelecionada = Disciplina.values()[disciplinaEscolhida - 1];
            Alunodisciplina novaAlunodisciplina = new Alunodisciplina(alunoSelecionado, disciplinaSelecionada, 0, 0, 0, 0);

            double nota1 = obterNota("Digite a nota 1: ");
            double nota2 = obterNota("Digite a nota 2: ");
            double nota3 = obterNota("Digite a nota 3: ");
            double nota4 = obterNota("Digite a nota 4: ");

            novaAlunodisciplina.setNota1(nota1);
            novaAlunodisciplina.setNota2(nota2);
            novaAlunodisciplina.setNota3(nota3);
            novaAlunodisciplina.setNota4(nota4);
            alunoSelecionado.adicionarDisciplina(novaAlunodisciplina);

            System.out.println("Notas e disciplina atribuídas com sucesso!");
        }
    }

    private static double obterNota(String mensagem) {
        Scanner sc = new Scanner(System.in);
        double nota = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print(mensagem);
            try {
                nota = sc.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Deve estar entre 0 e 10.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                sc.next();
            }
        }
        sc.nextLine();
        return nota;
    }

    @Override
    public boolean acessoPermitido(String login, String senha) {
        throw new UnsupportedOperationException("Unimplemented method 'acessoPermitido'");
    }
}
