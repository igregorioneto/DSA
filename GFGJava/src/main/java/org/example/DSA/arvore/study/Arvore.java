package org.example.DSA.arvore.study;

/*
* Classe da arvore onde vai ter uma propriedade do tipo Elemento<T> que irá realizar as operações
*
* @author Greg
* @version 1.0
* @since 2023-11-30
* */
public class Arvore<T extends Comparable> {
    private Elemento<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    /*
    * Método para adicionar um elemento a uma árvore
    * Ele irá percorrer uma arvore com base no valor passado para poder adicionar
    * o elemento a direita ou a esquerda da raiz da árvore.
    *
    * @param Valor do tipo T
    * */
    public void adicionar(T valor) {
        Elemento<T> novoElemento = new Elemento<>(valor);
        if (raiz == null) {
            this.raiz = novoElemento;
        } else {
            Elemento<T> atual = this.raiz;
            while (true) {
                if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {
                    if (atual.getEsquerda() != null) {
                        atual = atual.getEsquerda();
                    } else {
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                } else {
                    if (atual.getDireita() != null) {
                        atual = atual.getDireita();
                    } else {
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }
}
