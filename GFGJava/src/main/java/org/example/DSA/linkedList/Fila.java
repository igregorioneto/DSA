package org.example.DSA.linkedList;

public class Fila {
    private LinkedList list;

    public Fila() {
        this.list = new LinkedList();
    }

    public void adicionar(String value) {
        this.list.adicionar(value);
    }

    public void remover() {
        this.list.remover(this.get());
    }

    public String get() {
        return this.list.getPrimeiro().getValor();
    }
}
