package org.example.DSA.linkedList;

public class Pilha {
    private LinkedList list;
    public Pilha() {
        this.list = new LinkedList();
    }

    public void adicionar(String valor) {
        this.list.adicionarPilha(valor);
    }

    public void remover() {
        this.list.remover(this.get());
    }

    public String get() {
        return this.list.getPrimeiro().getValor();
    }
}
