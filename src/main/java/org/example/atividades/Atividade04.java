package org.example.atividades;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Atividade04 {
    public void runAtividade() {
        Scanner scr = new Scanner(System.in);
        boolean aux = true;

        Stack<Integer> pilha = new Stack();
        Queue<Integer> filaPar = new java.util.LinkedList<>();
        Queue<Integer> filaImpar = new java.util.LinkedList<>();

        System.out.println("----------------------------------------------------");
        System.out.println("Run atividade 04");
        System.out.println("----------------------------------------------------");

        while (aux) {
            System.out.printf("Digite um valor inteiro positivo para ser inserido na pilha:");
            int valor = scr.nextInt();
            if (valor <= 0) {
                System.out.println("Pilha encerrada.");
                aux = false;
            } else {
                pilha.push(valor);
            }
        }
        for (Integer valor : pilha) {
            if (valor % 2 == 0) {
                filaPar.add(valor);
            } else {
                filaImpar.add(valor);
            }
        }
        if (filaPar.isEmpty() == false) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.printf("Valores pares da fila: ");
            for (Integer valor : filaPar) {
                System.out.printf(valor+" ");
            }
        } else {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Não há valores pares na fila!");
        }

        if (filaImpar.isEmpty() == false) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.printf("Valores ímpares da fila: ");
            for (Integer valor : filaImpar) {
                System.out.printf(valor+" ");
            }
        } else {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Não há valores ímpares na fila!");
        }
        System.out.println(" ");
    }
}
