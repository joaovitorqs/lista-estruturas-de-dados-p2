package org.example;

import org.example.atividades.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        Atividade01 atividade01 = new Atividade01();
        Atividade02 atividade02 = new Atividade02();
        Atividade03 atividade03 = new Atividade03();
        Atividade04 atividade04 = new Atividade04();
        Atividade05 atividade05 = new Atividade05();


        Boolean loop = true;

        System.out.println("----------------------------------------------------");
        System.out.println("Lista de atividade - Estrutura de dados P2");
        System.out.println("----------------------------------------------------");
        System.out.println(" ");

        while (loop) {
            Boolean aux = true;
            System.out.println("----------------------------------------------------");
            System.out.println("Selecione qual das atividades abaixo deseja rodar.");
            System.out.println("----------------------------------------------------");
            System.out.println("[ 1 ] Atividade 01.");
            System.out.println("[ 2 ] Atividade 02.");
            System.out.println("[ 3 ] Atividade 03.");
            System.out.println("[ 4 ] Atividade 04.");
            System.out.println("[ 5 ] Atividade 05.");
            System.out.println("[ 0 ] Fechar o programa.");

            try {
                while (aux) {
                    System.out.println("----------------------------------------------------");
                    System.out.printf("Digite sua opção:");
                    int escolha = scr.nextInt();

                    switch (escolha) {
                        case 1:
                            aux = false;
                            atividade01.runAtividade();
                            break;

                        case 2:
                            aux = false;
                            atividade02.runAtividade();
                            break;

                        case 3:
                            aux = false;
                            atividade03.runAtividade();
                            break;
                        case 4:
                            aux = false;
                            atividade04.runAtividade();
                            break;
                        case 5:
                            aux = false;
                            atividade05.runAtividade();
                            break;
                        case 0:
                            aux = false;
                            loop = false;
                            break;
                        default:
                            System.out.println("Camando invalido!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Comando invalido!");
                scr.nextLine();
            }
        }
        scr.close();
    }
}