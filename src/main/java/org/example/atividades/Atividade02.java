package org.example.atividades;

import org.example.estruturaDeDados.Pilha;

import java.util.Scanner;

public class Atividade02 {

    public void runAtividade(){
        Scanner scr = new Scanner(System.in);
        Boolean loop = true;

        Pilha pilha = new Pilha();

        System.out.println("----------------------------------------------------");
        System.out.println("Run atividade 02");
        System.out.println("----------------------------------------------------");

        while (loop) {
            Boolean aux = true;
            System.out.println("----------------------------------------------------");
            System.out.println("MENU.");
            System.out.println("----------------------------------------------------");
            System.out.println("[ 1 ] Cadastrar número.");
            System.out.println("[ 2 ] Mostrar números pares entre o primeiro e o último número cadastrado.");
            System.out.println("[ 3 ] Excluir número.");
            System.out.println("[ 0 ] Sair.");

            while (aux) {
                System.out.println("----------------------------------------------------");
                System.out.printf("Digite sua opção:");
                int escolha = scr.nextInt();

                switch (escolha) {
                    case 1:
                        aux = false;
                        System.out.printf("Numero a ser inserido na pilha:");
                        int numero = scr.nextInt();
                        pilha.push(numero);
                        break;

                    case 2:
                        aux = false;
                        System.out.println(" ");
                        System.out.printf("Numero(s) par(es) da pilha:");
                        pilha.printPar();
                        System.out.println(" ");
                        System.out.println(" ");
                        break;

                    case 3:
                        aux = false;
                        System.out.println(" ");
                        System.out.printf("Valor removido da pilha:");
                        System.out.printf(String.valueOf(pilha.peek()));
                        System.out.println(" ");
                        System.out.println(" ");
                        pilha.pop();
                        break;
                    case 0:
                        aux = false;
                        loop = false;
                        break;
                    default:
                        System.out.println("Camando invalido!");
                }
            }

        }
    }
}
