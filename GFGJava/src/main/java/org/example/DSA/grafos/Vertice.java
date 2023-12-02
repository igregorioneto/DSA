package org.example.DSA.grafos;

import java.util.ArrayList;

public class Vertice<T> {
    private T dado;
    private ArrayList<Aresta<T>> arestasEntradas;
    private ArrayList<Aresta<T>> arestasSaidas;

    public Vertice(T dado) {
        this.dado = dado;
        this.arestasEntradas = new ArrayList<>();
        this.arestasSaidas = new ArrayList<>();
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public ArrayList<Aresta<T>> getArestasEntradas() {
        return arestasEntradas;
    }

    public void setArestasEntradas(ArrayList<Aresta<T>> arestasEntradas) {
        this.arestasEntradas = arestasEntradas;
    }

    public ArrayList<Aresta<T>> getArestasSaidas() {
        return arestasSaidas;
    }

    public void setArestasSaidas(ArrayList<Aresta<T>> arestasSaidas) {
        this.arestasSaidas = arestasSaidas;
    }

    // Adicionando aresta Saída
    public void adicionarArestaSaida(Aresta<T> aresta) {
        arestasSaidas.add(aresta);
    }

    // Adicionando aresta Entrada
    public void adicionarArestaEntrada(Aresta<T> aresta) {
        arestasEntradas.add(aresta);
    }
}
