package org.example.atividades;

import org.example.estruturaDeDados.Fila;
import org.example.estruturaDeDados.Pilha;

import java.util.Scanner;

public class Atividade03 {
    private int contadorId = 0;

    class Aluno {
        Integer id;
        String nome;
        Fila notas;

        public Aluno(String nome) {
            this.id = ++contadorId;
            this.nome = nome;
            this.notas = new Fila<Double>();
        }

        public void addNota(Double nota) {
            this.notas.enqueue(nota);
        }

        public void removeNota() {
            this.notas.dequeue();
        }

        public Double mediaNota() {
            return this.notas.totalValue() / this.notas.size();
        }
    }

    Pilha<Aluno> alunos = new Pilha<>();

    public void runAtividade() {
        Scanner scr = new Scanner(System.in);
        Boolean loop = true;

        System.out.println("----------------------------------------------------");
        System.out.println("Run atividade 03");
        System.out.println("----------------------------------------------------");

        while (loop) {
            Boolean aux = true;
            System.out.println("----------------------------------------------------");
            System.out.println("MENU.");
            System.out.println("----------------------------------------------------");
            System.out.println("[ 1 ] Cadastrar aluno.");
            System.out.println("[ 2 ] Cadastrar nota.");
            System.out.println("[ 3 ] Calcular media de um aluno.");
            System.out.println("[ 4 ] Listar os nomes dos alunos sem notas.");
            System.out.println("[ 5 ] Excluir aluno.");
            System.out.println("[ 6 ] Excluir nota.");
            System.out.println("[ 0 ] Sair.");

            while (aux) {
                System.out.println("----------------------------------------------------");
                System.out.printf("Digite sua opção:");
                int escolha = scr.nextInt();

                switch (escolha) {
                    case 1:
                        aux = false;
                        System.out.println(" ");
                        System.out.printf("Digite o nome do aluno:");
                        Integer id = alunos.size() + 1;
                        String nome = scr.next();
                        alunos.push(new Aluno(nome));
                        System.out.println(" ");
                        System.out.println("Aluno cadastrado: ID " + alunos.peek().id + ", nome " + alunos.peek().nome);
                        System.out.println(" ");
                        break;

                    case 2:
                        aux = false;
                        System.out.println(" ");
                        System.out.printf("Digite ID do aluno:");
                        Integer idAluno = scr.nextInt();
                        System.out.printf("Digite a nota do aluno:");
                        Double nota = scr.nextDouble();
                        break;

                    case 3:
                        aux = false;

                        break;
                    case 4:
                        aux = false;

                        break;
                    case 5:
                        aux = false;

                        break;
                    case 6:
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

        }
    }
}
