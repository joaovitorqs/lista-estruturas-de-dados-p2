package org.example.atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade05 {
    int idTipoAcressimo = 0;
    int idProdutoAcressimo = 0;

    class Tipo {
        int id;
        String tipo;
        Double imposto;

        public Tipo(String tipo, Double imposto) {
            this.id = ++idTipoAcressimo;
            this.tipo = tipo;
            this.imposto = imposto;
        }

        public int getId() {
            return id;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public Double getImposto() {
            return imposto;
        }

        public void setImposto(Double imposto) {
            this.imposto = imposto;
        }
    }
    class Produto {
        int id;
        Double preco;
        Tipo tipo;

        public Produto(Double preco, Tipo tipo) {
            this.id = ++idProdutoAcressimo;
            this.preco = preco;
            this.tipo = tipo;
        }

        public int getId() {
            return id;
        }

        public Double getPreco() {
            return preco;
        }

        public void setPreco(Double preco) {
            this.preco = preco;
        }

        public Tipo getTipo() {
            return tipo;
        }

        public void setTipo(Tipo tipo) {
            this.tipo = tipo;
        }
    }

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
