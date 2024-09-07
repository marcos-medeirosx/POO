package com.lista.lista2;

import java.util.Scanner;

public class Exercicio_3 {
    public static void resolucao() {

        /*3) Um banco contratou você para que escreva um programa que será utilizado
        pelo usuário em um tablet. O programa irá fazer 3 perguntas e encaminhar o
        cliente para 2 filas. A fila comum e a fila preferencial. Se o cliente atender a uma
        das condições a seguir ele deve ser encaminhado para a fila preferencial. As
        condições são: Ter mais de 65 anos, se deficiente ou gestante */

        int idade;
        String gestanteResposta;
        String deficienteResposta;

    
        System.out.println("Informe a sua idade: ");
        Scanner scanner = new Scanner(System.in);
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Está gestante? (sim/não) ");
        gestanteResposta = scanner.nextLine();
        
        
        System.out.println("Possui alguma deficiência? (sim/não)");
        deficienteResposta = scanner.nextLine();
       

        if (idade > 65 || gestanteResposta.equals("sim") || deficienteResposta.equals("sim") ) {
            System.out.println("Fila preferencial");

           } else { System.out.print("Fila comum");
                
            }
            
            scanner.close();

        }

    }