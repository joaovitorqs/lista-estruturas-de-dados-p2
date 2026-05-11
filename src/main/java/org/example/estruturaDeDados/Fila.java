package org.example.estruturaDeDados;

public class Fila<T> {

    private Node inicio;
    private Node fim;

    public Fila() {
    }

    public void enqueue(T valor) {

        Node novo = new Node(valor);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
            return;
        }

        fim.proximo = novo;
        fim = novo;
    }

    public T dequeue() {

        if (inicio == null) {
            throw new RuntimeException("Fila vazia");
        }

        T valor = inicio.valor;

        inicio = inicio.proximo;

        if (inicio == null) {
            fim = null;
        }

        return valor;
    }

    public T peek() {

        if (inicio == null) {
            throw new RuntimeException(
                    "Fila vazia: não há elementos para visualizar."
            );
        }

        return inicio.valor;
    }

    public void print() {

        Node atual = inicio;

        while (atual != null) {

            System.out.print(atual.valor + " ");

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

            if (atual.valor instanceof Number) {

                total += ((Number) atual.valor).doubleValue();
            }

            atual = atual.proximo;
        }

        return total;
    }

    class Node {

        T valor;
        Node proximo;

        public Node(T valor) {
            this.valor = valor;
        }
    }
}

