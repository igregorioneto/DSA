package org.example.DSA.arvore.study;


/*
* Classe para testar e instanciar Objetos do TIPO Arvore
*
* @author Greg
* @version 1.0
* @since 2023-11-30
* */
public class TesteArvoreBinaria {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<>();
        arvore.adicionar(10);
        arvore.adicionar(8);
        arvore.adicionar(5);
        arvore.adicionar(9);
        arvore.adicionar(7);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(20);

        System.out.println("Em Ordem Crescente");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println("\n\nEm Ordem Decrescente");
        arvore.emOrdemDecrescente(arvore.getRaiz());

        System.out.println("\n\nPré Ordem");
        arvore.preOrdem(arvore.getRaiz());

        System.out.println("\n\nPós Ordem");
        arvore.posOrdem(arvore.getRaiz());
    }
}
