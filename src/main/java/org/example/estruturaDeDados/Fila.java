package org.example.estruturaDeDados;

public class Fila {

    private Node inicio;
    private Node fim;

    public Fila() {
    }

    public void enqueue(int valor) {

        Node novo = new Node(valor);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
            return;
        }

        fim.proximo = novo;
        fim = novo;
    }

    public int dequeue() {

        if (inicio == null) {
            throw new RuntimeException("Fila vazia");
        }

        int valor = inicio.valor;

        inicio = inicio.proximo;

        if (inicio == null) {
            fim = null;
        }

        return valor;
    }

    public int peek() {
        if (inicio == null) {
            throw new RuntimeException("Fila vazia: não há elementos para visualizar.");
        }
        return inicio.valor;
    }

    public void print() {
        Node atual = inicio;

        while (atual != null) {
            System.out.printf(atual.valor + " ");
            atual = atual.proximo;
        }
    }

    class Node {

        int valor;
        Node proximo;

        public Node(int valor) {
            this.valor = valor;
        }
    }
}

