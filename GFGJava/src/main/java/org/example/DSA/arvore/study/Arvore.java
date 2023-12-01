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

    /*
    * Remove um determinado valor da árvore e reorganizando a mesma
    * @param valor para remover
    * @return boolean para se foi removido ou não
    * */
    public boolean remover(T valor) {
        // Buscando o elemento na árvore
        Elemento<T> atual = getRaiz();
        Elemento<T> paiAtual = null;
        while (atual != null) {
            if (atual.getValor().equals(valor)) {
                break;
8            } else if (valor.compareTo(atual.getValor()) == -1) {
                paiAtual = atual;
                atual = atual.getEsquerda();
            } else {
                paiAtual = atual;
                atual = atual.getDireita();
            }
        }
        // Verifica se existe o elemento
        if (atual != null) {

            // Elemento tem duas folhas ou apenas uma folha a direita
            if (atual.getDireita() != null) {
                Elemento<T> substituto = atual.getDireita();
                Elemento<T> paiSubstituto = atual;
                while(substituto.getEsquerda() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getEsquerda();
                }
                substituto.setEsquerda(atual.getEsquerda());
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerda(substituto);
                    }else{
                        paiAtual.setDireita(substituto);
                    }
                }else{ //se não tem paiAtual, então é a raiz
                    this.raiz = substituto;
                    paiSubstituto.setEsquerda(null);
                    this.raiz.setDireita(paiSubstituto);
                    this.raiz.setEsquerda(atual.getEsquerda());
                }

                //removeu o elemento da árvore
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerda(null);
                }else{
                    paiSubstituto.setDireita(null);
                }
            } else if (atual.getEsquerda() != null){ //tem folha só à esquerda
                Elemento<T> substituto = atual.getEsquerda();
                Elemento<T> paiSubstituto = atual;
                while(substituto.getDireita() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getDireita();
                }
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerda(substituto);
                    }else{
                        paiAtual.setDireita(substituto);
                    }
                }else{ //se for a raiz
                    this.raiz = substituto;
                }

                //removeu o elemento da árvore
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerda(null);
                }else{
                    paiSubstituto.setDireita(null);
                }
            } else{ //não tem folha
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerda(null);
                    }else{
                        paiAtual.setDireita(null);
                    }
                } else{ //é a raiz
                    this.raiz = null;
                }
            }

            return true;
        } else {
            return false;
        }
    }
}
