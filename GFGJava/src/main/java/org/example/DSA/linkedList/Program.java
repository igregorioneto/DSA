package org.example.DSA.linkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Último: " + lista.getUltimo().getValor());
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        System.out.println("==================================");
        lista.remover("CE");

        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        System.out.println("==================================");
        System.out.println("=========      FILA     ==========");
        System.out.println("==================================");

        Fila fila = new Fila();
        fila.adicionar("Jão");
        fila.adicionar("Zé");
        fila.adicionar("Juca");
        fila.adicionar("Maria");
        fila.adicionar("Ana");

        System.out.println("Primeiro da fila:" + fila.get());
        fila.remover();
        System.out.println("Novo Primeiro da fila:" + fila.get());
        fila.remover();
        System.out.println("Novo Primeiro da fila:" + fila.get());

        System.out.println("==================================");
        System.out.println("=========     PILHA    ===========");
        System.out.println("==================================");

        Pilha pilha = new Pilha();

        pilha.adicionar("E");
        pilha.adicionar("B");
        pilha.adicionar("Z");
        pilha.adicionar("D");
        pilha.adicionar("C");

        System.out.println("Topo: " + pilha.get());

        pilha.remover();

        System.out.println("Novo Topo: " + pilha.get());

        pilha.remover();

        System.out.println("Novo Topo: " + pilha.get());


        System.out.println("==================================================");
        System.out.println("=========     ITERATOR LISTA LIGADA    ===========");
        System.out.println("==================================================");

        long tempoInicial = System.currentTimeMillis();
        ItaratorListaLigada itaratorListaLigada = lista.getIterator();
        while (itaratorListaLigada.temProximo()) {
            itaratorListaLigada.getProximo();
        }
        long tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura...");
        System.out.println(tempoFinal - tempoInicial);
    }
}
