package com.sistemascola.menu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno extends Pessoa {

    private static final Scanner sc = new Scanner(System.in);
    private Turma turma;
    private LocalDateTime matriculadoEm;
    public static List<Aluno> listaDeAlunos = new ArrayList<>();
    private List<Alunodisciplina> listaDisciplinas = new ArrayList<>();


    public Aluno() {

    }
    public Aluno(int id, String cpf, String nome, String telefone, String email,
        Endereco endereco, String matricula, Turma turma) {
        super(id, cpf, nome, telefone, email, endereco, matricula);
        this.turma = turma;
        this.matriculadoEm = LocalDateTime.now();
    }

    public void adicionarDisciplina(Alunodisciplina disciplina) {
        listaDisciplinas.add(disciplina);
    }

    public static void menuAluno() {
        int opcao = -1;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                if (listaDeAlunos.isEmpty()) {
                    System.out.println("Nenhum aluno matriculado.");
                    System.out.println("Digite 0 para retornar ao menu anterior.");
                    opcao = sc.nextInt();
                    sc.nextLine();
                    if (opcao == 0) break;
                } else {
                    System.out.println("\n--- MENU ALUNO ---");
                    System.out.println("Selecione o aluno para consultar notas:");
                    for (int i = 0; i < listaDeAlunos.size(); i++) {
                        System.out.println((i + 1) + " - " + listaDeAlunos.get(i).getNome());
                    }
                    System.out.print("Escolha um número (ou 0 para retornar): ");
                    opcao = sc.nextInt();
                    sc.nextLine();
                    if (opcao == 0) break;
                    Aluno alunoSelecionado = listaDeAlunos.get(opcao - 1);
                    if (alunoSelecionado.getListaDisciplinas().isEmpty()) {
                        System.out.println("Este aluno não está inscrito em nenhuma disciplina.");
                    } else {
                        System.out.println("Notas de " + alunoSelecionado.getNome() + ":\n");
                        for (Alunodisciplina ad : alunoSelecionado.getListaDisciplinas()) {
                            System.out.println("| Disciplina: " + ad.getDisciplina().getNome());
                            System.out.println("| Nota 1: " + ad.getNota1());
                            System.out.println("| Nota 2: " + ad.getNota2());
                            System.out.println("| Nota 3: " + ad.getNota3());
                            System.out.println("| Nota 4: " + ad.getNota4());
                            System.out.println("| Média: " + (ad.getNota1() + ad.getNota2() + ad.getNota3() + ad.getNota4()) / 4);
                            System.out.println("|_______________________");
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                sc.next();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Opção inválida. Selecione um aluno válido.");
            }
            if (opcao != 0) {
                System.out.println("\nPressione Enter para continuar...");
                sc.nextLine();
                //sc.nextLine();
            }
        } while (opcao != 0);
    }

    public static void cadastrarNovoAluno() {
        System.out.println("- CADASTRAR ALUNO -\n");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        Turma turmaSelecionada = null;
        while (turmaSelecionada == null) {
            System.out.println("Escolha a turma para o aluno:");
            for (int i = 0; i < Turma.listaDeTurmas.size(); i++) {
                System.out.println((i + 1) + " - " + Turma.listaDeTurmas.get(i).getNumero());
            }
            int escolhaTurma = -1;
            try {
                escolhaTurma = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                sc.next();
            }

            if (escolhaTurma >= 1 && escolhaTurma <= Turma.listaDeTurmas.size()) {
                turmaSelecionada = Turma.listaDeTurmas.get(escolhaTurma - 1);
            } else {
                System.out.println("Escolha de turma inválida. Tente novamente.");
            }
        }

        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setCpf(cpf);
        aluno.setMatricula(matricula);
        aluno.setTurma(turmaSelecionada);
        aluno.setMatriculadoEm(LocalDateTime.now());

        listaDeAlunos.add(aluno);
        turmaSelecionada.adicionarAluno(aluno);

        System.out.println("Aluno cadastrado com sucesso!\n");
    }

    public static void deletarAluno() {
        System.out.println("-DELETAR ALUNO-");
        if (listaDeAlunos.isEmpty()) {
            System.out.println("Nenhum aluno registrado.");
        } else {
            System.out.println("\nAlunos:");
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                System.out.println((i + 1) + " - " + listaDeAlunos.get(i).getNome());
            }
            System.out.print("Digite o número do aluno que deseja deletar: ");
            int numeroDeletar = sc.nextInt();
            sc.nextLine();
            if (numeroDeletar > 0 && numeroDeletar <= listaDeAlunos.size()) {
                listaDeAlunos.remove(numeroDeletar - 1);
                System.out.println("Aluno deletado com sucesso.");
            } else {
                System.out.println("Número inválido.");
            }
        }
    }
    public static void atualizarAluno() {
        System.out.print("Digite o CPF do aluno que deseja atualizar: ");
        String cpfDigitado = sc.nextLine();
        Aluno alunoParaAtualizar = null;
        for (Aluno aluno : listaDeAlunos) {
            if (aluno.getCpf().equals(cpfDigitado)) {
                alunoParaAtualizar = aluno;
                break;
            }
        }
        if (alunoParaAtualizar != null) {
            int option;
            do {
                System.out.printf("""
                        ° Nome: %s
                        ° CPF: %s
                        ° Matrícula: %s
                        """, alunoParaAtualizar.getNome(), alunoParaAtualizar.getCpf(), alunoParaAtualizar.getMatricula());
                System.out.println("""
                        O que deseja atualizar?
                        Digite 1 para ALTERAR o NOME
                        Digite 2 para ALTERAR a MATRICULA
                        Digite 3 para ALTERAR o CPF
                        Digite 0 para SAIR
                        """);
                option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1:
                        System.out.print("Digite o novo nome: ");
                        alunoParaAtualizar.setNome(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Digite a nova matrícula: ");
                        alunoParaAtualizar.setMatricula(sc.nextLine());
                        break;
                    case 3:
                        System.out.print("Digite o novo CPF: ");
                        alunoParaAtualizar.setCpf(sc.nextLine());
                        break;
                    case 0:
                        System.out.println("...Voltando ao menu...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (option != 0);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
    public static void imprimeListaDeAlunos() {
        System.out.println("LISTA DE ALUNOS:");
        if (listaDeAlunos.isEmpty()) {
            System.out.println("Nenhum aluno registrado.");
        } else {
            for (Aluno aluno : listaDeAlunos) {
                System.out.printf("""
                        | Nome: %s
                        | CPF: %s
                        | Turma: %s
                        | Matrícula: %s
                        |________________\n
                        """, aluno.getNome(), aluno.getCpf(), aluno.getTurma().getNumero(), aluno.getMatricula());
            }
        }
    }
}
