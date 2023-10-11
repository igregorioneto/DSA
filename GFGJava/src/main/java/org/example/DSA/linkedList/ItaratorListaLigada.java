package org.example.DSA.linkedList;

public class ItaratorListaLigada {
    private Elemento elemento;

    public ItaratorListaLigada(Elemento elemento) {
        this.elemento = elemento;
    }

    public boolean temProximo() {
        if (elemento.getProximo() == null) {
            return false;
        } else {
            return true;
        }
    }

    public Elemento getProximo() {
        elemento = elemento.getProximo();
        return elemento;
    }
}
