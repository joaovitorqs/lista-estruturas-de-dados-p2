package org.example.atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade05 {

    public void runAtividade(){
        Scanner scr = new Scanner(System.in);
        Boolean loop = true;

        System.out.println("----------------------------------------------------");
        System.out.println("Run atividade 05");
        System.out.println("----------------------------------------------------");

        while (loop) {
            Boolean aux = true;
            System.out.println("----------------------------------------------------");
            System.out.println("MENU.");
            System.out.println("----------------------------------------------------");
            System.out.println("[ 1 ] Cadastrar tipo.");
            System.out.println("[ 2 ] Cadastrar produto.");
            System.out.println("[ 3 ] Consultar o preço de um produto.");
            System.out.println("[ 4 ] Excluir tipo.");
            System.out.println("[ 0 ] Sair.");

            try {
                while (aux) {
                    System.out.println("----------------------------------------------------");
                    System.out.printf("Digite sua opção:");
                    int escolha = scr.nextInt();

                    switch (escolha) {
                        case 1:
                            aux = false;

                            break;
                        case 2:
                            aux = false;

                            break;
                        case 3:
                            aux = false;

                            break;
                        case 4:
                            aux = false;

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
    }
}
