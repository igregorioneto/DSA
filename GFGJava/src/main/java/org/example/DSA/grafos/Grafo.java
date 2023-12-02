package org.example.DSA.grafos;

import java.util.ArrayList;

public class Grafo<T> {
    private ArrayList<Vertice<T>> vertices;
    private ArrayList<Aresta<T>> arestas;

    public Grafo() {
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }

    public void adicionarVertice(T dado) {
        Vertice<T> vertice = new Vertice<>(dado);
        vertices.add(vertice);
    }

    public void adicionarAresta(Double peso, T dadoInicio, T dadoFim) {
        Vertice<T> inicio = this.getVertice(dadoInicio);
        Vertice<T> fim = this.getVertice(dadoFim);
        Aresta<T> aresta = new Aresta<>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        arestas.add(aresta);
    }

    public Vertice<T> getVertice(T dado) {
        Vertice<T> vertice = null;
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).getDado().equals(dado)){
                vertice = vertices.get(i);
                break;
            }
        }
        return vertice;
    }

    public void buscaEmLargura(int vertice) {
        ArrayList<Vertice<T>> marcados = new ArrayList<>();
        ArrayList<Vertice<T>> fila = new ArrayList<>();
        Vertice<T> atual = this.vertices.get(vertice);
        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        while (fila.size() > 0) {
            Vertice<T> visitado = fila.get(0);
            for (int i = 0; i < visitado.getArestasSaidas().size(); i++) {
                Vertice<T> proximo = visitado.getArestasSaidas().get(i).getFim();
                if (!marcados.contains(proximo)) { // se o vértice ainda não foi marcado
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }
}
