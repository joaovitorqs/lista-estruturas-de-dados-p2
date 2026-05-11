package org.example.estruturaDeDados;

public class Pilha<T> {

    private Node topo;

    public void push(T valor) {

        Node novo = new Node(valor);

        novo.proximo = topo;
        topo = novo;
    }

    public T pop() {

        if (topo == null) {
            throw new RuntimeException("Pilha vazia");
        }

        T valor = topo.valor;

        topo = topo.proximo;

        return valor;
    }

    public T peek() {

        if (topo == null) {
            throw new RuntimeException("Pilha vazia");
        }

        return topo.valor;
    }

    public boolean vazia() {
        return topo == null;
    }

    public void print() {

        Node atual = topo;

        while (atual != null) {

            System.out.print(atual.valor + " ");

            atual = atual.proximo;
        }
    }

    public int size() {

        int count = 0;

        Node atual = topo;

        while (atual != null) {

            count++;

            atual = atual.proximo;
        }

        return count;
    }

    public void printPar() {

        Node atual = topo;

        while (atual != null) {

            if (atual.valor instanceof Integer) {

                Integer valor = (Integer) atual.valor;

                if (valor % 2 == 0) {
                    System.out.print(valor + " ");
                }
            }

            atual = atual.proximo;
        }
    }

    class Node {

        T valor;
        Node proximo;

        public Node(T valor) {
            this.valor = valor;
        }
    }
}
