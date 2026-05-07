package org.example.estruturaDeDados;

public class Pilha {
    private Node topo;

    public void push(int valor) {

        Node novo = new Node(valor);

        novo.proximo = topo;
        topo = novo;
    }

    public int pop() {

        if (topo == null) {
            throw new RuntimeException("Pilha vazia");
        }

        int valor = topo.valor;

        topo = topo.proximo;

        return valor;
    }

    public int peek() {

        if (topo == null) {
            throw new RuntimeException("Pilha vazia");
        }

        return topo.valor;
    }

    public boolean vazia() {
        return topo == null;
    }

    class Node {

        int valor;
        Node proximo;

        public Node(int valor) {
            this.valor = valor;
        }
    }
}
