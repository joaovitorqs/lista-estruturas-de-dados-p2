package org.example.atividades;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
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

    public void runAtividade() {
        Scanner scr = new Scanner(System.in);
        Boolean loop = true;

        Queue<Tipo> tipos = new LinkedList<>();
        Queue<Produto> produtos = new LinkedList<>();

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
                            System.out.println(" ");
                            System.out.printf("Digite o tipo [A,B,C...]:");
                            scr.nextLine();
                            String auxTipo = scr.nextLine();
                            System.out.println(" ");
                            System.out.printf("Digite o imposto para o tipo " + auxTipo + " [Ex 0,05]:");
                            double auxImposto = scr.nextDouble();
                            Tipo tipo = new Tipo(auxTipo, auxImposto);
                            tipos.add(tipo);
                            break;
                        case 2:
                            aux = false;
                            System.out.println(" ");
                            System.out.printf("Digite o preço: ");
                            double auxPreco = scr.nextDouble();
                            scr.nextLine();
                            System.out.printf("Digite o tipo:");
                            String auxTipoProduto = scr.nextLine();

                            boolean encontrado02 = false;
                            for (Tipo tipo1 : tipos) {
                                if (tipo1.getTipo().equals(auxTipoProduto)) {
                                    produtos.add(new Produto(auxPreco, tipo1));
                                    encontrado02 = true;
                                }
                            }
                            if (!encontrado02) {
                                System.out.println(" ");
                                System.out.printf("Tipo de produto inexistente!");
                                System.out.println(" ");
                            }
                            break;
                        case 3:
                            aux = false;
                            System.out.println(" ");
                            System.out.printf("Digite o ID do produto: ");
                            int auxId = scr.nextInt();

                            boolean encontrado03 = false;
                            for (Produto produto : produtos) {
                                if (produto.getId() == auxId) {
                                    Double valorCalculado = produto.getPreco() - (produto.getPreco() * produto.getTipo().getImposto());
                                    System.out.println("Preço = " + valorCalculado);
                                    encontrado03 = true;
                                }
                            }
                            if (!encontrado03) {
                                System.out.println(" ");
                                System.out.printf("Produto inexistente!");
                                System.out.println(" ");
                            }
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
