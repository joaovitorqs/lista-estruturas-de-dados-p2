package org.example.atividades;

import org.example.estruturaDeDados.Fila;
import org.example.estruturaDeDados.Pilha;

import java.util.Scanner;

public class Atividade01 {
    Scanner scr = new Scanner(System.in);

    public void runAtividade(){
        System.out.println("----------------------------------------------------");
        System.out.println("Run atividade 01");
        System.out.println("----------------------------------------------------");
        System.out.println("Fila cadastrada nesta ordem {10,20,30,40,50}");
        System.out.println("Pilha cadastrada nesta ordem {10,20,30,40,50}");

        Fila fila = new Fila();
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);
        fila.enqueue(50);

        Pilha pilha = new Pilha();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        System.out.println(" ");
        System.out.println("Relatorio 1");

        fila.print();
        System.out.println(" ");
        System.out.println(" ");
        pilha.print();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Relatorio 2");
        fila.print();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Relatorio 3");
        pilha.print();

        System.out.println(" ");
        System.out.println(" ");

        System.out.printf("Pressione enter para voltar ao menu principal:");
        scr.nextLine();
    }
}
