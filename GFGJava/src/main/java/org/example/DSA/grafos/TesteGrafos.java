package org.example.DSA.grafos;

public class TesteGrafos {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<>();
        grafo.adicionarVertice("João");
        grafo.adicionarVertice("Maria");
        grafo.adicionarVertice("Larissa");
        grafo.adicionarVertice("Felipe");
        grafo.adicionarVertice("Francisco");

        grafo.adicionarAresta(2.0, "João", "Maria");
        grafo.adicionarAresta(2.0, "Maria", "Larissa");
        grafo.adicionarAresta(2.0, "Larissa", "Felipe");
        grafo.adicionarAresta(2.0, "João", "Felipe");
        grafo.adicionarAresta(2.0, "Francisco", "João");
        grafo.adicionarAresta(2.0, "Francisco", "Maria");

        grafo.buscaEmLargura(4);
    }
}
