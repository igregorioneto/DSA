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

    public Elemento<T> getRaiz() {
        return raiz;
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

    /*
    * Imprimindo os valores em ordem crescente
    * @param Elemento<T> atual que a partir dele virá a ordem
    * */
    public void emOrdem(Elemento<T> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.print(atual.getValor() + " ");
            emOrdem(atual.getDireita());
        }
    }

    /*
     * Imprimindo os valores em ordem decrescente
     * @param Elemento<T> atual que a partir dele virá a ordem
     * */
    public void emOrdemDecrescente(Elemento<T> atual) {
        if (atual != null) {
            emOrdemDecrescente(atual.getDireita());
            System.out.print(atual.getValor() + " ");
            emOrdemDecrescente(atual.getEsquerda());
        }
    }


    /*
     * Imprimindo primeiro a raíz da árvore para depois as folhas
     * @param Elemento<T> atual que a partir dele virá a ordem
     * */
    public void preOrdem(Elemento<T> atual) {
        if (atual != null) {
            System.out.print(atual.getValor() + " ");
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
    }


    /*
     * Imprimindo primeiro as folhas para depois a raiz
     * @param Elemento<T> atual que a partir dele virá a ordem
     * */
    public void posOrdem(Elemento<T> atual) {
        if (atual != null) {
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.print(atual.getValor() + " ");
        }
    }
}
