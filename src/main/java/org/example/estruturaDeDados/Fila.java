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

    public int size() {
        int count = 0;
        Node atual = inicio;

        while (atual != null) {
            count++;
            atual = atual.proximo;
        }

        return count;
    }
    public double totalValue() {
        double total = 0.0;
        Node atual = inicio;

        while (atual != null) {
            total += atual.valor;
            atual = atual.proximo;
        }

        return total;
    }

    class Node {

        int valor;
        Node proximo;

        public Node(int valor) {
            this.valor = valor;
        }
    }
}

