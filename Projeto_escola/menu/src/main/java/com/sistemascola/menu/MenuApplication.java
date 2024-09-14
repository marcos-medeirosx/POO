package com.sistemascola.menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MenuApplication {
    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class, args);
        Aluno pedro = new Aluno();
        pedro.setNome("Pedro");
        Turma turma1 = new Turma(1, "202");
        Turma turma2 = new Turma(2, "203");
        Turma.listaDeTurmas.add(turma1);
        Turma.listaDeTurmas.add(turma2);
        MenuEscola.diretor();
    }
}
